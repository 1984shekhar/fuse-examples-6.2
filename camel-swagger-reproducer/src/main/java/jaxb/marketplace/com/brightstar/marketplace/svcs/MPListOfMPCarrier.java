
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPListOfMPCarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPListOfMPCarrier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPCarrier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPListOfMPCarrier", propOrder = {
    "items"
})
@XmlSeeAlso({
    MPCarrierList.class
})
public class MPListOfMPCarrier
    extends MPBaseObject
{

    @XmlElement(name = "Items")
    protected ArrayOfMPCarrier items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPCarrier }
     *     
     */
    public ArrayOfMPCarrier getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPCarrier }
     *     
     */
    public void setItems(ArrayOfMPCarrier value) {
        this.items = value;
    }

}
