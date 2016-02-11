
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPMaintDefaultRoleAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPMaintDefaultRoleAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccessTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccessTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ParentAccessID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ParentAccessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Roles" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPRoleMaster" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPMaintDefaultRoleAccess", propOrder = {
    "accessID",
    "accessName",
    "hasAccess",
    "accessTypeID",
    "accessTypeName",
    "active",
    "parentAccessID",
    "parentAccessName",
    "roles"
})
public class MPMaintDefaultRoleAccess
    extends MPBaseObject
{

    @XmlElement(name = "AccessID")
    protected int accessID;
    @XmlElement(name = "AccessName")
    protected String accessName;
    @XmlElement(name = "HasAccess")
    protected boolean hasAccess;
    @XmlElement(name = "AccessTypeID")
    protected int accessTypeID;
    @XmlElement(name = "AccessTypeName")
    protected String accessTypeName;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "ParentAccessID")
    protected int parentAccessID;
    @XmlElement(name = "ParentAccessName")
    protected String parentAccessName;
    @XmlElement(name = "Roles")
    protected ArrayOfMPRoleMaster roles;

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
     * Gets the value of the hasAccess property.
     * 
     */
    public boolean isHasAccess() {
        return hasAccess;
    }

    /**
     * Sets the value of the hasAccess property.
     * 
     */
    public void setHasAccess(boolean value) {
        this.hasAccess = value;
    }

    /**
     * Gets the value of the accessTypeID property.
     * 
     */
    public int getAccessTypeID() {
        return accessTypeID;
    }

    /**
     * Sets the value of the accessTypeID property.
     * 
     */
    public void setAccessTypeID(int value) {
        this.accessTypeID = value;
    }

    /**
     * Gets the value of the accessTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessTypeName() {
        return accessTypeName;
    }

    /**
     * Sets the value of the accessTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessTypeName(String value) {
        this.accessTypeName = value;
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
     * Gets the value of the parentAccessID property.
     * 
     */
    public int getParentAccessID() {
        return parentAccessID;
    }

    /**
     * Sets the value of the parentAccessID property.
     * 
     */
    public void setParentAccessID(int value) {
        this.parentAccessID = value;
    }

    /**
     * Gets the value of the parentAccessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccessName() {
        return parentAccessName;
    }

    /**
     * Sets the value of the parentAccessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccessName(String value) {
        this.parentAccessName = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPRoleMaster }
     *     
     */
    public ArrayOfMPRoleMaster getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPRoleMaster }
     *     
     */
    public void setRoles(ArrayOfMPRoleMaster value) {
        this.roles = value;
    }

}
