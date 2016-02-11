
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
 *         &lt;element name="GetOrdersBySearchParametersResult" type="{http://svcs.marketplace.brightstar.com/}MPOrderListResponse" minOccurs="0"/&gt;
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
    "getOrdersBySearchParametersResult"
})
@XmlRootElement(name = "GetOrdersBySearchParametersResponse")
public class GetOrdersBySearchParametersResponse {

    @XmlElement(name = "GetOrdersBySearchParametersResult")
    protected MPOrderListResponse getOrdersBySearchParametersResult;

    /**
     * Gets the value of the getOrdersBySearchParametersResult property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrderListResponse }
     *     
     */
    public MPOrderListResponse getGetOrdersBySearchParametersResult() {
        return getOrdersBySearchParametersResult;
    }

    /**
     * Sets the value of the getOrdersBySearchParametersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrderListResponse }
     *     
     */
    public void setGetOrdersBySearchParametersResult(MPOrderListResponse value) {
        this.getOrdersBySearchParametersResult = value;
    }

}
