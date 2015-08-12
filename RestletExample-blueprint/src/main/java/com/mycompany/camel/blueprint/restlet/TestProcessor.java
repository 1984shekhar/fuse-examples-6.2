package com.mycompany.camel.blueprint.restlet;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class TestProcessor implements Processor{

	private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("received [" + exchange.getIn().getBody()
	                + "] as an order id = "
	                + exchange.getIn().getHeader("id"));
		 exchange.getOut().setBody(
	                "received [" + exchange.getIn().getBody()
	                + "] as an order id = "
	                + exchange.getIn().getHeader("id"));
		
	}

}
