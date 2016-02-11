
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPCompanyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPCompanyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestObject" type="{http://svcs.marketplace.brightstar.com/}MPCompany" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPCompanyRequest", propOrder = {
    "requestObject"
})
public class MPCompanyRequest
    extends MPGenericRequest
{

    @XmlElement(name = "RequestObject")
    protected MPCompany requestObject;

    /**
     * Gets the value of the requestObject property.
     * 
     * @return
     *     possible object is
     *     {@link MPCompany }
     *     
     */
    public MPCompany getRequestObject() {
        return requestObject;
    }

    /**
     * Sets the value of the requestObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCompany }
     *     
     */
    public void setRequestObject(MPCompany value) {
        this.requestObject = value;
    }

}
