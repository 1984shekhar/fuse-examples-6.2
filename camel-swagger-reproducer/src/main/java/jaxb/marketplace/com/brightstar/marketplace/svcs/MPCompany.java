
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CompanyLocationList" type="{http://svcs.marketplace.brightstar.com/}MPCompanyLocationList" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationList" type="{http://svcs.marketplace.brightstar.com/}MPOrganizationList" minOccurs="0"/&gt;
 *         &lt;element name="InventoryQuantityProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowDuplicatePO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConfTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="JDECancelEventSerialStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsReserveByPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReserveByLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="JDEWSVersionSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JDEWSVersionSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForcePendingConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TokenExpiryDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsAllowBackOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReverseWarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelOpenOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelOpenOrdersOlderThanTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsAuthenticateWithActiveDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPCompany", propOrder = {
    "companyID",
    "orgID",
    "orgName",
    "companyName",
    "alias",
    "customerID",
    "desc",
    "companyAlias",
    "brand",
    "isActive",
    "companyLocationList",
    "organizationList",
    "inventoryQuantityProvided",
    "allowDuplicatePO",
    "confTypeID",
    "jdeCancelEventSerialStatus",
    "isReserveByPO",
    "isReserveByLot",
    "orderCutOffTime",
    "jdewsVersionSJ",
    "jdewsVersionSM",
    "warehouseID",
    "forcePendingConfirmation",
    "tokenExpiryDays",
    "isAllowBackOrders",
    "reverseWarehouseID",
    "isCancelOpenOrders",
    "cancelOpenOrdersOlderThanTime",
    "isAuthenticateWithActiveDirectory"
})
public class MPCompany
    extends MPBaseObject
{

    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "OrgID")
    protected int orgID;
    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "CompanyAlias")
    protected String companyAlias;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "CompanyLocationList")
    protected MPCompanyLocationList companyLocationList;
    @XmlElement(name = "OrganizationList")
    protected MPOrganizationList organizationList;
    @XmlElement(name = "InventoryQuantityProvided")
    protected Boolean inventoryQuantityProvided;
    @XmlElement(name = "AllowDuplicatePO")
    protected Boolean allowDuplicatePO;
    @XmlElement(name = "ConfTypeID")
    protected Integer confTypeID;
    @XmlElement(name = "JDECancelEventSerialStatus")
    protected String jdeCancelEventSerialStatus;
    @XmlElement(name = "IsReserveByPO")
    protected Boolean isReserveByPO;
    @XmlElement(name = "IsReserveByLot")
    protected Boolean isReserveByLot;
    @XmlElement(name = "OrderCutOffTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderCutOffTime;
    @XmlElement(name = "JDEWSVersionSJ")
    protected String jdewsVersionSJ;
    @XmlElement(name = "JDEWSVersionSM")
    protected String jdewsVersionSM;
    @XmlElement(name = "WarehouseID")
    protected String warehouseID;
    @XmlElement(name = "ForcePendingConfirmation")
    protected Boolean forcePendingConfirmation;
    @XmlElement(name = "TokenExpiryDays")
    protected Integer tokenExpiryDays;
    @XmlElement(name = "IsAllowBackOrders")
    protected Boolean isAllowBackOrders;
    @XmlElement(name = "ReverseWarehouseID")
    protected String reverseWarehouseID;
    @XmlElement(name = "IsCancelOpenOrders")
    protected Boolean isCancelOpenOrders;
    @XmlElement(name = "CancelOpenOrdersOlderThanTime")
    protected Integer cancelOpenOrdersOlderThanTime;
    @XmlElement(name = "IsAuthenticateWithActiveDirectory")
    protected Boolean isAuthenticateWithActiveDirectory;

    /**
     * Gets the value of the companyID property.
     * 
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     */
    public void setCompanyID(int value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     */
    public int getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     */
    public void setOrgID(int value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the companyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAlias() {
        return companyAlias;
    }

    /**
     * Sets the value of the companyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAlias(String value) {
        this.companyAlias = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the companyLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link MPCompanyLocationList }
     *     
     */
    public MPCompanyLocationList getCompanyLocationList() {
        return companyLocationList;
    }

    /**
     * Sets the value of the companyLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCompanyLocationList }
     *     
     */
    public void setCompanyLocationList(MPCompanyLocationList value) {
        this.companyLocationList = value;
    }

    /**
     * Gets the value of the organizationList property.
     * 
     * @return
     *     possible object is
     *     {@link MPOrganizationList }
     *     
     */
    public MPOrganizationList getOrganizationList() {
        return organizationList;
    }

    /**
     * Sets the value of the organizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOrganizationList }
     *     
     */
    public void setOrganizationList(MPOrganizationList value) {
        this.organizationList = value;
    }

    /**
     * Gets the value of the inventoryQuantityProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryQuantityProvided() {
        return inventoryQuantityProvided;
    }

    /**
     * Sets the value of the inventoryQuantityProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryQuantityProvided(Boolean value) {
        this.inventoryQuantityProvided = value;
    }

    /**
     * Gets the value of the allowDuplicatePO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDuplicatePO() {
        return allowDuplicatePO;
    }

    /**
     * Sets the value of the allowDuplicatePO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDuplicatePO(Boolean value) {
        this.allowDuplicatePO = value;
    }

    /**
     * Gets the value of the confTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfTypeID() {
        return confTypeID;
    }

    /**
     * Sets the value of the confTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfTypeID(Integer value) {
        this.confTypeID = value;
    }

    /**
     * Gets the value of the jdeCancelEventSerialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDECancelEventSerialStatus() {
        return jdeCancelEventSerialStatus;
    }

    /**
     * Sets the value of the jdeCancelEventSerialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDECancelEventSerialStatus(String value) {
        this.jdeCancelEventSerialStatus = value;
    }

    /**
     * Gets the value of the isReserveByPO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReserveByPO() {
        return isReserveByPO;
    }

    /**
     * Sets the value of the isReserveByPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReserveByPO(Boolean value) {
        this.isReserveByPO = value;
    }

    /**
     * Gets the value of the isReserveByLot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReserveByLot() {
        return isReserveByLot;
    }

    /**
     * Sets the value of the isReserveByLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReserveByLot(Boolean value) {
        this.isReserveByLot = value;
    }

    /**
     * Gets the value of the orderCutOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCutOffTime() {
        return orderCutOffTime;
    }

    /**
     * Sets the value of the orderCutOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCutOffTime(XMLGregorianCalendar value) {
        this.orderCutOffTime = value;
    }

    /**
     * Gets the value of the jdewsVersionSJ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDEWSVersionSJ() {
        return jdewsVersionSJ;
    }

    /**
     * Sets the value of the jdewsVersionSJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDEWSVersionSJ(String value) {
        this.jdewsVersionSJ = value;
    }

    /**
     * Gets the value of the jdewsVersionSM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJDEWSVersionSM() {
        return jdewsVersionSM;
    }

    /**
     * Sets the value of the jdewsVersionSM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJDEWSVersionSM(String value) {
        this.jdewsVersionSM = value;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseID(String value) {
        this.warehouseID = value;
    }

    /**
     * Gets the value of the forcePendingConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcePendingConfirmation() {
        return forcePendingConfirmation;
    }

    /**
     * Sets the value of the forcePendingConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePendingConfirmation(Boolean value) {
        this.forcePendingConfirmation = value;
    }

    /**
     * Gets the value of the tokenExpiryDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTokenExpiryDays() {
        return tokenExpiryDays;
    }

    /**
     * Sets the value of the tokenExpiryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTokenExpiryDays(Integer value) {
        this.tokenExpiryDays = value;
    }

    /**
     * Gets the value of the isAllowBackOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowBackOrders() {
        return isAllowBackOrders;
    }

    /**
     * Sets the value of the isAllowBackOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowBackOrders(Boolean value) {
        this.isAllowBackOrders = value;
    }

    /**
     * Gets the value of the reverseWarehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseWarehouseID() {
        return reverseWarehouseID;
    }

    /**
     * Sets the value of the reverseWarehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseWarehouseID(String value) {
        this.reverseWarehouseID = value;
    }

    /**
     * Gets the value of the isCancelOpenOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelOpenOrders() {
        return isCancelOpenOrders;
    }

    /**
     * Sets the value of the isCancelOpenOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelOpenOrders(Boolean value) {
        this.isCancelOpenOrders = value;
    }

    /**
     * Gets the value of the cancelOpenOrdersOlderThanTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelOpenOrdersOlderThanTime() {
        return cancelOpenOrdersOlderThanTime;
    }

    /**
     * Sets the value of the cancelOpenOrdersOlderThanTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelOpenOrdersOlderThanTime(Integer value) {
        this.cancelOpenOrdersOlderThanTime = value;
    }

    /**
     * Gets the value of the isAuthenticateWithActiveDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAuthenticateWithActiveDirectory() {
        return isAuthenticateWithActiveDirectory;
    }

    /**
     * Sets the value of the isAuthenticateWithActiveDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthenticateWithActiveDirectory(Boolean value) {
        this.isAuthenticateWithActiveDirectory = value;
    }

}
