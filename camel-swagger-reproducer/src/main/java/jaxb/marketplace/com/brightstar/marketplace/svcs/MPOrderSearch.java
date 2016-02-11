
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPOrderSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderCreationStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderCreationEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CatalogID" type="{http://svcs.marketplace.brightstar.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="LocationAppID" type="{http://svcs.marketplace.brightstar.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="LocationID" type="{http://svcs.marketplace.brightstar.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://svcs.marketplace.brightstar.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderStatus" type="{http://svcs.marketplace.brightstar.com/}ArrayOfOrderStatus" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPOReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPOReference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPOReference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPOReference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatusID" type="{http://svcs.marketplace.brightstar.com/}ArrayOfInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderSearch", propOrder = {
    "orderCreationStartDate",
    "orderCreationEndDate",
    "catalogID",
    "locationAppID",
    "locationID",
    "companyID",
    "orgID",
    "orderStatus",
    "lastName",
    "firstName",
    "customerEmployeeNumber",
    "customerPOReference",
    "customerPOReference1",
    "customerPOReference2",
    "customerPOReference3",
    "orderStatusID"
})
public class MPOrderSearch
    extends MPBaseObject
{

    @XmlElement(name = "OrderCreationStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderCreationStartDate;
    @XmlElement(name = "OrderCreationEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderCreationEndDate;
    @XmlElement(name = "CatalogID")
    protected ArrayOfInt catalogID;
    @XmlElement(name = "LocationAppID")
    protected ArrayOfInt locationAppID;
    @XmlElement(name = "LocationID")
    protected ArrayOfInt locationID;
    @XmlElement(name = "CompanyID")
    protected ArrayOfInt companyID;
    @XmlElement(name = "OrgID")
    protected int orgID;
    @XmlElement(name = "OrderStatus")
    protected ArrayOfOrderStatus orderStatus;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "CustomerEmployeeNumber")
    protected String customerEmployeeNumber;
    @XmlElement(name = "CustomerPOReference")
    protected String customerPOReference;
    @XmlElement(name = "CustomerPOReference1")
    protected String customerPOReference1;
    @XmlElement(name = "CustomerPOReference2")
    protected String customerPOReference2;
    @XmlElement(name = "CustomerPOReference3")
    protected String customerPOReference3;
    @XmlElement(name = "OrderStatusID")
    protected ArrayOfInt orderStatusID;

    /**
     * Gets the value of the orderCreationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCreationStartDate() {
        return orderCreationStartDate;
    }

    /**
     * Sets the value of the orderCreationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCreationStartDate(XMLGregorianCalendar value) {
        this.orderCreationStartDate = value;
    }

    /**
     * Gets the value of the orderCreationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCreationEndDate() {
        return orderCreationEndDate;
    }

    /**
     * Sets the value of the orderCreationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCreationEndDate(XMLGregorianCalendar value) {
        this.orderCreationEndDate = value;
    }

    /**
     * Gets the value of the catalogID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCatalogID() {
        return catalogID;
    }

    /**
     * Sets the value of the catalogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCatalogID(ArrayOfInt value) {
        this.catalogID = value;
    }

    /**
     * Gets the value of the locationAppID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationAppID() {
        return locationAppID;
    }

    /**
     * Sets the value of the locationAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationAppID(ArrayOfInt value) {
        this.locationAppID = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationID(ArrayOfInt value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCompanyID(ArrayOfInt value) {
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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderStatus }
     *     
     */
    public ArrayOfOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderStatus }
     *     
     */
    public void setOrderStatus(ArrayOfOrderStatus value) {
        this.orderStatus = value;
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
     * Gets the value of the customerEmployeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmployeeNumber() {
        return customerEmployeeNumber;
    }

    /**
     * Sets the value of the customerEmployeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmployeeNumber(String value) {
        this.customerEmployeeNumber = value;
    }

    /**
     * Gets the value of the customerPOReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPOReference() {
        return customerPOReference;
    }

    /**
     * Sets the value of the customerPOReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPOReference(String value) {
        this.customerPOReference = value;
    }

    /**
     * Gets the value of the customerPOReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPOReference1() {
        return customerPOReference1;
    }

    /**
     * Sets the value of the customerPOReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPOReference1(String value) {
        this.customerPOReference1 = value;
    }

    /**
     * Gets the value of the customerPOReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPOReference2() {
        return customerPOReference2;
    }

    /**
     * Sets the value of the customerPOReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPOReference2(String value) {
        this.customerPOReference2 = value;
    }

    /**
     * Gets the value of the customerPOReference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPOReference3() {
        return customerPOReference3;
    }

    /**
     * Sets the value of the customerPOReference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPOReference3(String value) {
        this.customerPOReference3 = value;
    }

    /**
     * Gets the value of the orderStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getOrderStatusID() {
        return orderStatusID;
    }

    /**
     * Sets the value of the orderStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setOrderStatusID(ArrayOfInt value) {
        this.orderStatusID = value;
    }

}
