
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPUserResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObject" type="{http://svcs.marketplace.brightstar.com/}MPUser" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPUserResponse", propOrder = {
    "responseObject"
})
public class MPUserResponse
    extends MPGenericResponse
{

    @XmlElement(name = "ResponseObject")
    protected MPUser responseObject;

    /**
     * Gets the value of the responseObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPUser }
     *     
     */
    public MPUser getResponseObject() {
        return responseObject;
    }

    /**
     * Sets the value of the responseObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPUser }
     *     
     */
    public void setResponseObject(MPUser value) {
        this.responseObject = value;
    }

}
