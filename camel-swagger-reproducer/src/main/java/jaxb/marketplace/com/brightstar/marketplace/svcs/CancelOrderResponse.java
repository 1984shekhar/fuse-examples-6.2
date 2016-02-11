
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
 *         &lt;element name="CancelOrderResult" type="{http://svcs.marketplace.brightstar.com/}MPOrderResponse" minOccurs="0"/&gt;
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
    "cancelOrderResult"
})
@XmlRootElement(name = "CancelOrderResponse")
public class CancelOrderResponse {

    @XmlElement(name = "CancelOrderResult")
    protected MPOrderResponse cancelOrderResult;

    /**
     * Gets the value of the cancelOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderResponse }
     *     
     */
    public MPOrderResponse getCancelOrderResult() {
        return cancelOrderResult;
    }

    /**
     * Sets the value of the cancelOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderResponse }
     *     
     */
    public void setCancelOrderResult(MPOrderResponse value) {
        this.cancelOrderResult = value;
    }

}
