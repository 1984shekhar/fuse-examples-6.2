package processing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;

import net.sf.saxon.Configuration;
import net.sf.saxon.TransformerFactoryImpl;
import net.sf.saxon.lib.ExtensionFunctionDefinition;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Shows how to use Saxon extension function _without_ Camel support by manually configuring 
 * the Saxon TransformerFactory implementation.
 * 
 * See class "processing.MainExt" for a suggestion how the same functionality could look _with_ Camel support
 */
public class Main {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		// Define my extension functions (note: Saxon requires a class for each function)
		List<ExtensionFunctionDefinition> extensionFunctions = new ArrayList<ExtensionFunctionDefinition>();
		extensionFunctions.add(new MyExtensionFunction1());
		extensionFunctions.add(new MyExtensionFunction2());
		
		// Register extension functions
		TransformerFactoryImpl extendedSaxonTransformerFactory = new TransformerFactoryImpl();
		Configuration configuration = extendedSaxonTransformerFactory.getConfiguration();
		for ( ExtensionFunctionDefinition func : extensionFunctions ) {
			configuration.registerExtensionFunction(func);
		}

		// Enable secure processing (note: secure processing allows use of Saxon integrated extension functions as opposed to reflective extension functions)  
		extendedSaxonTransformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

		// Register transformer factory on Camel
		SimpleRegistry registry = new SimpleRegistry();
		registry.put("extendedSaxonTransformerFactory", extendedSaxonTransformerFactory);
		CamelContext context = new DefaultCamelContext(registry);

		// Define Route
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("direct:start")
					.to("xslt:transformation/myStyleSheet.xslt?transformerFactory=#extendedSaxonTransformerFactory");
			}
		});
		
		ProducerTemplate producerTemplate = context.createProducerTemplate();
		context.setTracing(true);
		context.start();
		
		String result = producerTemplate.requestBody("direct:start", "<dummy/>", String.class);
		LOG.info("Results are: "+result);
	}

}
