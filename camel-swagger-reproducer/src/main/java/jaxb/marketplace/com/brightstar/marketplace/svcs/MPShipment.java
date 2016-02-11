
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPShipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerReference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderShipType" type="{http://svcs.marketplace.brightstar.com/}ShipType"/&gt;
 *         &lt;element name="ShipToAddress" type="{http://svcs.marketplace.brightstar.com/}MPCustomerAddress" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentItemList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPShipmentItem" minOccurs="0"/&gt;
 *         &lt;element name="ShipPackages" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPShipPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPShipment", propOrder = {
    "customerReference1",
    "customerReference2",
    "orderShipType",
    "shipToAddress",
    "shipmentItemList",
    "shipPackages"
})
public class MPShipment {

    @XmlElement(name = "CustomerReference1")
    protected String customerReference1;
    @XmlElement(name = "CustomerReference2")
    protected String customerReference2;
    @XmlElement(name = "OrderShipType", required = true)
    @XmlSchemaType(name = "string")
    protected ShipType orderShipType;
    @XmlElement(name = "ShipToAddress")
    protected MPCustomerAddress shipToAddress;
    @XmlElement(name = "ShipmentItemList")
    protected ArrayOfMPShipmentItem shipmentItemList;
    @XmlElement(name = "ShipPackages")
    protected ArrayOfMPShipPackage shipPackages;

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
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MPCustomerAddress }
     *     
     */
    public MPCustomerAddress getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCustomerAddress }
     *     
     */
    public void setShipToAddress(MPCustomerAddress value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipmentItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPShipmentItem }
     *     
     */
    public ArrayOfMPShipmentItem getShipmentItemList() {
        return shipmentItemList;
    }

    /**
     * Sets the value of the shipmentItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPShipmentItem }
     *     
     */
    public void setShipmentItemList(ArrayOfMPShipmentItem value) {
        this.shipmentItemList = value;
    }

    /**
     * Gets the value of the shipPackages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPShipPackage }
     *     
     */
    public ArrayOfMPShipPackage getShipPackages() {
        return shipPackages;
    }

    /**
     * Sets the value of the shipPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPShipPackage }
     *     
     */
    public void setShipPackages(ArrayOfMPShipPackage value) {
        this.shipPackages = value;
    }

}
