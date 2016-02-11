
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPUserListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPUserListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericListResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObjectList" type="{http://svcs.marketplace.brightstar.com/}MPUserList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPUserListResponse", propOrder = {
    "responseObjectList"
})
public class MPUserListResponse
    extends MPGenericListResponse
{

    @XmlElement(name = "ResponseObjectList")
    protected MPUserList responseObjectList;

    /**
     * Gets the value of the responseObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link MPUserList }
     *     
     */
    public MPUserList getResponseObjectList() {
        return responseObjectList;
    }

    /**
     * Sets the value of the responseObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPUserList }
     *     
     */
    public void setResponseObjectList(MPUserList value) {
        this.responseObjectList = value;
    }

}
