package com.fuse.sample.processor.hits;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.apache.cxf.headers.Header.Direction;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipment;
import org.datacontract.schemas._2004._07.integrationservice.ChannelInformation;
import org.datacontract.schemas._2004._07.integrationservice.Customer;
import org.datacontract.schemas._2004._07.integrationservice.Equipment;
import org.datacontract.schemas._2004._07.integrationservice.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tempuri.Enroll;

public class PrepareBodyForHitsEnroll implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void process(Exchange exchange) throws Exception {

		
		org.tempuri.ObjectFactory elementObjectFactory = new org.tempuri.ObjectFactory();
		ObjectFactory objFactory = new ObjectFactory(); 
		
		
		//Create channel information
		ChannelInformation channel = objFactory.createChannelInformation();
		//	channel.setAgent(objFactory.createChannelInformationAgent(""));
			channel.setChannelType(4);
			channel.setClientId(10042);
			//channel.setLocationCode(value);
			//channel.setNote(objFactory.createChannelInformationNote(null));
			channel.setNoteLocaleId(4105);
			
		//Create customer	
		Customer customer = objFactory.createCustomer();
			customer.setAccountNumber("a1234");
			customer.setAccountType(1);
			customer.setAddress1("3777 KINGSWAY");
			customer.setCity("BURNABY");
			customer.setCountryCode("CAN");
			customer.setEmail("rhammonds@esecuritel.com");
			customer.setFirstName("John");
			customer.setLastName("Smith");
			customer.setMasterSubscriberNumber("4954PUF160117151111");
			customer.setPostalCode("V5H3Z7");
			customer.setPreferredLocaleId(4105);
			customer.setStateCode("CA-BC");

		//Create equipment
		Equipment equipment = objFactory.createEquipment();
			equipment.setEquipmentActivationDate("2016-01-18");
			equipment.setEquipmentCondition(1);
			equipment.setEquipmentPurchaseDate("2016-01-18");
			equipment.setPhoneNumber("1111112474");
			equipment.setSerialNumber("351559070251114");
			equipment.setServiceActivationDate("2016-01-18");
			equipment.setServicePlanId(148);
			equipment.setSku("704-CN-24-GS6 32 BK");
			
		ArrayOfEquipment equipmentArray = objFactory.createArrayOfEquipment();
			equipmentArray.getEquipment().add(equipment);
		
			
		//create payment
		//Payment pmt = objFactory.createPayment();
			
			
		Enroll enrol = elementObjectFactory.createEnroll();
			enrol.setChannelInformation(elementObjectFactory.createEnrollChannelInformation(channel));
			enrol.setCustomer(elementObjectFactory.createEnrollCustomer(customer));
			enrol.setEquipment(elementObjectFactory.createEnrollEquipment(equipmentArray));
		//	enrol.setPayment(value);
			
			
			
		
		
		//Setting the common details

		exchange.getOut().setHeader("UserID", "TestEnrollment1");
		exchange.getOut().setHeader("Password", "N1aqst7*");
		exchange.getOut().setHeader("operationName", "Enroll");

		// exchange.getOut().setBody(req);

		Object[] data = new Object[4];
		data[0] = customer;
		data[1] = equipmentArray;
		data[2] = null;
		data[3] = channel;
		
		
		//List<SoapHeader> headers = new ArrayList<SoapHeader>();
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
		  //logger.info("*************" + exchange.getIn().getBody().toString());
		 
	}

}

