
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPGenericRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPGenericRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://svcs.marketplace.brightstar.com/}MPRequestHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPGenericRequest", propOrder = {
    "requestHeader"
})
@XmlSeeAlso({
    MPOrderRequest.class,
    MPOrderSearchRequest.class,
    MPDatesRequest.class,
    MPShipmentRequest.class,
    MPEmailQueueRequest.class,
    MPCompanyRequest.class,
    MPCarrierRequest.class,
    MPPartRequest.class,
    MPUserRequest.class,
    MPEmailDataRequest.class
})
public class MPGenericRequest {

    @XmlElement(name = "RequestHeader")
    protected MPRequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MPRequestHeader }
     *     
     */
    public MPRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPRequestHeader }
     *     
     */
    public void setRequestHeader(MPRequestHeader value) {
        this.requestHeader = value;
    }

}
