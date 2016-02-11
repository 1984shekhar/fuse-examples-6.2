
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPLocationApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPLocationApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLocationList" type="{http://svcs.marketplace.brightstar.com/}MPCompanyLocationList" minOccurs="0"/&gt;
 *         &lt;element name="CatalogList" type="{http://svcs.marketplace.brightstar.com/}MPCatalogList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPLocationApp", propOrder = {
    "locationID",
    "locationAppID",
    "applicationID",
    "locationName",
    "applicationName",
    "version",
    "companyLocationList",
    "catalogList"
})
public class MPLocationApp
    extends MPBaseObject
{

    @XmlElement(name = "LocationID")
    protected int locationID;
    @XmlElement(name = "LocationAppID")
    protected int locationAppID;
    @XmlElement(name = "ApplicationID")
    protected int applicationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "ApplicationName")
    protected String applicationName;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "CompanyLocationList")
    protected MPCompanyLocationList companyLocationList;
    @XmlElement(name = "CatalogList")
    protected MPCatalogList catalogList;

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
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the catalogList property.
     * 
     * @return
     *     possible object is
     *     {@link MPCatalogList }
     *     
     */
    public MPCatalogList getCatalogList() {
        return catalogList;
    }

    /**
     * Sets the value of the catalogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCatalogList }
     *     
     */
    public void setCatalogList(MPCatalogList value) {
        this.catalogList = value;
    }

}
