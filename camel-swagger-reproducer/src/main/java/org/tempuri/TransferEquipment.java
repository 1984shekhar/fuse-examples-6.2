
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment;
import org.datacontract.schemas._2004._07.integrationservice.ChannelInformation;
import org.datacontract.schemas._2004._07.integrationservice.Customer;


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
 *         &lt;element name="accountNumberChange" type="{http://schemas.datacontract.org/2004/07/IntegrationService}AccountNumberChange" minOccurs="0"/&gt;
 *         &lt;element name="newCustomer" type="{http://schemas.datacontract.org/2004/07/IntegrationService}Customer" minOccurs="0"/&gt;
 *         &lt;element name="equipmentChange" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfEquipmentChange" minOccurs="0"/&gt;
 *         &lt;element name="payment" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfPayment" minOccurs="0"/&gt;
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
    "accountNumberChange",
    "newCustomer",
    "equipmentChange",
    "payment",
    "channelInformation"
})
@XmlRootElement(name = "TransferEquipment")
public class TransferEquipment {

    @XmlElementRef(name = "accountNumberChange", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountNumberChange> accountNumberChange;
    @XmlElementRef(name = "newCustomer", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Customer> newCustomer;
    @XmlElementRef(name = "equipmentChange", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentChange> equipmentChange;
    @XmlElementRef(name = "payment", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPayment> payment;
    @XmlElementRef(name = "channelInformation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInformation> channelInformation;

    /**
     * Gets the value of the accountNumberChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountNumberChange }{@code >}
     *     
     */
    public JAXBElement<AccountNumberChange> getAccountNumberChange() {
        return accountNumberChange;
    }

    /**
     * Sets the value of the accountNumberChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountNumberChange }{@code >}
     *     
     */
    public void setAccountNumberChange(JAXBElement<AccountNumberChange> value) {
        this.accountNumberChange = value;
    }

    /**
     * Gets the value of the newCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getNewCustomer() {
        return newCustomer;
    }

    /**
     * Sets the value of the newCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setNewCustomer(JAXBElement<Customer> value) {
        this.newCustomer = value;
    }

    /**
     * Gets the value of the equipmentChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentChange }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentChange> getEquipmentChange() {
        return equipmentChange;
    }

    /**
     * Sets the value of the equipmentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentChange }{@code >}
     *     
     */
    public void setEquipmentChange(JAXBElement<ArrayOfEquipmentChange> value) {
        this.equipmentChange = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPayment> getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public void setPayment(JAXBElement<ArrayOfPayment> value) {
        this.payment = value;
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
