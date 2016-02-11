
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsDisclaimerAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://svcs.marketplace.brightstar.com/}MPRoleMaster" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PrimaryApplicationDomain" type="{http://svcs.marketplace.brightstar.com/}MPEApplicationDomain"/&gt;
 *         &lt;element name="PrimaryApplicationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimaryApplicationDomainID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrimaryApplication" type="{http://svcs.marketplace.brightstar.com/}MPEApplication"/&gt;
 *         &lt;element name="UserApplicationDomains" type="{http://svcs.marketplace.brightstar.com/}ArrayOfAnyType" minOccurs="0"/&gt;
 *         &lt;element name="UserApplications" type="{http://svcs.marketplace.brightstar.com/}ArrayOfAnyType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityQuestionAnswerList" type="{http://svcs.marketplace.brightstar.com/}MPUserSecurityQuestionAnswerList" minOccurs="0"/&gt;
 *         &lt;element name="FailedLoginAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PasswordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsActiveDirectoryUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPUser", propOrder = {
    "isActive",
    "isDisclaimerAccepted",
    "userName",
    "roleName",
    "locationID",
    "locationName",
    "locationAppID",
    "companyID",
    "companyName",
    "orgID",
    "orgName",
    "customerID",
    "userID",
    "email",
    "password",
    "firstName",
    "lastName",
    "newPassword",
    "role",
    "primaryLocationName",
    "brand",
    "isLocked",
    "primaryApplicationDomain",
    "primaryApplicationID",
    "primaryApplicationDomainID",
    "primaryApplication",
    "userApplicationDomains",
    "userApplications",
    "securityQuestionAnswerList",
    "failedLoginAttempts",
    "passwordExpired",
    "isActiveDirectoryUser"
})
public class MPUser
    extends MPBaseObject
{

    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsDisclaimerAccepted")
    protected boolean isDisclaimerAccepted;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "RoleName")
    protected String roleName;
    @XmlElement(name = "LocationID")
    protected int locationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "LocationAppID")
    protected int locationAppID;
    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "OrgID")
    protected int orgID;
    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "NewPassword")
    protected String newPassword;
    @XmlElement(name = "Role")
    protected MPRoleMaster role;
    @XmlElement(name = "PrimaryLocationName")
    protected String primaryLocationName;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "IsLocked")
    protected boolean isLocked;
    @XmlElement(name = "PrimaryApplicationDomain", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplicationDomain primaryApplicationDomain;
    @XmlElement(name = "PrimaryApplicationID")
    protected int primaryApplicationID;
    @XmlElement(name = "PrimaryApplicationDomainID")
    protected int primaryApplicationDomainID;
    @XmlElement(name = "PrimaryApplication", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplication primaryApplication;
    @XmlElement(name = "UserApplicationDomains")
    protected ArrayOfAnyType userApplicationDomains;
    @XmlElement(name = "UserApplications")
    protected ArrayOfAnyType userApplications;
    @XmlElement(name = "SecurityQuestionAnswerList")
    protected MPUserSecurityQuestionAnswerList securityQuestionAnswerList;
    @XmlElement(name = "FailedLoginAttempts")
    protected int failedLoginAttempts;
    @XmlElement(name = "PasswordExpired")
    protected boolean passwordExpired;
    @XmlElement(name = "IsActiveDirectoryUser")
    protected Boolean isActiveDirectoryUser;

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
     * Gets the value of the isDisclaimerAccepted property.
     * 
     */
    public boolean isIsDisclaimerAccepted() {
        return isDisclaimerAccepted;
    }

    /**
     * Sets the value of the isDisclaimerAccepted property.
     * 
     */
    public void setIsDisclaimerAccepted(boolean value) {
        this.isDisclaimerAccepted = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
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
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link MPRoleMaster }
     *     
     */
    public MPRoleMaster getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPRoleMaster }
     *     
     */
    public void setRole(MPRoleMaster value) {
        this.role = value;
    }

    /**
     * Gets the value of the primaryLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLocationName() {
        return primaryLocationName;
    }

    /**
     * Sets the value of the primaryLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLocationName(String value) {
        this.primaryLocationName = value;
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
     * Gets the value of the isLocked property.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the primaryApplicationDomain property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public MPEApplicationDomain getPrimaryApplicationDomain() {
        return primaryApplicationDomain;
    }

    /**
     * Sets the value of the primaryApplicationDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public void setPrimaryApplicationDomain(MPEApplicationDomain value) {
        this.primaryApplicationDomain = value;
    }

    /**
     * Gets the value of the primaryApplicationID property.
     * 
     */
    public int getPrimaryApplicationID() {
        return primaryApplicationID;
    }

    /**
     * Sets the value of the primaryApplicationID property.
     * 
     */
    public void setPrimaryApplicationID(int value) {
        this.primaryApplicationID = value;
    }

    /**
     * Gets the value of the primaryApplicationDomainID property.
     * 
     */
    public int getPrimaryApplicationDomainID() {
        return primaryApplicationDomainID;
    }

    /**
     * Sets the value of the primaryApplicationDomainID property.
     * 
     */
    public void setPrimaryApplicationDomainID(int value) {
        this.primaryApplicationDomainID = value;
    }

    /**
     * Gets the value of the primaryApplication property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplication }
     *     
     */
    public MPEApplication getPrimaryApplication() {
        return primaryApplication;
    }

    /**
     * Sets the value of the primaryApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplication }
     *     
     */
    public void setPrimaryApplication(MPEApplication value) {
        this.primaryApplication = value;
    }

    /**
     * Gets the value of the userApplicationDomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getUserApplicationDomains() {
        return userApplicationDomains;
    }

    /**
     * Sets the value of the userApplicationDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setUserApplicationDomains(ArrayOfAnyType value) {
        this.userApplicationDomains = value;
    }

    /**
     * Gets the value of the userApplications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getUserApplications() {
        return userApplications;
    }

    /**
     * Sets the value of the userApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setUserApplications(ArrayOfAnyType value) {
        this.userApplications = value;
    }

    /**
     * Gets the value of the securityQuestionAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link MPUserSecurityQuestionAnswerList }
     *     
     */
    public MPUserSecurityQuestionAnswerList getSecurityQuestionAnswerList() {
        return securityQuestionAnswerList;
    }

    /**
     * Sets the value of the securityQuestionAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPUserSecurityQuestionAnswerList }
     *     
     */
    public void setSecurityQuestionAnswerList(MPUserSecurityQuestionAnswerList value) {
        this.securityQuestionAnswerList = value;
    }

    /**
     * Gets the value of the failedLoginAttempts property.
     * 
     */
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /**
     * Sets the value of the failedLoginAttempts property.
     * 
     */
    public void setFailedLoginAttempts(int value) {
        this.failedLoginAttempts = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the isActiveDirectoryUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActiveDirectoryUser() {
        return isActiveDirectoryUser;
    }

    /**
     * Sets the value of the isActiveDirectoryUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActiveDirectoryUser(Boolean value) {
        this.isActiveDirectoryUser = value;
    }

}
