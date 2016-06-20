/**
 * 
 */
package com.city.connect.beans;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author dalals
 *
 */
//@XmlRootElement
public class MaskVO {

	@FormParam("comments")
	private String comments;
	@FormParam("maskedType")
	private String maskedType;
	@FormParam("maskedTypeValue")
	private String maskedTypeValue;
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the maskedType
	 */
	public String getMaskedType() {
		return maskedType;
	}
	/**
	 * @param maskedType the maskedType to set
	 */
	public void setMaskedType(String maskedType) {
		this.maskedType = maskedType;
	}
	/**
	 * @return the maskedTypeValue
	 */
	public String getMaskedTypeValue() {
		return maskedTypeValue;
	}
	/**
	 * @param maskedTypeValue the maskedTypeValue to set
	 */
	public void setMaskedTypeValue(String maskedTypeValue) {
		this.maskedTypeValue = maskedTypeValue;
	}
	
	
}
