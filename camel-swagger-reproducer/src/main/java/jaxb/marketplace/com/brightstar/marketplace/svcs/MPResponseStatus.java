
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPResponseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPResponseStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponseStatus" type="{http://svcs.marketplace.brightstar.com/}Status"/&gt;
 *         &lt;element name="Info" type="{http://svcs.marketplace.brightstar.com/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPError" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPResponseStatus", propOrder = {
    "responseStatusMessage",
    "responseStatusID",
    "responseStatus",
    "info",
    "errors"
})
public class MPResponseStatus {

    @XmlElement(name = "ResponseStatusMessage")
    protected String responseStatusMessage;
    @XmlElement(name = "ResponseStatusID")
    protected int responseStatusID;
    @XmlElement(name = "ResponseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected Status responseStatus;
    @XmlElement(name = "Info")
    protected ArrayOfString info;
    @XmlElement(name = "Errors")
    protected ArrayOfMPError errors;

    /**
     * Gets the value of the responseStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatusMessage() {
        return responseStatusMessage;
    }

    /**
     * Sets the value of the responseStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatusMessage(String value) {
        this.responseStatusMessage = value;
    }

    /**
     * Gets the value of the responseStatusID property.
     * 
     */
    public int getResponseStatusID() {
        return responseStatusID;
    }

    /**
     * Sets the value of the responseStatusID property.
     * 
     */
    public void setResponseStatusID(int value) {
        this.responseStatusID = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setResponseStatus(Status value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setInfo(ArrayOfString value) {
        this.info = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPError }
     *     
     */
    public ArrayOfMPError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPError }
     *     
     */
    public void setErrors(ArrayOfMPError value) {
        this.errors = value;
    }

}
