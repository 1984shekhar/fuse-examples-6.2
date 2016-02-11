package com.fuse.sample.processors.flex;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.GetServicePlanDetailAndSku;
import org.tempuri.ObjectFactory;

public class PrepareBodyForFlex implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void process(Exchange exchange) throws Exception {

	ObjectFactory objFactory = new ObjectFactory();
		
		GetServicePlanDetailAndSku req = objFactory.createGetServicePlanDetailAndSku();
		req.setClientId(10042);
		req.setPhoneFlag(1);

		
		String companyID = (String)exchange.getIn().getHeader("companyID");
		String shopID = (String)exchange.getIn().getHeader("shopID");
		String phoneModelID = (String)exchange.getIn().getHeader("phoneModelID");
		String locationID  = (String)exchange.getIn().getHeader("locationID ");
		
		
		logger.debug("********* Got the data from request ************ companyID "+companyID+" shopId "+shopID+" phoneModelID "+phoneModelID+" locationID "+locationID);
		

	}

}
