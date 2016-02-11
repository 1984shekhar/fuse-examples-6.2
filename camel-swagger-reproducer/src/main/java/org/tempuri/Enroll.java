
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipment;
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
 *         &lt;element name="customer" type="{http://schemas.datacontract.org/2004/07/IntegrationService}Customer" minOccurs="0"/&gt;
 *         &lt;element name="equipment" type="{http://schemas.datacontract.org/2004/07/IntegrationService}ArrayOfEquipment" minOccurs="0"/&gt;
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
    "customer",
    "equipment",
    "payment",
    "channelInformation"
})
@XmlRootElement(name = "Enroll")
public class Enroll {

    @XmlElementRef(name = "customer", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Customer> customer;
    @XmlElementRef(name = "equipment", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipment> equipment;
    @XmlElementRef(name = "payment", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPayment> payment;
    @XmlElementRef(name = "channelInformation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInformation> channelInformation;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<Customer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipment> getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<ArrayOfEquipment> value) {
        this.equipment = value;
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
