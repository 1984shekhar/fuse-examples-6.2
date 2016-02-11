
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPRoleMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPRoleMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoleLevelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Roles" type="{http://svcs.marketplace.brightstar.com/}MPListOfMPRoleMaster" minOccurs="0"/&gt;
 *         &lt;element name="AccessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccessList" type="{http://svcs.marketplace.brightstar.com/}MPMaintDefaultRoleAccessList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPRoleMaster", propOrder = {
    "roleID",
    "roleLevelID",
    "roleName",
    "roleDescription",
    "isActive",
    "isAdmin",
    "roles",
    "accessName",
    "accessID",
    "accessList"
})
public class MPRoleMaster
    extends MPBaseObject
{

    @XmlElement(name = "RoleID")
    protected int roleID;
    @XmlElement(name = "RoleLevelID")
    protected int roleLevelID;
    @XmlElement(name = "RoleName")
    protected String roleName;
    @XmlElement(name = "RoleDescription")
    protected String roleDescription;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsAdmin")
    protected boolean isAdmin;
    @XmlElement(name = "Roles")
    protected MPListOfMPRoleMaster roles;
    @XmlElement(name = "AccessName")
    protected String accessName;
    @XmlElement(name = "AccessID")
    protected int accessID;
    @XmlElement(name = "AccessList")
    protected MPMaintDefaultRoleAccessList accessList;

    /**
     * Gets the value of the roleID property.
     * 
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     */
    public void setRoleID(int value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the roleLevelID property.
     * 
     */
    public int getRoleLevelID() {
        return roleLevelID;
    }

    /**
     * Sets the value of the roleLevelID property.
     * 
     */
    public void setRoleLevelID(int value) {
        this.roleLevelID = value;
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
     * Gets the value of the roleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Sets the value of the roleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDescription(String value) {
        this.roleDescription = value;
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
     * Gets the value of the isAdmin property.
     * 
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }

    /**
     * Sets the value of the isAdmin property.
     * 
     */
    public void setIsAdmin(boolean value) {
        this.isAdmin = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link MPListOfMPRoleMaster }
     *     
     */
    public MPListOfMPRoleMaster getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPListOfMPRoleMaster }
     *     
     */
    public void setRoles(MPListOfMPRoleMaster value) {
        this.roles = value;
    }

    /**
     * Gets the value of the accessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessName() {
        return accessName;
    }

    /**
     * Sets the value of the accessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessName(String value) {
        this.accessName = value;
    }

    /**
     * Gets the value of the accessID property.
     * 
     */
    public int getAccessID() {
        return accessID;
    }

    /**
     * Sets the value of the accessID property.
     * 
     */
    public void setAccessID(int value) {
        this.accessID = value;
    }

    /**
     * Gets the value of the accessList property.
     * 
     * @return
     *     possible object is
     *     {@link MPMaintDefaultRoleAccessList }
     *     
     */
    public MPMaintDefaultRoleAccessList getAccessList() {
        return accessList;
    }

    /**
     * Sets the value of the accessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPMaintDefaultRoleAccessList }
     *     
     */
    public void setAccessList(MPMaintDefaultRoleAccessList value) {
        this.accessList = value;
    }

}
