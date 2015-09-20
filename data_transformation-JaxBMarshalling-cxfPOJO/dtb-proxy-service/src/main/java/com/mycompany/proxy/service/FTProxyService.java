package com.mycompany.proxy.service;

import com.mycompany.proxy.model.FTProxyRequest;
import com.mycompany.proxy.model.FTProxyResponse;

public interface FTProxyService {
	
	public FTProxyResponse processSwift(FTProxyRequest ftProxyRequest);

}
