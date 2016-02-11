
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecurityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Application" type="{http://svcs.marketplace.brightstar.com/}MPEApplication"/&gt;
 *         &lt;element name="ApplicationDomain" type="{http://svcs.marketplace.brightstar.com/}MPEApplicationDomain"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustomerEntityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PartnerSessionInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPHeader", propOrder = {
    "securityToken",
    "locationAppID",
    "locationID",
    "applicationID",
    "catalogTypeID",
    "catalogID",
    "companyID",
    "organizationID",
    "application",
    "applicationDomain",
    "userID",
    "customerEntityID",
    "partnerSessionInfo",
    "brandID"
})
@XmlSeeAlso({
    MPRequestHeader.class,
    MPResponseHeader.class
})
public class MPHeader {

    @XmlElement(name = "SecurityToken")
    protected String securityToken;
    @XmlElement(name = "LocationAppID")
    protected int locationAppID;
    @XmlElement(name = "LocationID")
    protected int locationID;
    @XmlElement(name = "ApplicationID")
    protected int applicationID;
    @XmlElement(name = "CatalogTypeID")
    protected int catalogTypeID;
    @XmlElement(name = "CatalogID")
    protected int catalogID;
    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "OrganizationID")
    protected int organizationID;
    @XmlElement(name = "Application", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplication application;
    @XmlElement(name = "ApplicationDomain", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplicationDomain applicationDomain;
    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "CustomerEntityID")
    protected int customerEntityID;
    @XmlElement(name = "PartnerSessionInfo")
    protected String partnerSessionInfo;
    @XmlElement(name = "BrandID")
    protected String brandID;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the locationAppID property.
     * 
     */
    public int getLocationAppID() {
        return locationAppID;
    }

    /**
     * Sets the value of the locationAppID property.
     * 
     */
    public void setLocationAppID(int value) {
        this.locationAppID = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the applicationID property.
     * 
     */
    public int getApplicationID() {
        return applicationID;
    }

    /**
     * Sets the value of the applicationID property.
     * 
     */
    public void setApplicationID(int value) {
        this.applicationID = value;
    }

    /**
     * Gets the value of the catalogTypeID property.
     * 
     */
    public int getCatalogTypeID() {
        return catalogTypeID;
    }

    /**
     * Sets the value of the catalogTypeID property.
     * 
     */
    public void setCatalogTypeID(int value) {
        this.catalogTypeID = value;
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
     * Gets the value of the organizationID property.
     * 
     */
    public int getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     */
    public void setOrganizationID(int value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplication }
     *     
     */
    public MPEApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplication }
     *     
     */
    public void setApplication(MPEApplication value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationDomain property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public MPEApplicationDomain getApplicationDomain() {
        return applicationDomain;
    }

    /**
     * Sets the value of the applicationDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public void setApplicationDomain(MPEApplicationDomain value) {
        this.applicationDomain = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
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
     * Gets the value of the partnerSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSessionInfo() {
        return partnerSessionInfo;
    }

    /**
     * Sets the value of the partnerSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSessionInfo(String value) {
        this.partnerSessionInfo = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

}
