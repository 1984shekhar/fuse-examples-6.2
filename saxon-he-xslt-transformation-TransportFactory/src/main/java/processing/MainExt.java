package processing;

import java.util.ArrayList;
import java.util.List;

import net.sf.saxon.lib.ExtensionFunctionDefinition;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Suggestion how Saxon integrated extension functions could be used _with_ Camel support.
 * 
 * NOTE: THIS CODE DOES NOT RUN! It's only meant as an example!
 * 
 * For a running example showing how to use Saxon extension function _without_ Camel support see class "processing.Main"
 * 
 * For this code to work, Camel-xslt would need a new parameter, e.g. "saxonExtensionFunctions" of type 
 * List<net.sf.saxon.lib.ExtensionFunctionDefinition>.
 * 
 * Camel would then need to register the extension functions with its Saxon TransformerFactory when creating the endpoint.
 */
public class MainExt {
	
	private static final Logger LOG = LoggerFactory.getLogger(MainExt.class);

	public static void main(String[] args) throws Exception {
		// Define my extension functions (note: Saxon requires a class for each function)
		List<ExtensionFunctionDefinition> extensionFunctions = new ArrayList<ExtensionFunctionDefinition>();
		extensionFunctions.add(new MyExtensionFunction1());
		extensionFunctions.add(new MyExtensionFunction2());

		// Register extension functions with Camel
		SimpleRegistry registry = new SimpleRegistry();
		registry.put("extensionFunctions", extensionFunctions);
		CamelContext context = new DefaultCamelContext(registry);

		// Define Route
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("direct:start")
					.to("xslt:transformation/myStyleSheet.xslt?saxon=true&saxonExtensionFunctions=#extensionFunctions");
			}
		});
		
		ProducerTemplate producerTemplate = context.createProducerTemplate();
		context.setTracing(true);
		context.start();
		
		String result = producerTemplate.requestBody("direct:start", "<dummy/>", String.class);
		LOG.info(result);
	}
	
}
