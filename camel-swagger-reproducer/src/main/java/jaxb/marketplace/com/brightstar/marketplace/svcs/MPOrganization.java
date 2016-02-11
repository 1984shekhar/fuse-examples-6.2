
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrganization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrgDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CompanyList" type="{http://svcs.marketplace.brightstar.com/}MPCompanyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrganization", propOrder = {
    "orgName",
    "orgID",
    "orgDesc",
    "orgAlias",
    "isActive",
    "companyList"
})
public class MPOrganization
    extends MPBaseObject
{

    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "OrgID")
    protected int orgID;
    @XmlElement(name = "OrgDesc")
    protected String orgDesc;
    @XmlElement(name = "OrgAlias")
    protected String orgAlias;
    protected boolean isActive;
    @XmlElement(name = "CompanyList")
    protected MPCompanyList companyList;

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
     * Gets the value of the orgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDesc() {
        return orgDesc;
    }

    /**
     * Sets the value of the orgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDesc(String value) {
        this.orgDesc = value;
    }

    /**
     * Gets the value of the orgAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAlias() {
        return orgAlias;
    }

    /**
     * Sets the value of the orgAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAlias(String value) {
        this.orgAlias = value;
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

}
