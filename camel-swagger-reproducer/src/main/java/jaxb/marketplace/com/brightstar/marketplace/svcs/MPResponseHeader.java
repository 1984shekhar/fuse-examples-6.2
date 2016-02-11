
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPHeader"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseStatus" type="{http://svcs.marketplace.brightstar.com/}MPResponseStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPResponseHeader", propOrder = {
    "responseStatus"
})
public class MPResponseHeader
    extends MPHeader
{

    @XmlElement(name = "ResponseStatus")
    protected MPResponseStatus responseStatus;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MPResponseStatus }
     *     
     */
    public MPResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPResponseStatus }
     *     
     */
    public void setResponseStatus(MPResponseStatus value) {
        this.responseStatus = value;
    }

}
