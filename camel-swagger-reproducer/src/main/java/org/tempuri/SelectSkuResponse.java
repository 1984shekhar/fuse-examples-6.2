
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ModelResult;


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
 *         &lt;element name="SelectSkuResult" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ModelResult" minOccurs="0"/&gt;
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
    "selectSkuResult"
})
@XmlRootElement(name = "SelectSkuResponse")
public class SelectSkuResponse {

    @XmlElementRef(name = "SelectSkuResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ModelResult> selectSkuResult;

    /**
     * Gets the value of the selectSkuResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModelResult }{@code >}
     *     
     */
    public JAXBElement<ModelResult> getSelectSkuResult() {
        return selectSkuResult;
    }

    /**
     * Sets the value of the selectSkuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModelResult }{@code >}
     *     
     */
    public void setSelectSkuResult(JAXBElement<ModelResult> value) {
        this.selectSkuResult = value;
    }

}
