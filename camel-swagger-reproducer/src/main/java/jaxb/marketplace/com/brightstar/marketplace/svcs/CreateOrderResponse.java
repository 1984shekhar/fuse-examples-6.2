
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
 *         &lt;element name="CreateOrderResult" type="{http://svcs.marketplace.brightstar.com/}MPOrderResponse" minOccurs="0"/&gt;
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
    "createOrderResult"
})
@XmlRootElement(name = "CreateOrderResponse")
public class CreateOrderResponse {

    @XmlElement(name = "CreateOrderResult")
    protected MPOrderResponse createOrderResult;

    /**
     * Gets the value of the createOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderResponse }
     *     
     */
    public MPOrderResponse getCreateOrderResult() {
        return createOrderResult;
    }

    /**
     * Sets the value of the createOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderResponse }
     *     
     */
    public void setCreateOrderResult(MPOrderResponse value) {
        this.createOrderResult = value;
    }

}
