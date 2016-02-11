
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CatalogPartMasterID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessoryPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorAccessoryPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QuantityReserved" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityUnreserved" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityStandard" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityPreOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsReservable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSimRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Plans" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPPlan" minOccurs="0"/&gt;
 *         &lt;element name="ImageList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPImage" minOccurs="0"/&gt;
 *         &lt;element name="FeatureList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPFeature" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleActiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PriceUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPriceUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConditionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPPart", propOrder = {
    "catalogPartMasterID",
    "warehouseID",
    "catalogID",
    "carrierID",
    "carrierName",
    "partTypeID",
    "partNumber",
    "partDescription",
    "upcCode",
    "webDescription",
    "vendorPartNumber",
    "customerPartNumber",
    "customerEntityID",
    "model",
    "accessoryPartNumber",
    "vendorAccessoryPartNumber",
    "active",
    "available",
    "quantityReserved",
    "quantityUnreserved",
    "quantityStandard",
    "quantityPreOrder",
    "isReservable",
    "isSimRequired",
    "isAssociated",
    "plans",
    "imageList",
    "featureList",
    "scheduleActive",
    "scheduleActiveDate",
    "priceUnit",
    "currencyCode",
    "isReserved",
    "customerPriceUnit",
    "condition",
    "conditionNotes",
    "mpn",
    "title"
})
public class MPPart
    extends MPBaseObject
{

    @XmlElement(name = "CatalogPartMasterID")
    protected int catalogPartMasterID;
    @XmlElement(name = "WarehouseID")
    protected int warehouseID;
    @XmlElement(name = "CatalogID")
    protected int catalogID;
    @XmlElement(name = "CarrierID")
    protected int carrierID;
    @XmlElement(name = "CarrierName")
    protected String carrierName;
    @XmlElement(name = "PartTypeID")
    protected int partTypeID;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "PartDescription")
    protected String partDescription;
    @XmlElement(name = "UPCCode")
    protected String upcCode;
    @XmlElement(name = "WebDescription")
    protected String webDescription;
    @XmlElement(name = "VendorPartNumber")
    protected String vendorPartNumber;
    @XmlElement(name = "CustomerPartNumber")
    protected String customerPartNumber;
    @XmlElement(name = "CustomerEntityID")
    protected int customerEntityID;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "AccessoryPartNumber")
    protected String accessoryPartNumber;
    @XmlElement(name = "VendorAccessoryPartNumber")
    protected String vendorAccessoryPartNumber;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "Available")
    protected boolean available;
    @XmlElement(name = "QuantityReserved")
    protected int quantityReserved;
    @XmlElement(name = "QuantityUnreserved")
    protected int quantityUnreserved;
    @XmlElement(name = "QuantityStandard")
    protected int quantityStandard;
    @XmlElement(name = "QuantityPreOrder")
    protected Integer quantityPreOrder;
    @XmlElement(name = "IsReservable")
    protected boolean isReservable;
    @XmlElement(name = "IsSimRequired")
    protected Boolean isSimRequired;
    @XmlElement(name = "IsAssociated")
    protected Boolean isAssociated;
    @XmlElement(name = "Plans")
    protected ArrayOfMPPlan plans;
    @XmlElement(name = "ImageList")
    protected ArrayOfMPImage imageList;
    @XmlElement(name = "FeatureList")
    protected ArrayOfMPFeature featureList;
    @XmlElement(name = "ScheduleActive")
    protected Boolean scheduleActive;
    @XmlElement(name = "ScheduleActiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleActiveDate;
    @XmlElement(name = "PriceUnit")
    protected BigDecimal priceUnit;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "IsReserved")
    protected Boolean isReserved;
    @XmlElement(name = "CustomerPriceUnit")
    protected BigDecimal customerPriceUnit;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "ConditionNotes")
    protected String conditionNotes;
    @XmlElement(name = "MPN")
    protected String mpn;
    @XmlElement(name = "Title")
    protected String title;

    /**
     * Gets the value of the catalogPartMasterID property.
     * 
     */
    public int getCatalogPartMasterID() {
        return catalogPartMasterID;
    }

    /**
     * Sets the value of the catalogPartMasterID property.
     * 
     */
    public void setCatalogPartMasterID(int value) {
        this.catalogPartMasterID = value;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     */
    public int getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     */
    public void setWarehouseID(int value) {
        this.warehouseID = value;
    }

    /**
     * Gets the value of the catalogID property.
     * 
     */
    public int getCatalogID() {
        return catalogID;
    }

    /**
     * Sets the value of the catalogID property.
     * 
     */
    public void setCatalogID(int value) {
        this.catalogID = value;
    }

    /**
     * Gets the value of the carrierID property.
     * 
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * Sets the value of the carrierID property.
     * 
     */
    public void setCarrierID(int value) {
        this.carrierID = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the partTypeID property.
     * 
     */
    public int getPartTypeID() {
        return partTypeID;
    }

    /**
     * Sets the value of the partTypeID property.
     * 
     */
    public void setPartTypeID(int value) {
        this.partTypeID = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the partDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDescription() {
        return partDescription;
    }

    /**
     * Sets the value of the partDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDescription(String value) {
        this.partDescription = value;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCCode() {
        return upcCode;
    }

    /**
     * Sets the value of the upcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCCode(String value) {
        this.upcCode = value;
    }

    /**
     * Gets the value of the webDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebDescription() {
        return webDescription;
    }

    /**
     * Sets the value of the webDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebDescription(String value) {
        this.webDescription = value;
    }

    /**
     * Gets the value of the vendorPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorPartNumber() {
        return vendorPartNumber;
    }

    /**
     * Sets the value of the vendorPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorPartNumber(String value) {
        this.vendorPartNumber = value;
    }

    /**
     * Gets the value of the customerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartNumber() {
        return customerPartNumber;
    }

    /**
     * Sets the value of the customerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartNumber(String value) {
        this.customerPartNumber = value;
    }

    /**
     * Gets the value of the customerEntityID property.
     * 
     */
    public int getCustomerEntityID() {
        return customerEntityID;
    }

    /**
     * Sets the value of the customerEntityID property.
     * 
     */
    public void setCustomerEntityID(int value) {
        this.customerEntityID = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the accessoryPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryPartNumber() {
        return accessoryPartNumber;
    }

    /**
     * Sets the value of the accessoryPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryPartNumber(String value) {
        this.accessoryPartNumber = value;
    }

    /**
     * Gets the value of the vendorAccessoryPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorAccessoryPartNumber() {
        return vendorAccessoryPartNumber;
    }

    /**
     * Sets the value of the vendorAccessoryPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorAccessoryPartNumber(String value) {
        this.vendorAccessoryPartNumber = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the quantityReserved property.
     * 
     */
    public int getQuantityReserved() {
        return quantityReserved;
    }

    /**
     * Sets the value of the quantityReserved property.
     * 
     */
    public void setQuantityReserved(int value) {
        this.quantityReserved = value;
    }

    /**
     * Gets the value of the quantityUnreserved property.
     * 
     */
    public int getQuantityUnreserved() {
        return quantityUnreserved;
    }

    /**
     * Sets the value of the quantityUnreserved property.
     * 
     */
    public void setQuantityUnreserved(int value) {
        this.quantityUnreserved = value;
    }

    /**
     * Gets the value of the quantityStandard property.
     * 
     */
    public int getQuantityStandard() {
        return quantityStandard;
    }

    /**
     * Sets the value of the quantityStandard property.
     * 
     */
    public void setQuantityStandard(int value) {
        this.quantityStandard = value;
    }

    /**
     * Gets the value of the quantityPreOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPreOrder() {
        return quantityPreOrder;
    }

    /**
     * Sets the value of the quantityPreOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPreOrder(Integer value) {
        this.quantityPreOrder = value;
    }

    /**
     * Gets the value of the isReservable property.
     * 
     */
    public boolean isIsReservable() {
        return isReservable;
    }

    /**
     * Sets the value of the isReservable property.
     * 
     */
    public void setIsReservable(boolean value) {
        this.isReservable = value;
    }

    /**
     * Gets the value of the isSimRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSimRequired() {
        return isSimRequired;
    }

    /**
     * Sets the value of the isSimRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSimRequired(Boolean value) {
        this.isSimRequired = value;
    }

    /**
     * Gets the value of the isAssociated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssociated() {
        return isAssociated;
    }

    /**
     * Sets the value of the isAssociated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssociated(Boolean value) {
        this.isAssociated = value;
    }

    /**
     * Gets the value of the plans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPPlan }
     *     
     */
    public ArrayOfMPPlan getPlans() {
        return plans;
    }

    /**
     * Sets the value of the plans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPPlan }
     *     
     */
    public void setPlans(ArrayOfMPPlan value) {
        this.plans = value;
    }

    /**
     * Gets the value of the imageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPImage }
     *     
     */
    public ArrayOfMPImage getImageList() {
        return imageList;
    }

    /**
     * Sets the value of the imageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPImage }
     *     
     */
    public void setImageList(ArrayOfMPImage value) {
        this.imageList = value;
    }

    /**
     * Gets the value of the featureList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPFeature }
     *     
     */
    public ArrayOfMPFeature getFeatureList() {
        return featureList;
    }

    /**
     * Sets the value of the featureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPFeature }
     *     
     */
    public void setFeatureList(ArrayOfMPFeature value) {
        this.featureList = value;
    }

    /**
     * Gets the value of the scheduleActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleActive() {
        return scheduleActive;
    }

    /**
     * Sets the value of the scheduleActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleActive(Boolean value) {
        this.scheduleActive = value;
    }

    /**
     * Gets the value of the scheduleActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleActiveDate() {
        return scheduleActiveDate;
    }

    /**
     * Sets the value of the scheduleActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleActiveDate(XMLGregorianCalendar value) {
        this.scheduleActiveDate = value;
    }

    /**
     * Gets the value of the priceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceUnit() {
        return priceUnit;
    }

    /**
     * Sets the value of the priceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceUnit(BigDecimal value) {
        this.priceUnit = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the isReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReserved() {
        return isReserved;
    }

    /**
     * Sets the value of the isReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReserved(Boolean value) {
        this.isReserved = value;
    }

    /**
     * Gets the value of the customerPriceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerPriceUnit() {
        return customerPriceUnit;
    }

    /**
     * Sets the value of the customerPriceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerPriceUnit(BigDecimal value) {
        this.customerPriceUnit = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the conditionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionNotes() {
        return conditionNotes;
    }

    /**
     * Sets the value of the conditionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionNotes(String value) {
        this.conditionNotes = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPN() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPN(String value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
