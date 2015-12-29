package com.mycompany.camel.blueprint.javaDsl;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
	Logger LOGGER = Logger.getLogger(this.getClass());
	@Override
    public void configure() {
		getContext().getProperties().put("CamelJettyTempDir", "/home/cpandey/testFolder");
        System.out.println("......Inside MyRouteBuilder.....");
        from("jetty://http://0.0.0.0:9999/ConnectivityService/bandwidthTestUpload")
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				LOGGER.info("Inside Process..."+exchange.getIn().getAttachments().size());
				Message message = exchange.getIn();
				LOGGER.info("Message Body:"+message.getBody(String.class));//Log output I can see the message with attachments 
				LOGGER.info("Att:"+message.getAttachments()); //Log output is:: Att:{}									
			}
		});
}
}