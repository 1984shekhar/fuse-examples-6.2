
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPCompanyLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPCompanyLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LocationAppList" type="{http://svcs.marketplace.brightstar.com/}MPLocationAppList" minOccurs="0"/&gt;
 *         &lt;element name="CompanyList" type="{http://svcs.marketplace.brightstar.com/}MPCompanyList" minOccurs="0"/&gt;
 *         &lt;element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPCompanyLocation", propOrder = {
    "locationID",
    "companyID",
    "stateID",
    "countryID",
    "locationName",
    "address1",
    "address2",
    "zip",
    "countryCode",
    "stateName",
    "stateCode",
    "companyName",
    "countryName",
    "locationTypeID",
    "locationTypeName",
    "isActive",
    "locationAppList",
    "companyList",
    "brandID",
    "shipTo",
    "companyBrandID"
})
public class MPCompanyLocation
    extends MPBaseObject
{

    @XmlElement(name = "LocationID")
    protected int locationID;
    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "StateID")
    protected int stateID;
    @XmlElement(name = "CountryID")
    protected int countryID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "StateName")
    protected String stateName;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "LocationTypeID")
    protected int locationTypeID;
    @XmlElement(name = "LocationTypeName")
    protected String locationTypeName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "LocationAppList")
    protected MPLocationAppList locationAppList;
    @XmlElement(name = "CompanyList")
    protected MPCompanyList companyList;
    @XmlElement(name = "BrandID")
    protected String brandID;
    @XmlElement(name = "ShipTo")
    protected String shipTo;
    @XmlElement(name = "CompanyBrandID")
    protected int companyBrandID;

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
     * Gets the value of the stateID property.
     * 
     */
    public int getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     */
    public void setStateID(int value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     */
    public int getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     */
    public void setCountryID(int value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
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
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the locationTypeID property.
     * 
     */
    public int getLocationTypeID() {
        return locationTypeID;
    }

    /**
     * Sets the value of the locationTypeID property.
     * 
     */
    public void setLocationTypeID(int value) {
        this.locationTypeID = value;
    }

    /**
     * Gets the value of the locationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeName() {
        return locationTypeName;
    }

    /**
     * Sets the value of the locationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeName(String value) {
        this.locationTypeName = value;
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
     * Gets the value of the locationAppList property.
     * 
     * @return
     *     possible object is
     *     {@link MPLocationAppList }
     *     
     */
    public MPLocationAppList getLocationAppList() {
        return locationAppList;
    }

    /**
     * Sets the value of the locationAppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPLocationAppList }
     *     
     */
    public void setLocationAppList(MPLocationAppList value) {
        this.locationAppList = value;
    }

    /**
     * Gets the value of the companyList property.
     * 
     * @return
     *     possible object is
     *     {@link MPCompanyList }
     *     
     */
    public MPCompanyList getCompanyList() {
        return companyList;
    }

    /**
     * Sets the value of the companyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCompanyList }
     *     
     */
    public void setCompanyList(MPCompanyList value) {
        this.companyList = value;
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

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTo(String value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the companyBrandID property.
     * 
     */
    public int getCompanyBrandID() {
        return companyBrandID;
    }

    /**
     * Sets the value of the companyBrandID property.
     * 
     */
    public void setCompanyBrandID(int value) {
        this.companyBrandID = value;
    }

}
