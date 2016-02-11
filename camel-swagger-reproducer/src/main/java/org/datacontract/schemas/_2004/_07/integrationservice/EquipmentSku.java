
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Equipment SKU information.
 *             </summary>
 * 
 * <p>Java class for EquipmentSku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentSku"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentCondition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentSku", propOrder = {
    "equipmentCondition",
    "sku"
})
public class EquipmentSku {

    @XmlElement(name = "EquipmentCondition")
    protected int equipmentCondition;
    @XmlElementRef(name = "Sku", namespace = "http://schemas.datacontract.org/2004/07/IntegrationService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sku;

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
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSku(JAXBElement<String> value) {
        this.sku = value;
    }

}
