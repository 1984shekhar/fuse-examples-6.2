package com.mycompany.webservice.controller;

import com.mycompany.webservice.model.GetSecurityToken;
import com.mycompany.webservice.model.GetSecurityTokenResponse;

public interface CompanyService {
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public GetSecurityTokenResponse getToken( GetSecurityToken input );
	
}
