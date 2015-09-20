package com.mycompany.business.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FTResponse implements Serializable{


	private static final long serialVersionUID = -4606987497386591613L;
	
	private String responseStatus;
	private String contractReference;
	
	private List<ErrorDetail> errorDetail;

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getContractReference() {
		return contractReference;
	}

	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}

	public List<ErrorDetail> getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(List<ErrorDetail> errorDetail) {
		this.errorDetail = errorDetail;
	}
}
