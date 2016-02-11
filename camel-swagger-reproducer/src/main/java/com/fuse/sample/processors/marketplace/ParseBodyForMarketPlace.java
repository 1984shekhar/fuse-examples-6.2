package com.fuse.sample.processors.marketplace;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.model.OrderResponseBO;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderResponse;

public class ParseBodyForMarketPlace implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("*************"+exchange.getIn().getBody().toString());
		logger.info("*************"+exchange.getIn().getBody().toString());

		//TODO process the below response object of type MPOrderResponse and convert this to OrderResponseBO
		MPOrderResponse responseObject = exchange.getIn().getBody(MPOrderResponse.class);

		
		OrderResponseBO response = new OrderResponseBO();
			response.setCatalogID("cat_id");
		exchange.getOut().setBody(response);
		
		
	}

}
