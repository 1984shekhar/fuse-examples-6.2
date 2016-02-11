
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
 *         &lt;element name="GetServicePlanDetailsResult" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ServicePlanDetailResult" minOccurs="0"/&gt;
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
    "getServicePlanDetailsResult"
})
@XmlRootElement(name = "GetServicePlanDetailsResponse")
public class GetServicePlanDetailsResponse {

    @XmlElementRef(name = "GetServicePlanDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePlanDetailResult> getServicePlanDetailsResult;

    /**
     * Gets the value of the getServicePlanDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}
     *     
     */
    public JAXBElement<ServicePlanDetailResult> getGetServicePlanDetailsResult() {
        return getServicePlanDetailsResult;
    }

    /**
     * Sets the value of the getServicePlanDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}
     *     
     */
    public void setGetServicePlanDetailsResult(JAXBElement<ServicePlanDetailResult> value) {
        this.getServicePlanDetailsResult = value;
    }

}
