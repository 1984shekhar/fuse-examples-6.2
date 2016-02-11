
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Service Plan information
 *             </summary>
 * 
 * <p>Java class for ServicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServicePlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePlan", propOrder = {
    "servicePlanId",
    "servicePlanName"
})
public class ServicePlan {

    @XmlElement(name = "ServicePlanId")
    protected Integer servicePlanId;
    @XmlElementRef(name = "ServicePlanName", namespace = "http://schemas.datacontract.org/2004/07/IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servicePlanName;

    /**
     * Gets the value of the servicePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicePlanId() {
        return servicePlanId;
    }

    /**
     * Sets the value of the servicePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicePlanId(Integer value) {
        this.servicePlanId = value;
    }

    /**
     * Gets the value of the servicePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServicePlanName() {
        return servicePlanName;
    }

    /**
     * Sets the value of the servicePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServicePlanName(JAXBElement<String> value) {
        this.servicePlanName = value;
    }

}
