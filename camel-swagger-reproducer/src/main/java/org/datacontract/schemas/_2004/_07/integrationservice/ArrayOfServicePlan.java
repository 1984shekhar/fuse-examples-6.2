
package org.datacontract.schemas._2004._07.integrationservice;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServicePlan" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ServicePlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicePlan", propOrder = {
    "servicePlan"
})
public class ArrayOfServicePlan {

    @XmlElement(name = "ServicePlan", nillable = true)
    protected List<ServicePlan> servicePlan;

    /**
     * Gets the value of the servicePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePlan }
     * 
     * 
     */
    public List<ServicePlan> getServicePlan() {
        if (servicePlan == null) {
            servicePlan = new ArrayList<ServicePlan>();
        }
        return this.servicePlan;
    }

}
