package com.mycompany.proxy.service;

import com.mycompany.proxy.model.FTProxyRequest;
import com.mycompany.proxy.model.FTProxyResponse;

public class FTProxyServiceImpl implements FTProxyService {

	@Override
	public FTProxyResponse processSwift(FTProxyRequest ftProxyRequest) {
		System.out.println("######### Reached to FTServiceImpl (PROXY) processSwift() method: " + ftProxyRequest.getBranchCode() + ", " + ftProxyRequest.getSourceCode());
		FTProxyResponse ftResponse = new FTProxyResponse();
		ftResponse.setResponseCode("FT-ED-00009");
		return ftResponse;
	}

}
