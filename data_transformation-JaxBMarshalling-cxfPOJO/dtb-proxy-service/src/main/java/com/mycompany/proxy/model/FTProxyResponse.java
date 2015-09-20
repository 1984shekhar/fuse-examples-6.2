package com.mycompany.proxy.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FTProxyResponse {

	private String responseCode;
	private String responseDescription;
	
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	
	
	
}
