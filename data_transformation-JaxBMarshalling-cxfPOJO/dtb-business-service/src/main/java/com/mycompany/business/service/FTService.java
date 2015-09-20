package com.mycompany.business.service;

import javax.jws.WebService;

import com.mycompany.business.model.FTRequest;
import com.mycompany.business.model.FTResponse;

@WebService
public interface FTService {
	
	public FTResponse postTransaction(FTRequest ftRequest);

}
