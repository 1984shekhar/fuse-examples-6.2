
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPPricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogPartPlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PricingTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PricingValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PricingTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CatalogPartPlanPricingID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPPricing", propOrder = {
    "planID",
    "catalogPartPlanID",
    "pricingTypeID",
    "pricingValue",
    "pricingTypeDesc",
    "catalogPartPlanPricingID",
    "scheduleDate"
})
public class MPPricing
    extends MPBaseObject
{

    @XmlElement(name = "PlanID")
    protected int planID;
    @XmlElement(name = "CatalogPartPlanID")
    protected Integer catalogPartPlanID;
    @XmlElement(name = "PricingTypeID")
    protected int pricingTypeID;
    @XmlElement(name = "PricingValue", required = true)
    protected BigDecimal pricingValue;
    @XmlElement(name = "PricingTypeDesc")
    protected String pricingTypeDesc;
    @XmlElement(name = "CatalogPartPlanPricingID")
    protected int catalogPartPlanPricingID;
    @XmlElement(name = "ScheduleDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;

    /**
     * Gets the value of the planID property.
     * 
     */
    public int getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     */
    public void setPlanID(int value) {
        this.planID = value;
    }

    /**
     * Gets the value of the catalogPartPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalogPartPlanID() {
        return catalogPartPlanID;
    }

    /**
     * Sets the value of the catalogPartPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalogPartPlanID(Integer value) {
        this.catalogPartPlanID = value;
    }

    /**
     * Gets the value of the pricingTypeID property.
     * 
     */
    public int getPricingTypeID() {
        return pricingTypeID;
    }

    /**
     * Sets the value of the pricingTypeID property.
     * 
     */
    public void setPricingTypeID(int value) {
        this.pricingTypeID = value;
    }

    /**
     * Gets the value of the pricingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingValue() {
        return pricingValue;
    }

    /**
     * Sets the value of the pricingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingValue(BigDecimal value) {
        this.pricingValue = value;
    }

    /**
     * Gets the value of the pricingTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingTypeDesc() {
        return pricingTypeDesc;
    }

    /**
     * Sets the value of the pricingTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingTypeDesc(String value) {
        this.pricingTypeDesc = value;
    }

    /**
     * Gets the value of the catalogPartPlanPricingID property.
     * 
     */
    public int getCatalogPartPlanPricingID() {
        return catalogPartPlanPricingID;
    }

    /**
     * Sets the value of the catalogPartPlanPricingID property.
     * 
     */
    public void setCatalogPartPlanPricingID(int value) {
        this.catalogPartPlanPricingID = value;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

}
