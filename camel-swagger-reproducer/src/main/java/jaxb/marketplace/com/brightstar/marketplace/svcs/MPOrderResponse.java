
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObject" type="{http://svcs.marketplace.brightstar.com/}MPOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderResponse", propOrder = {
    "responseObject"
})
public class MPOrderResponse
    extends MPGenericResponse
{

    @XmlElement(name = "ResponseObject")
    protected MPOrder responseObject;

    /**
     * Gets the value of the responseObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrder }
     *     
     */
    public MPOrder getResponseObject() {
        return responseObject;
    }

    /**
     * Sets the value of the responseObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrder }
     *     
     */
    public void setResponseObject(MPOrder value) {
        this.responseObject = value;
    }

}
