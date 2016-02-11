
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPOrderBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OneLinePerItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CustomerEmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERPCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ERPCancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAddress" type="{http://svcs.marketplace.brightstar.com/}MPCustomerAddress" minOccurs="0"/&gt;
 *         &lt;element name="BillingAddress" type="{http://svcs.marketplace.brightstar.com/}MPCustomerAddress" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPOrderLine" minOccurs="0"/&gt;
 *         &lt;element name="OrderReserveList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPOrderReserve" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrder", propOrder = {
    "oneLinePerItem",
    "customerEmployeeID",
    "erpCreateDate",
    "erpCancelDate",
    "customerAddress",
    "billingAddress",
    "orderLineList",
    "orderReserveList"
})
public class MPOrder
    extends MPOrderBaseObject
{

    @XmlElement(name = "OneLinePerItem")
    protected boolean oneLinePerItem;
    @XmlElement(name = "CustomerEmployeeID")
    protected String customerEmployeeID;
    @XmlElementRef(name = "ERPCreateDate", namespace = "http://svcs.marketplace.brightstar.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> erpCreateDate;
    @XmlElementRef(name = "ERPCancelDate", namespace = "http://svcs.marketplace.brightstar.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> erpCancelDate;
    @XmlElement(name = "CustomerAddress")
    protected MPCustomerAddress customerAddress;
    @XmlElement(name = "BillingAddress")
    protected MPCustomerAddress billingAddress;
    @XmlElement(name = "OrderLineList")
    protected ArrayOfMPOrderLine orderLineList;
    @XmlElement(name = "OrderReserveList")
    protected ArrayOfMPOrderReserve orderReserveList;

    /**
     * Gets the value of the oneLinePerItem property.
     * 
     */
    public boolean isOneLinePerItem() {
        return oneLinePerItem;
    }

    /**
     * Sets the value of the oneLinePerItem property.
     * 
     */
    public void setOneLinePerItem(boolean value) {
        this.oneLinePerItem = value;
    }

    /**
     * Gets the value of the customerEmployeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmployeeID() {
        return customerEmployeeID;
    }

    /**
     * Sets the value of the customerEmployeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmployeeID(String value) {
        this.customerEmployeeID = value;
    }

    /**
     * Gets the value of the erpCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getERPCreateDate() {
        return erpCreateDate;
    }

    /**
     * Sets the value of the erpCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setERPCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.erpCreateDate = value;
    }

    /**
     * Gets the value of the erpCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getERPCancelDate() {
        return erpCancelDate;
    }

    /**
     * Sets the value of the erpCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setERPCancelDate(JAXBElement<XMLGregorianCalendar> value) {
        this.erpCancelDate = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MPCustomerAddress }
     *     
     */
    public MPCustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCustomerAddress }
     *     
     */
    public void setCustomerAddress(MPCustomerAddress value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MPCustomerAddress }
     *     
     */
    public MPCustomerAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCustomerAddress }
     *     
     */
    public void setBillingAddress(MPCustomerAddress value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the orderLineList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPOrderLine }
     *     
     */
    public ArrayOfMPOrderLine getOrderLineList() {
        return orderLineList;
    }

    /**
     * Sets the value of the orderLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPOrderLine }
     *     
     */
    public void setOrderLineList(ArrayOfMPOrderLine value) {
        this.orderLineList = value;
    }

    /**
     * Gets the value of the orderReserveList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPOrderReserve }
     *     
     */
    public ArrayOfMPOrderReserve getOrderReserveList() {
        return orderReserveList;
    }

    /**
     * Sets the value of the orderReserveList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPOrderReserve }
     *     
     */
    public void setOrderReserveList(ArrayOfMPOrderReserve value) {
        this.orderReserveList = value;
    }

}
