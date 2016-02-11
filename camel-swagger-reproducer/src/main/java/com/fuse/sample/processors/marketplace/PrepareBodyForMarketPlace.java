package com.fuse.sample.processors.marketplace;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jaxb.marketplace.com.brightstar.marketplace.svcs.ArrayOfMPOrderReserve;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPCustomerAddress;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrder;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderRequest;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPOrderReserve;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPPart;
import jaxb.marketplace.com.brightstar.marketplace.svcs.MPRequestHeader;
import jaxb.marketplace.com.brightstar.marketplace.svcs.ObjectFactory;
import jaxb.marketplace.com.brightstar.marketplace.svcs.ReserveActionType;
import jaxb.marketplace.com.brightstar.marketplace.svcs.ShipType;

public class PrepareBodyForMarketPlace implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void process(Exchange exchange) throws Exception {

	ObjectFactory objFactory = new ObjectFactory();
	
	MPRequestHeader requerstHeader =  objFactory.createMPRequestHeader();
		requerstHeader.setSecurityToken("0973da81-eca7-4fa5-b11b-881d6e2d520d");
		requerstHeader.setLocationAppID(6838);
		
	MPCustomerAddress customerAddress = objFactory.createMPCustomerAddress();
		customerAddress.setFirstName("Vin");
		customerAddress.setLastName("Kris");
		customerAddress.setAddressLine1("2958 185th Street");
		customerAddress.setAddressLine2("Apt B");
		customerAddress.setCity("Gurnee");
		customerAddress.setStateCode("IL");
		customerAddress.setPostalCode("60438");
		customerAddress.setCountryCode("USA");
		customerAddress.setPhoneNumber("7343232345");
		customerAddress.setEmailAddress("someone@somewhere.com");
	
	MPPart part = objFactory.createMPPart();
		part.setCustomerPartNumber("1200518");
	
	MPOrderReserve reserve = objFactory.createMPOrderReserve();
		reserve.setCustomerLineReference("1");
		reserve.setReserveNeeded(false);
		reserve.setQuantityRequested(1);
		reserve.setActionType(ReserveActionType.ADD);
		reserve.setPart(part);
		
	ArrayOfMPOrderReserve reserveArray = objFactory.createArrayOfMPOrderReserve();
	List<MPOrderReserve> reserveList  = reserveArray.getMPOrderReserve();

	reserveList.add(reserve);
	
	
		
	MPOrder order = objFactory.createMPOrder ();
		order.setCustomerAddress(customerAddress);
		order.setCustomerPOReference("BSGWC1");
		order.setOrderShipType(ShipType.UPS_GROUND);
		order.setOrderReserveList(reserveArray);
	
	MPOrderRequest request = objFactory.createMPOrderRequest();
		request.setRequestHeader(requerstHeader);
		request.setRequestObject(order);
		
		exchange.getOut().setHeader("operationName", "CreateAndConfirmOrder");
		exchange.getOut().setBody(request);
		exchange.getOut().setHeader(Exchange.HTTP_METHOD, "post");
	
		exchange.getIn().setHeader("operationName", "CreateAndConfirmOrder");
		exchange.getIn().setBody(request);
		exchange.getIn().setHeader(Exchange.HTTP_METHOD, "post");

		/*CamelContext context = exchange.getContext();

		CxfEndpoint cxfEndpoint = new CxfEndpoint( );
		
			cxfEndpoint.setAddress("https://uat.marketplace.oms.webservices.brightstarcorp.com/OrderManagementService.asmx");
			cxfEndpoint.setServiceClass(OrderManagementServiceSoap.class);
			cxfEndpoint.setCamelContext( context );
			cxfEndpoint.setDefaultOperationName("CreateAndConfirmOrderResult");
			cxfEndpoint.setExchangePattern( ExchangePattern.InOut);
			
			context.addEndpoint("https://uat.marketplace.oms.webservices.brightstarcorp.com/OrderManagementService.asmx", cxfEndpoint);
		ProducerTemplate producerTemplate = context.createProducerTemplate();
		producerTemplate.send(cxfEndpoint, exchange);*/
		
	}

}
