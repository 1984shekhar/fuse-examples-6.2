
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPListOfMPOrder"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderList", propOrder = {
    "orderList"
})
public class MPOrderList
    extends MPListOfMPOrder
{

    @XmlElement(name = "OrderList")
    protected ArrayOfMPOrder orderList;

    /**
     * Gets the value of the orderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPOrder }
     *     
     */
    public ArrayOfMPOrder getOrderList() {
        return orderList;
    }

    /**
     * Sets the value of the orderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPOrder }
     *     
     */
    public void setOrderList(ArrayOfMPOrder value) {
        this.orderList = value;
    }

}
