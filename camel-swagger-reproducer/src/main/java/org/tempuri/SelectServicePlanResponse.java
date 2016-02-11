
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ServicePlanResult;


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
 *         &lt;element name="SelectServicePlanResult" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ServicePlanResult" minOccurs="0"/&gt;
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
    "selectServicePlanResult"
})
@XmlRootElement(name = "SelectServicePlanResponse")
public class SelectServicePlanResponse {

    @XmlElementRef(name = "SelectServicePlanResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePlanResult> selectServicePlanResult;

    /**
     * Gets the value of the selectServicePlanResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanResult }{@code >}
     *     
     */
    public JAXBElement<ServicePlanResult> getSelectServicePlanResult() {
        return selectServicePlanResult;
    }

    /**
     * Sets the value of the selectServicePlanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanResult }{@code >}
     *     
     */
    public void setSelectServicePlanResult(JAXBElement<ServicePlanResult> value) {
        this.selectServicePlanResult = value;
    }

}
