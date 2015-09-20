package com.mycompany.business.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "arg0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ftBody",
    "ftHeader"
})
public class FTRequest implements Serializable{
	
	private static final long serialVersionUID = 6863419728984040574L;
	@XmlElement(name = "ftHeader")
	private FTHeader ftHeader;
	@XmlElement(name = "ftBody")
	private FTBody ftBody;
	
	public FTHeader getFtHeader() {
		return ftHeader;
	}
	public void setFtHeader(FTHeader ftHeader) {
		this.ftHeader = ftHeader;
	}
	public FTBody getFtBody() {
		return ftBody;
	}
	public void setFtBody(FTBody ftBody) {
		this.ftBody = ftBody;
	}

}
