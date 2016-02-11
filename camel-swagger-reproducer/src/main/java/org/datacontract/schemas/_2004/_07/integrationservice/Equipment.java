
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Information about equipment that is required for enrollment.
 *             </summary>
 * 
 * <p>Java class for Equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Equipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EquipmentCondition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EquipmentPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerWarrantyEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MobileIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Modality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerialNumberChangeDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceActivationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServicePlanId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
    "equipmentActivationDate",
    "equipmentCondition",
    "equipmentPurchaseDate",
    "manufacturerWarrantyEndDate",
    "mobileIdentificationNumber",
    "modality",
    "phoneNumber",
    "serialNumber",
    "serialNumberChangeDate",
    "serviceActivationDate",
    "servicePlanId",
    "sku"
})
public class Equipment {

    @XmlElement(name = "EquipmentActivationDate", required = true, nillable = true)
    protected String equipmentActivationDate;
    @XmlElement(name = "EquipmentCondition")
    protected int equipmentCondition;
    @XmlElement(name = "EquipmentPurchaseDate", required = true, nillable = true)
    protected String equipmentPurchaseDate;
    @XmlElement(name = "ManufacturerWarrantyEndDate", required = true, nillable = true)
    protected String manufacturerWarrantyEndDate;
    @XmlElement(name = "MobileIdentificationNumber", required = true, nillable = true)
    protected String mobileIdentificationNumber;
    @XmlElement(name = "Modality", required = true, nillable = true)
    protected String modality;
    @XmlElement(name = "PhoneNumber", required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SerialNumberChangeDate", required = true, nillable = true)
    protected String serialNumberChangeDate;
    @XmlElement(name = "ServiceActivationDate", required = true, nillable = true)
    protected String serviceActivationDate;
    @XmlElement(name = "ServicePlanId")
    protected int servicePlanId;
    @XmlElement(name = "Sku", required = true, nillable = true)
    protected String sku;

    /**
     * Gets the value of the equipmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentActivationDate() {
        return equipmentActivationDate;
    }

    /**
     * Sets the value of the equipmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentActivationDate(String value) {
        this.equipmentActivationDate = value;
    }

    /**
     * Gets the value of the equipmentCondition property.
     * 
     */
    public int getEquipmentCondition() {
        return equipmentCondition;
    }

    /**
     * Sets the value of the equipmentCondition property.
     * 
     */
    public void setEquipmentCondition(int value) {
        this.equipmentCondition = value;
    }

    /**
     * Gets the value of the equipmentPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentPurchaseDate() {
        return equipmentPurchaseDate;
    }

    /**
     * Sets the value of the equipmentPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentPurchaseDate(String value) {
        this.equipmentPurchaseDate = value;
    }

    /**
     * Gets the value of the manufacturerWarrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerWarrantyEndDate() {
        return manufacturerWarrantyEndDate;
    }

    /**
     * Sets the value of the manufacturerWarrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerWarrantyEndDate(String value) {
        this.manufacturerWarrantyEndDate = value;
    }

    /**
     * Gets the value of the mobileIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileIdentificationNumber() {
        return mobileIdentificationNumber;
    }

    /**
     * Sets the value of the mobileIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileIdentificationNumber(String value) {
        this.mobileIdentificationNumber = value;
    }

    /**
     * Gets the value of the modality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModality() {
        return modality;
    }

    /**
     * Sets the value of the modality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModality(String value) {
        this.modality = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberChangeDate() {
        return serialNumberChangeDate;
    }

    /**
     * Sets the value of the serialNumberChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberChangeDate(String value) {
        this.serialNumberChangeDate = value;
    }

    /**
     * Gets the value of the serviceActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceActivationDate() {
        return serviceActivationDate;
    }

    /**
     * Sets the value of the serviceActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceActivationDate(String value) {
        this.serviceActivationDate = value;
    }

    /**
     * Gets the value of the servicePlanId property.
     * 
     */
    public int getServicePlanId() {
        return servicePlanId;
    }

    /**
     * Sets the value of the servicePlanId property.
     * 
     */
    public void setServicePlanId(int value) {
        this.servicePlanId = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

}
