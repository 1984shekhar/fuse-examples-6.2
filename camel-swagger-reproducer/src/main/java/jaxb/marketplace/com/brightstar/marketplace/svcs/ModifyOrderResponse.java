
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
 *         &lt;element name="ModifyOrderResult" type="{http://svcs.marketplace.brightstar.com/}MPOrderResponse" minOccurs="0"/&gt;
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
    "modifyOrderResult"
})
@XmlRootElement(name = "ModifyOrderResponse")
public class ModifyOrderResponse {

    @XmlElement(name = "ModifyOrderResult")
    protected MPOrderResponse modifyOrderResult;

    /**
     * Gets the value of the modifyOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderResponse }
     *     
     */
    public MPOrderResponse getModifyOrderResult() {
        return modifyOrderResult;
    }

    /**
     * Sets the value of the modifyOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderResponse }
     *     
     */
    public void setModifyOrderResult(MPOrderResponse value) {
        this.modifyOrderResult = value;
    }

}
