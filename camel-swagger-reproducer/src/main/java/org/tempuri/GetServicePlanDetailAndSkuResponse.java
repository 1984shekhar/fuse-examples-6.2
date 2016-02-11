
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult;


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
 *         &lt;element name="GetServicePlanDetailAndSkuResult" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ServicePlanDetailResult" minOccurs="0"/&gt;
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
    "getServicePlanDetailAndSkuResult"
})
@XmlRootElement(name = "GetServicePlanDetailAndSkuResponse")
public class GetServicePlanDetailAndSkuResponse {

    @XmlElementRef(name = "GetServicePlanDetailAndSkuResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePlanDetailResult> getServicePlanDetailAndSkuResult;

    /**
     * Gets the value of the getServicePlanDetailAndSkuResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}
     *     
     */
    public JAXBElement<ServicePlanDetailResult> getGetServicePlanDetailAndSkuResult() {
        return getServicePlanDetailAndSkuResult;
    }

    /**
     * Sets the value of the getServicePlanDetailAndSkuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}
     *     
     */
    public void setGetServicePlanDetailAndSkuResult(JAXBElement<ServicePlanDetailResult> value) {
        this.getServicePlanDetailAndSkuResult = value;
    }

}
