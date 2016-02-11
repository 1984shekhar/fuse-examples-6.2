package com.mycompany.webservice.controller;

import com.mycompany.webservice.model.GetSecurityToken;
import com.mycompany.webservice.model.GetSecurityTokenResponse;

public class CompanyProcessor {
	
	public GetSecurityTokenResponse getToken( GetSecurityToken input ) {
		
		GetSecurityTokenResponse output = new GetSecurityTokenResponse();
		
		output.getToken();
		return output;
	}
}
