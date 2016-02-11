package com.fuse.sample.processor.hits;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.apache.cxf.headers.Header.Direction;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.GetServicePlanDetailAndSku;
import org.tempuri.ObjectFactory;

public class PrepareBodyForHitsGetServicePlan implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void process(Exchange exchange) throws Exception {

		ObjectFactory objFactory = new ObjectFactory();
		

		GetServicePlanDetailAndSku req = objFactory.createGetServicePlanDetailAndSku();
		req.setClientId(10042);
		req.setPhoneFlag(1);

		String queryString = exchange.getIn().getHeader(Exchange.HTTP_QUERY, String.class);
		 MultivaluedMap<String, String> queryMap = JAXRSUtils.getStructuredParams(queryString, "&", false, false);
		 
		String featureCodeValue = queryMap.getFirst("featureCode");
		String productDescriptionValue = queryMap.getFirst("description");
		//TODO get the path param for client Id
		int clientID = Integer.parseInt(exchange.getIn().getHeader("clientID").toString());
		int phoneFlag = Integer.parseInt(queryMap.getFirst("phoneFlag"));
		
		JAXBElement<String> featureCode = objFactory.createGetServicePlanDetailAndSkuFeatureCode(featureCodeValue);//"TELUS_DC_V2_MRC_700");
		JAXBElement<String> productDescription = objFactory
				.createGetServicePlanDetailAndSkuProductDescription(productDescriptionValue);//"SAMSUNG GS6 BLACK 32GB");

		req.setFeatureCode(featureCode);
		req.setProductDescription(productDescription);

		exchange.getOut().setHeader("UserID", "TestEnrollment1");
		exchange.getOut().setHeader("Password", "N1aqst7*");
		exchange.getOut().setHeader("operationName", "GetServicePlanDetailAndSku");

		// exchange.getOut().setBody(req);

		Object[] data = new Object[4];
		data[0] = clientID;
		data[1] = phoneFlag;
		data[2] = featureCodeValue;
		data[3] = productDescriptionValue;
		exchange.getOut().setBody(data);
		
		
		SoapHeader userNameHeader = new SoapHeader(new QName("http://www.esecuritel.com","nUserID"),"TestEnrollment1", new JAXBDataBinding(String.class));
		SoapHeader userPasswordHeader = new SoapHeader(new QName("http://www.esecuritel.com","nPassword"),"N1aqst7*", new JAXBDataBinding(String.class));
			
			 // You should be able to get the header if exchange is routed from camel-cxf endpoint
	        List<SoapHeader> soapHeaders = CastUtils.cast((List<?>)exchange.getOut().getHeader(Header.HEADER_LIST));
	        if (soapHeaders == null) {
	            // we just create a new soap headers in case the header is null
	            soapHeaders = new ArrayList<SoapHeader>();
	        }
	 
	        //userNameHeader.setMustUnderstand(true);
	        userNameHeader.setDirection(Direction.DIRECTION_OUT);
	       // userPasswordHeader.setMustUnderstand(true);
	        userPasswordHeader.setDirection(Direction.DIRECTION_OUT);
	        
	        //newHeader.setMustUnderstand(false);
	        soapHeaders.add(userNameHeader);
	        soapHeaders.add(userPasswordHeader);
	        
	        exchange.getOut().setBody(data);
	        exchange.getOut().setHeader(Header.HEADER_LIST, soapHeaders);
	        
		  logger.info("*************" + exchange.getOut().getBody());
	}

}
