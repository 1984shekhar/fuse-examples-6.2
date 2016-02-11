
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPShipmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPShipmentItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Part" type="{http://svcs.marketplace.brightstar.com/}MPPart" minOccurs="0"/&gt;
 *         &lt;element name="QuantityRequested" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPShipmentItem", propOrder = {
    "part",
    "quantityRequested"
})
public class MPShipmentItem {

    @XmlElement(name = "Part")
    protected MPPart part;
    @XmlElement(name = "QuantityRequested")
    protected int quantityRequested;

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link MPPart }
     *     
     */
    public MPPart getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPPart }
     *     
     */
    public void setPart(MPPart value) {
        this.part = value;
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

}
