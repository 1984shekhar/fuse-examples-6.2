
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReserveRequestID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustomerLineRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://svcs.marketplace.brightstar.com/}MPErrorType"/&gt;
 *         &lt;element name="ErrorStatus" type="{http://svcs.marketplace.brightstar.com/}Status"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPError", propOrder = {
    "lineID",
    "reserveRequestID",
    "customerLineRef",
    "partNumber",
    "customerPartNumber",
    "errorMessage",
    "errorType",
    "errorStatus"
})
public class MPError {

    @XmlElement(name = "LineID", required = true, type = Integer.class, nillable = true)
    protected Integer lineID;
    @XmlElement(name = "ReserveRequestID", required = true, type = Integer.class, nillable = true)
    protected Integer reserveRequestID;
    @XmlElement(name = "CustomerLineRef")
    protected String customerLineRef;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "CustomerPartNumber")
    protected String customerPartNumber;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ErrorType", required = true)
    @XmlSchemaType(name = "string")
    protected MPErrorType errorType;
    @XmlElement(name = "ErrorStatus", required = true)
    @XmlSchemaType(name = "string")
    protected Status errorStatus;

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineID(Integer value) {
        this.lineID = value;
    }

    /**
     * Gets the value of the reserveRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReserveRequestID() {
        return reserveRequestID;
    }

    /**
     * Sets the value of the reserveRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReserveRequestID(Integer value) {
        this.reserveRequestID = value;
    }

    /**
     * Gets the value of the customerLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLineRef() {
        return customerLineRef;
    }

    /**
     * Sets the value of the customerLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLineRef(String value) {
        this.customerLineRef = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the customerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartNumber() {
        return customerPartNumber;
    }

    /**
     * Sets the value of the customerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartNumber(String value) {
        this.customerPartNumber = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link MPErrorType }
     *     
     */
    public MPErrorType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPErrorType }
     *     
     */
    public void setErrorType(MPErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the errorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getErrorStatus() {
        return errorStatus;
    }

    /**
     * Sets the value of the errorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setErrorStatus(Status value) {
        this.errorStatus = value;
    }

}
