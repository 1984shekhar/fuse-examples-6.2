package com.mycompany.blueprint.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class CamelRouteBuilder extends RouteBuilder {

	private String host;
	
	
	@Override
	public void configure() throws Exception {
		

		from("timer://foo?repeatCount=5").process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				System.out.println("jaggu-->" + host);
			}
		});

		
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
