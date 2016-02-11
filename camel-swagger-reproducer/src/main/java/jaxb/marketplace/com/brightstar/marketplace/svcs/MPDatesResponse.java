
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPDatesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPDatesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObject" type="{http://svcs.marketplace.brightstar.com/}MPDates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPDatesResponse", propOrder = {
    "responseObject"
})
public class MPDatesResponse
    extends MPGenericResponse
{

    @XmlElement(name = "ResponseObject")
    protected MPDates responseObject;

    /**
     * Gets the value of the responseObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPDates }
     *     
     */
    public MPDates getResponseObject() {
        return responseObject;
    }

    /**
     * Sets the value of the responseObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPDates }
     *     
     */
    public void setResponseObject(MPDates value) {
        this.responseObject = value;
    }

}
