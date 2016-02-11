
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrollmentResultCode;


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
 *         &lt;element name="SelectResultCodesResult" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfEnrollmentResultCode" minOccurs="0"/&gt;
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
    "selectResultCodesResult"
})
@XmlRootElement(name = "SelectResultCodesResponse")
public class SelectResultCodesResponse {

    @XmlElementRef(name = "SelectResultCodesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEnrollmentResultCode> selectResultCodesResult;

    /**
     * Gets the value of the selectResultCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnrollmentResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEnrollmentResultCode> getSelectResultCodesResult() {
        return selectResultCodesResult;
    }

    /**
     * Sets the value of the selectResultCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnrollmentResultCode }{@code >}
     *     
     */
    public void setSelectResultCodesResult(JAXBElement<ArrayOfEnrollmentResultCode> value) {
        this.selectResultCodesResult = value;
    }

}
