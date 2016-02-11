
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Service Plan and details information
 *             </summary>
 * 
 * <p>Java class for ServicePlanDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePlanDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Feature" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfFeature" minOccurs="0"/&gt;
 *         &lt;element name="ServicePlan" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ServicePlan" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePlanDetail", propOrder = {
    "feature",
    "servicePlan"
})
public class ServicePlanDetail {

    @XmlElementRef(name = "Feature", namespace = "http://schemas.datacontract.org/2004/07/IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeature> feature;
    @XmlElementRef(name = "ServicePlan", namespace = "http://schemas.datacontract.org/2004/07/IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePlan> servicePlan;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeature> getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     *     
     */
    public void setFeature(JAXBElement<ArrayOfFeature> value) {
        this.feature = value;
    }

    /**
     * Gets the value of the servicePlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePlan }{@code >}
     *     
     */
    public JAXBElement<ServicePlan> getServicePlan() {
        return servicePlan;
    }

    /**
     * Sets the value of the servicePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePlan }{@code >}
     *     
     */
    public void setServicePlan(JAXBElement<ServicePlan> value) {
        this.servicePlan = value;
    }

}
