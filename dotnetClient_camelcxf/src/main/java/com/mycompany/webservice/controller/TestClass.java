package com.mycompany.webservice.controller;

import java.net.MalformedURLException;
import java.net.URL;

import https.www_company.GetSecurityTokenResponse.GetSecurityTokenResult;
import https.www_company_net.PSWSAccess;
import https.www_company_net.PSWSAccessSoap;



public class TestClass {
	
	public static void main(String args[]) throws MalformedURLException {
		
		PSWSAccess pswsAccess = new PSWSAccess(new URL("https://hcm611.peoplestreme.net/PS_WSAccess/PS_WSAccess.asmx?wsdl"));
		PSWSAccessSoap access = pswsAccess.getPSWSAccessSoap();
		GetSecurityTokenResult getSecurityTokenResult = access.getSecurityToken("123", "HELLO");
		System.out.println(getSecurityTokenResult.getContent());

	}

}
