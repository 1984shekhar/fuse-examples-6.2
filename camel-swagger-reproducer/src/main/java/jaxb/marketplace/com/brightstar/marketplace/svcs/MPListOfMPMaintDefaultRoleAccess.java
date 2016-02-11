
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPListOfMPMaintDefaultRoleAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPListOfMPMaintDefaultRoleAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPMaintDefaultRoleAccess" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPListOfMPMaintDefaultRoleAccess", propOrder = {
    "items"
})
@XmlSeeAlso({
    MPMaintDefaultRoleAccessList.class
})
public class MPListOfMPMaintDefaultRoleAccess
    extends MPBaseObject
{

    @XmlElement(name = "Items")
    protected ArrayOfMPMaintDefaultRoleAccess items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPMaintDefaultRoleAccess }
     *     
     */
    public ArrayOfMPMaintDefaultRoleAccess getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPMaintDefaultRoleAccess }
     *     
     */
    public void setItems(ArrayOfMPMaintDefaultRoleAccess value) {
        this.items = value;
    }

}
