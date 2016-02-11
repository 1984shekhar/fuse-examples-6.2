package com.mycompany.webservice.controller;

import https.www_company.GetSecurityTokenResponse.GetSecurityTokenResult;
import https.www_company_net.PSWSAccessSoap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;



public class TestProcessor implements Processor {

	
	
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	    factory.setServiceClass(https.www_company_net.PSWSAccessSoap.class);
	    factory.setAddress("https://hcm611.peoplestreme.net/PS_WSAccess/PS_WSAccess.asmx");
	    factory.getInInterceptors().add(new LoggingInInterceptor());
	    factory.getOutInterceptors().add(new LoggingOutInterceptor());
	    PSWSAccessSoap client = (PSWSAccessSoap) factory.create();

	    GetSecurityTokenResult gstr = client.getSecurityToken("3298", "Welcome3");
	    System.out.println(gstr.getContent());
	
	}

}
