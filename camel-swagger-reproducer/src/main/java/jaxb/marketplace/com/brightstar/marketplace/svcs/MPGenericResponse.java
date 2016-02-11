
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPGenericResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPGenericResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://svcs.marketplace.brightstar.com/}MPResponseHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPGenericResponse", propOrder = {
    "responseHeader"
})
@XmlSeeAlso({
    MPOrderResponse.class,
    MPDatesResponse.class,
    MPShipmentResponse.class,
    MPUserResponse.class,
    MPCarrierResponse.class,
    MPPartResponse.class,
    MPCompanyResponse.class,
    MPEmailQueueResponse.class,
    MPEmailDataResponse.class
})
public class MPGenericResponse {

    @XmlElement(name = "ResponseHeader")
    protected MPResponseHeader responseHeader;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MPResponseHeader }
     *     
     */
    public MPResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPResponseHeader }
     *     
     */
    public void setResponseHeader(MPResponseHeader value) {
        this.responseHeader = value;
    }

}
