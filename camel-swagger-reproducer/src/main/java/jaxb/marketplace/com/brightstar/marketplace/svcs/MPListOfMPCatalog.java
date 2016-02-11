
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPListOfMPCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPListOfMPCatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPCatalog" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPListOfMPCatalog", propOrder = {
    "items"
})
@XmlSeeAlso({
    MPCatalogList.class
})
public class MPListOfMPCatalog
    extends MPBaseObject
{

    @XmlElement(name = "Items")
    protected ArrayOfMPCatalog items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPCatalog }
     *     
     */
    public ArrayOfMPCatalog getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPCatalog }
     *     
     */
    public void setItems(ArrayOfMPCatalog value) {
        this.items = value;
    }

}
