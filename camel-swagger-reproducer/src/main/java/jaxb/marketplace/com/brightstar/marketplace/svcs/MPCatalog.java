
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPCatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CatalogID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrganizationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CatalogTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CatalogType" type="{http://svcs.marketplace.brightstar.com/}CatalogType"/&gt;
 *         &lt;element name="CatalogName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CatalogDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationAppList" type="{http://svcs.marketplace.brightstar.com/}MPLocationAppList" minOccurs="0"/&gt;
 *         &lt;element name="CompanyList" type="{http://svcs.marketplace.brightstar.com/}MPCompanyList" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPPart" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPCatalog", propOrder = {
    "catalogID",
    "locationAppID",
    "organizationID",
    "organizationName",
    "catalogTypeID",
    "catalogTypeName",
    "catalogType",
    "catalogName",
    "catalogDesc",
    "locationAppList",
    "companyList",
    "parts"
})
public class MPCatalog
    extends MPBaseObject
{

    @XmlElement(name = "CatalogID")
    protected int catalogID;
    @XmlElement(name = "LocationAppID")
    protected int locationAppID;
    @XmlElement(name = "OrganizationID")
    protected int organizationID;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "CatalogTypeID")
    protected int catalogTypeID;
    @XmlElement(name = "CatalogTypeName")
    protected String catalogTypeName;
    @XmlElement(name = "CatalogType", required = true)
    @XmlSchemaType(name = "string")
    protected CatalogType catalogType;
    @XmlElement(name = "CatalogName")
    protected String catalogName;
    @XmlElement(name = "CatalogDesc")
    protected String catalogDesc;
    @XmlElement(name = "LocationAppList")
    protected MPLocationAppList locationAppList;
    @XmlElement(name = "CompanyList")
    protected MPCompanyList companyList;
    @XmlElement(name = "Parts")
    protected ArrayOfMPPart parts;

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
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
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
     * Gets the value of the catalogTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTypeName() {
        return catalogTypeName;
    }

    /**
     * Sets the value of the catalogTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTypeName(String value) {
        this.catalogTypeName = value;
    }

    /**
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogType }
     *     
     */
    public CatalogType getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogType }
     *     
     */
    public void setCatalogType(CatalogType value) {
        this.catalogType = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the catalogDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDesc() {
        return catalogDesc;
    }

    /**
     * Sets the value of the catalogDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDesc(String value) {
        this.catalogDesc = value;
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
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPPart }
     *     
     */
    public ArrayOfMPPart getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPPart }
     *     
     */
    public void setParts(ArrayOfMPPart value) {
        this.parts = value;
    }

}
