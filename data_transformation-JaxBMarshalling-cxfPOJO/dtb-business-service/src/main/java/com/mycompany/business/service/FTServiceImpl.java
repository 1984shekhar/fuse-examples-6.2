package com.mycompany.business.service;

import com.mycompany.business.model.FTRequest;
import com.mycompany.business.model.FTResponse;

public class FTServiceImpl implements FTService {

	@Override
	public FTResponse postTransaction(FTRequest ftRequest) {
		System.out.println("######### Reached to FTServiceImpl (BUSINESS) postTransaction() method: " + ftRequest.getFtBody().getBranch() + ", " + ftRequest.getFtHeader().getSourceId());
		FTResponse ftResponse = new FTResponse();
		ftResponse.setResponseStatus("PENDING");
		return ftResponse;
	}
	
	
}
