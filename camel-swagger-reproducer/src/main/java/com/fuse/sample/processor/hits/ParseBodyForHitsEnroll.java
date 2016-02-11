package com.fuse.sample.processor.hits;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.datacontract.schemas._2004._07.integrationservice.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParseBodyForHitsEnroll implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("*************"+exchange.getIn().getBody());
		Result result = (Result) exchange.getIn().getBody(Result.class);
		
		//TODO process the below response and convert this to InsuranceEnrollResponseBO
		logger.info("*************"+result.getCode()+"\t"+result.getMessage()+"\t"+result.getTimeStamp());	
		
	}

}
