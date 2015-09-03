package com.test.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.salesforce.dto.Book__c;

public class TestProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		Book__c book = new Book__c();
		book.setPrice__c("HEYHEY");
		exchange.getOut().setBody(book);
	}

}
