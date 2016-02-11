
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderItemBaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderItemBaseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alternate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderLineID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderReserveID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Pricing" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPPricing" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderItemBaseObject", propOrder = {
    "serialNumber",
    "alternate1",
    "orderItemID",
    "orderLineID",
    "orderReserveID",
    "pricing"
})
@XmlSeeAlso({
    MPOrderItem.class
})
public class MPOrderItemBaseObject
    extends MPBaseObject
{

    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Alternate1")
    protected String alternate1;
    @XmlElement(name = "OrderItemID")
    protected int orderItemID;
    @XmlElement(name = "OrderLineID")
    protected int orderLineID;
    @XmlElement(name = "OrderReserveID")
    protected int orderReserveID;
    @XmlElement(name = "Pricing")
    protected ArrayOfMPPricing pricing;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the alternate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternate1() {
        return alternate1;
    }

    /**
     * Sets the value of the alternate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternate1(String value) {
        this.alternate1 = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     */
    public int getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     */
    public void setOrderItemID(int value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the orderLineID property.
     * 
     */
    public int getOrderLineID() {
        return orderLineID;
    }

    /**
     * Sets the value of the orderLineID property.
     * 
     */
    public void setOrderLineID(int value) {
        this.orderLineID = value;
    }

    /**
     * Gets the value of the orderReserveID property.
     * 
     */
    public int getOrderReserveID() {
        return orderReserveID;
    }

    /**
     * Sets the value of the orderReserveID property.
     * 
     */
    public void setOrderReserveID(int value) {
        this.orderReserveID = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public ArrayOfMPPricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public void setPricing(ArrayOfMPPricing value) {
        this.pricing = value;
    }

}
