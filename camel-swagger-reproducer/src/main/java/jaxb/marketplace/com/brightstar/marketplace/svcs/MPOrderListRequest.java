
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericListRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestObjectList" type="{http://svcs.marketplace.brightstar.com/}MPOrderList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderListRequest", propOrder = {
    "requestObjectList"
})
public class MPOrderListRequest
    extends MPGenericListRequest
{

    @XmlElement(name = "RequestObjectList")
    protected MPOrderList requestObjectList;

    /**
     * Gets the value of the requestObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderList }
     *     
     */
    public MPOrderList getRequestObjectList() {
        return requestObjectList;
    }

    /**
     * Sets the value of the requestObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderList }
     *     
     */
    public void setRequestObjectList(MPOrderList value) {
        this.requestObjectList = value;
    }

}
