
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ArrayOfPhoneNumberChange;
import org.datacontract.schemas._2004._07.integrationservice.ChannelInformation;


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
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberChange" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfPhoneNumberChange" minOccurs="0"/&gt;
 *         &lt;element name="channelInformation" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ChannelInformation" minOccurs="0"/&gt;
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
    "accountNumber",
    "phoneNumberChange",
    "channelInformation"
})
@XmlRootElement(name = "ChangePhoneNumber")
public class ChangePhoneNumber {

    @XmlElementRef(name = "accountNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElementRef(name = "phoneNumberChange", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhoneNumberChange> phoneNumberChange;
    @XmlElementRef(name = "channelInformation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInformation> channelInformation;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the phoneNumberChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumberChange }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPhoneNumberChange> getPhoneNumberChange() {
        return phoneNumberChange;
    }

    /**
     * Sets the value of the phoneNumberChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumberChange }{@code >}
     *     
     */
    public void setPhoneNumberChange(JAXBElement<ArrayOfPhoneNumberChange> value) {
        this.phoneNumberChange = value;
    }

    /**
     * Gets the value of the channelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}
     *     
     */
    public JAXBElement<ChannelInformation> getChannelInformation() {
        return channelInformation;
    }

    /**
     * Sets the value of the channelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}
     *     
     */
    public void setChannelInformation(JAXBElement<ChannelInformation> value) {
        this.channelInformation = value;
    }

}
