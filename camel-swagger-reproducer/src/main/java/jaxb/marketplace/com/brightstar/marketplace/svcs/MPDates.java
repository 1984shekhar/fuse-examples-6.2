
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerReference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderEstimatedShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderEstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderShipType" type="{http://svcs.marketplace.brightstar.com/}ShipType"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPDates", propOrder = {
    "customerReference1",
    "customerReference2",
    "expectedConfirmationDate",
    "orderEstimatedShipDate",
    "orderEstimatedDeliveryDate",
    "orderShipType",
    "zipCode"
})
public class MPDates {

    @XmlElement(name = "CustomerReference1")
    protected String customerReference1;
    @XmlElement(name = "CustomerReference2")
    protected String customerReference2;
    @XmlElement(name = "ExpectedConfirmationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedConfirmationDate;
    @XmlElement(name = "OrderEstimatedShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderEstimatedShipDate;
    @XmlElement(name = "OrderEstimatedDeliveryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderEstimatedDeliveryDate;
    @XmlElement(name = "OrderShipType", required = true)
    @XmlSchemaType(name = "string")
    protected ShipType orderShipType;
    @XmlElement(name = "ZipCode")
    protected String zipCode;

    /**
     * Gets the value of the customerReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference1() {
        return customerReference1;
    }

    /**
     * Sets the value of the customerReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference1(String value) {
        this.customerReference1 = value;
    }

    /**
     * Gets the value of the customerReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference2() {
        return customerReference2;
    }

    /**
     * Sets the value of the customerReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference2(String value) {
        this.customerReference2 = value;
    }

    /**
     * Gets the value of the expectedConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedConfirmationDate() {
        return expectedConfirmationDate;
    }

    /**
     * Sets the value of the expectedConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedConfirmationDate(XMLGregorianCalendar value) {
        this.expectedConfirmationDate = value;
    }

    /**
     * Gets the value of the orderEstimatedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderEstimatedShipDate() {
        return orderEstimatedShipDate;
    }

    /**
     * Sets the value of the orderEstimatedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderEstimatedShipDate(XMLGregorianCalendar value) {
        this.orderEstimatedShipDate = value;
    }

    /**
     * Gets the value of the orderEstimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderEstimatedDeliveryDate() {
        return orderEstimatedDeliveryDate;
    }

    /**
     * Sets the value of the orderEstimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderEstimatedDeliveryDate(XMLGregorianCalendar value) {
        this.orderEstimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the orderShipType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipType }
     *     
     */
    public ShipType getOrderShipType() {
        return orderShipType;
    }

    /**
     * Sets the value of the orderShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipType }
     *     
     */
    public void setOrderShipType(ShipType value) {
        this.orderShipType = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
