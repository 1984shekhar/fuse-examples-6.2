
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPOrderLineBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityMarketPlace" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityERP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShippingAddress" type="{http://svcs.marketplace.brightstar.com/}MPShippingAddress" minOccurs="0"/&gt;
 *         &lt;element name="QuantityRequested" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityAllocated" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderLine", propOrder = {
    "quantityMarketPlace",
    "quantityERP",
    "shippingAddress",
    "quantityRequested",
    "quantityAllocated"
})
public class MPOrderLine
    extends MPOrderLineBaseObject
{

    @XmlElement(name = "QuantityMarketPlace")
    protected int quantityMarketPlace;
    @XmlElement(name = "QuantityERP")
    protected int quantityERP;
    @XmlElement(name = "ShippingAddress")
    protected MPShippingAddress shippingAddress;
    @XmlElement(name = "QuantityRequested")
    protected int quantityRequested;
    @XmlElement(name = "QuantityAllocated")
    protected int quantityAllocated;

    /**
     * Gets the value of the quantityMarketPlace property.
     * 
     */
    public int getQuantityMarketPlace() {
        return quantityMarketPlace;
    }

    /**
     * Sets the value of the quantityMarketPlace property.
     * 
     */
    public void setQuantityMarketPlace(int value) {
        this.quantityMarketPlace = value;
    }

    /**
     * Gets the value of the quantityERP property.
     * 
     */
    public int getQuantityERP() {
        return quantityERP;
    }

    /**
     * Sets the value of the quantityERP property.
     * 
     */
    public void setQuantityERP(int value) {
        this.quantityERP = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MPShippingAddress }
     *     
     */
    public MPShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPShippingAddress }
     *     
     */
    public void setShippingAddress(MPShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the quantityRequested property.
     * 
     */
    public int getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     */
    public void setQuantityRequested(int value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the quantityAllocated property.
     * 
     */
    public int getQuantityAllocated() {
        return quantityAllocated;
    }

    /**
     * Sets the value of the quantityAllocated property.
     * 
     */
    public void setQuantityAllocated(int value) {
        this.quantityAllocated = value;
    }

}
