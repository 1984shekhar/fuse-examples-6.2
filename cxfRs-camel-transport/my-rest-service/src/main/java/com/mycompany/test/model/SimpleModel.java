package com.mycompany.test.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public SimpleModel() {
	}
	
	public SimpleModel(final String message) {
		this();
		this.message = message;
	}
	
	/**
	 * @return the identifier
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public final void setMessage(final String message) {
		this.message = message;
	}
}
