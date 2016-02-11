package com.fuse.sample.processors.flex;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.model.BuybackConditionsResponseBO;
import io.swagger.model.PhoneConditionType;

public class ParseBodyForFlex implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("*************"+exchange.getIn().getBody().toString());
		logger.info("*************"+exchange.getIn().getBody().toString());
		
		List<PhoneConditionType> phoneConditions = new ArrayList<PhoneConditionType>();
		PhoneConditionType phoneType = new PhoneConditionType();
		phoneType.setCompanyID("4");
		phoneType.setConditionDescription("cond_desc");
		phoneType.setConditionID("cond_id");
		phoneType.setConditionName("cond_name");
			
		
		phoneConditions.add(phoneType);
			
		
		BuybackConditionsResponseBO response = new BuybackConditionsResponseBO();
			response.setConditions(phoneConditions);
		
		exchange.getOut().setBody(response);
		
		
	}

}
