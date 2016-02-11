
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPUserListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPUserListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericListRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestObjectList" type="{http://svcs.marketplace.brightstar.com/}MPUserList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPUserListRequest", propOrder = {
    "requestObjectList"
})
public class MPUserListRequest
    extends MPGenericListRequest
{

    @XmlElement(name = "RequestObjectList")
    protected MPUserList requestObjectList;

    /**
     * Gets the value of the requestObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link MPUserList }
     *     
     */
    public MPUserList getRequestObjectList() {
        return requestObjectList;
    }

    /**
     * Sets the value of the requestObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPUserList }
     *     
     */
    public void setRequestObjectList(MPUserList value) {
        this.requestObjectList = value;
    }

}
