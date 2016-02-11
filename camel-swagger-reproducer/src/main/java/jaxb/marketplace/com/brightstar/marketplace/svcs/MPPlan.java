
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogPartPlanID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlanTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Pricing" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPPricing" minOccurs="0"/&gt;
 *         &lt;element name="FuturePricing" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPPricing" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPPlan", propOrder = {
    "planID",
    "catalogPartPlanID",
    "planName",
    "planTypeID",
    "planTypeName",
    "planDescription",
    "displayOrder",
    "pricing",
    "futurePricing"
})
public class MPPlan
    extends MPBaseObject
{

    @XmlElement(name = "PlanID")
    protected int planID;
    @XmlElement(name = "CatalogPartPlanID")
    protected int catalogPartPlanID;
    @XmlElement(name = "PlanName")
    protected String planName;
    @XmlElement(name = "PlanTypeID")
    protected int planTypeID;
    @XmlElement(name = "PlanTypeName")
    protected String planTypeName;
    @XmlElement(name = "PlanDescription")
    protected String planDescription;
    @XmlElement(name = "DisplayOrder")
    protected int displayOrder;
    @XmlElement(name = "Pricing")
    protected ArrayOfMPPricing pricing;
    @XmlElement(name = "FuturePricing")
    protected ArrayOfMPPricing futurePricing;

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
     */
    public int getCatalogPartPlanID() {
        return catalogPartPlanID;
    }

    /**
     * Sets the value of the catalogPartPlanID property.
     * 
     */
    public void setCatalogPartPlanID(int value) {
        this.catalogPartPlanID = value;
    }

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the planTypeID property.
     * 
     */
    public int getPlanTypeID() {
        return planTypeID;
    }

    /**
     * Sets the value of the planTypeID property.
     * 
     */
    public void setPlanTypeID(int value) {
        this.planTypeID = value;
    }

    /**
     * Gets the value of the planTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTypeName() {
        return planTypeName;
    }

    /**
     * Sets the value of the planTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTypeName(String value) {
        this.planTypeName = value;
    }

    /**
     * Gets the value of the planDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Sets the value of the planDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDescription(String value) {
        this.planDescription = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     */
    public int getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     */
    public void setDisplayOrder(int value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public ArrayOfMPPricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public void setPricing(ArrayOfMPPricing value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the futurePricing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public ArrayOfMPPricing getFuturePricing() {
        return futurePricing;
    }

    /**
     * Sets the value of the futurePricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPPricing }
     *     
     */
    public void setFuturePricing(ArrayOfMPPricing value) {
        this.futurePricing = value;
    }

}
