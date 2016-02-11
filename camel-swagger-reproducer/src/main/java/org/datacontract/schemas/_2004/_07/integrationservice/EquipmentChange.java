
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Information required to change equipment.
 *             </summary>
 * 
 * <p>Java class for EquipmentChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrolledPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EnrolledSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewEquipment" type="{http://schemas.datacontract.org/2004/07/IntegrationService}Equipment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentChange", propOrder = {
    "enrolledPhoneNumber",
    "enrolledSerialNumber",
    "newEquipment"
})
public class EquipmentChange {

    @XmlElement(name = "EnrolledPhoneNumber", required = true, nillable = true)
    protected String enrolledPhoneNumber;
    @XmlElement(name = "EnrolledSerialNumber", required = true, nillable = true)
    protected String enrolledSerialNumber;
    @XmlElement(name = "NewEquipment", required = true, nillable = true)
    protected Equipment newEquipment;

    /**
     * Gets the value of the enrolledPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolledPhoneNumber() {
        return enrolledPhoneNumber;
    }

    /**
     * Sets the value of the enrolledPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolledPhoneNumber(String value) {
        this.enrolledPhoneNumber = value;
    }

    /**
     * Gets the value of the enrolledSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolledSerialNumber() {
        return enrolledSerialNumber;
    }

    /**
     * Sets the value of the enrolledSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolledSerialNumber(String value) {
        this.enrolledSerialNumber = value;
    }

    /**
     * Gets the value of the newEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getNewEquipment() {
        return newEquipment;
    }

    /**
     * Sets the value of the newEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setNewEquipment(Equipment value) {
        this.newEquipment = value;
    }

}
