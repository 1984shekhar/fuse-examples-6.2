
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetShipmentRateResult" type="{http://svcs.marketplace.brightstar.com/}MPShipmentResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getShipmentRateResult"
})
@XmlRootElement(name = "GetShipmentRateResponse")
public class GetShipmentRateResponse {

    @XmlElement(name = "GetShipmentRateResult")
    protected MPShipmentResponse getShipmentRateResult;

    /**
     * Gets the value of the getShipmentRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link MPShipmentResponse }
     *     
     */
    public MPShipmentResponse getGetShipmentRateResult() {
        return getShipmentRateResult;
    }

    /**
     * Sets the value of the getShipmentRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPShipmentResponse }
     *     
     */
    public void setGetShipmentRateResult(MPShipmentResponse value) {
        this.getShipmentRateResult = value;
    }

}
