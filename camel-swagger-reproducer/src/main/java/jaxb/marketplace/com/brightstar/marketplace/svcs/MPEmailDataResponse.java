
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEmailDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPEmailDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObject" type="{http://svcs.marketplace.brightstar.com/}MPEmailData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPEmailDataResponse", propOrder = {
    "responseObject"
})
public class MPEmailDataResponse
    extends MPGenericResponse
{

    @XmlElement(name = "ResponseObject")
    protected MPEmailData responseObject;

    /**
     * Gets the value of the responseObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPEmailData }
     *     
     */
    public MPEmailData getResponseObject() {
        return responseObject;
    }

    /**
     * Sets the value of the responseObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEmailData }
     *     
     */
    public void setResponseObject(MPEmailData value) {
        this.responseObject = value;
    }

}
