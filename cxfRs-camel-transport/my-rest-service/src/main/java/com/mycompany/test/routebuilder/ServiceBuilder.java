package com.mycompany.test.routebuilder;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.mycompany.test.model.SimpleModel;

public class ServiceBuilder extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:rs-server?bindingStyle=SimpleConsumer")
			.log(LoggingLevel.INFO, "My Server :: Got the request ${headers}")
			.process(new Processor() {
			public void process(final Exchange exchange) throws Exception {
				final String pathParamId = exchange.getIn().getHeader("identifier", String.class);
				exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 
							Response.Status.OK.getStatusCode());
				exchange.getIn().setBody(new SimpleModel("Hello! " + pathParamId));
			}
		});
	}

}
