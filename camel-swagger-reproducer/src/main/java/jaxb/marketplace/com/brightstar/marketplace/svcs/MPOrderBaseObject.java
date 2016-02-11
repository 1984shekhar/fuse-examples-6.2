
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPOrderBaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderBaseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdertypeVersionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AECreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="POOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LotPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActionType" type="{http://svcs.marketplace.brightstar.com/}ReserveActionType"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ERPOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatalogID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustomerPOReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatus" type="{http://svcs.marketplace.brightstar.com/}OrderStatus"/&gt;
 *         &lt;element name="OrderStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DeliveryInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerInvoiceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderShipType" type="{http://svcs.marketplace.brightstar.com/}ShipType" minOccurs="0"/&gt;
 *         &lt;element name="CustomOrderShipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPreOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderBaseObject", propOrder = {
    "ordertypeVersionID",
    "orderCreateDate",
    "aeCreateDate",
    "lotID",
    "poOrderID",
    "lotPrice",
    "warehouseID",
    "freightAmount",
    "orderUpdateDate",
    "actionType",
    "orderID",
    "erpOrderID",
    "locationAppID",
    "catalogID",
    "customerPOReference",
    "orderStatus",
    "orderStatusID",
    "deliveryInstructions",
    "salesOrderType",
    "customerInvoiceReference",
    "orderShipType",
    "customOrderShipType",
    "isPreOrder",
    "paymentTerms",
    "paymentTransactionID",
    "authorizationAmount",
    "salesTax"
})
@XmlSeeAlso({
    MPOrder.class
})
public class MPOrderBaseObject
    extends MPBaseObject
{

    @XmlElement(name = "OrdertypeVersionID")
    protected Integer ordertypeVersionID;
    @XmlElement(name = "OrderCreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderCreateDate;
    @XmlElement(name = "AECreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aeCreateDate;
    @XmlElement(name = "LotID")
    protected Integer lotID;
    @XmlElement(name = "POOrderID")
    protected Integer poOrderID;
    @XmlElement(name = "LotPrice")
    protected BigDecimal lotPrice;
    @XmlElement(name = "WarehouseID")
    protected String warehouseID;
    @XmlElement(name = "FreightAmount")
    protected BigDecimal freightAmount;
    @XmlElement(name = "OrderUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderUpdateDate;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ReserveActionType actionType;
    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "ERPOrderID", required = true, type = Integer.class, nillable = true)
    protected Integer erpOrderID;
    @XmlElement(name = "LocationAppID")
    protected int locationAppID;
    @XmlElement(name = "CatalogID")
    protected int catalogID;
    @XmlElement(name = "CustomerPOReference")
    protected String customerPOReference;
    @XmlElement(name = "OrderStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;
    @XmlElement(name = "OrderStatusID")
    protected int orderStatusID;
    @XmlElement(name = "DeliveryInstructions")
    protected String deliveryInstructions;
    @XmlElement(name = "SalesOrderType")
    protected String salesOrderType;
    @XmlElement(name = "CustomerInvoiceReference")
    protected String customerInvoiceReference;
    @XmlElement(name = "OrderShipType")
    @XmlSchemaType(name = "string")
    protected ShipType orderShipType;
    @XmlElement(name = "CustomOrderShipType")
    protected String customOrderShipType;
    @XmlElement(name = "IsPreOrder")
    protected Boolean isPreOrder;
    @XmlElement(name = "PaymentTerms")
    protected String paymentTerms;
    @XmlElement(name = "PaymentTransactionID")
    protected String paymentTransactionID;
    @XmlElement(name = "AuthorizationAmount")
    protected BigDecimal authorizationAmount;
    @XmlElement(name = "SalesTax")
    protected BigDecimal salesTax;

    /**
     * Gets the value of the ordertypeVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdertypeVersionID() {
        return ordertypeVersionID;
    }

    /**
     * Sets the value of the ordertypeVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdertypeVersionID(Integer value) {
        this.ordertypeVersionID = value;
    }

    /**
     * Gets the value of the orderCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCreateDate() {
        return orderCreateDate;
    }

    /**
     * Sets the value of the orderCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCreateDate(XMLGregorianCalendar value) {
        this.orderCreateDate = value;
    }

    /**
     * Gets the value of the aeCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAECreateDate() {
        return aeCreateDate;
    }

    /**
     * Sets the value of the aeCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAECreateDate(XMLGregorianCalendar value) {
        this.aeCreateDate = value;
    }

    /**
     * Gets the value of the lotID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLotID() {
        return lotID;
    }

    /**
     * Sets the value of the lotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLotID(Integer value) {
        this.lotID = value;
    }

    /**
     * Gets the value of the poOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPOOrderID() {
        return poOrderID;
    }

    /**
     * Sets the value of the poOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPOOrderID(Integer value) {
        this.poOrderID = value;
    }

    /**
     * Gets the value of the lotPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLotPrice() {
        return lotPrice;
    }

    /**
     * Sets the value of the lotPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLotPrice(BigDecimal value) {
        this.lotPrice = value;
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
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightAmount(BigDecimal value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the orderUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderUpdateDate() {
        return orderUpdateDate;
    }

    /**
     * Sets the value of the orderUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderUpdateDate(XMLGregorianCalendar value) {
        this.orderUpdateDate = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ReserveActionType }
     *     
     */
    public ReserveActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveActionType }
     *     
     */
    public void setActionType(ReserveActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the erpOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getERPOrderID() {
        return erpOrderID;
    }

    /**
     * Sets the value of the erpOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setERPOrderID(Integer value) {
        this.erpOrderID = value;
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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderStatusID property.
     * 
     */
    public int getOrderStatusID() {
        return orderStatusID;
    }

    /**
     * Sets the value of the orderStatusID property.
     * 
     */
    public void setOrderStatusID(int value) {
        this.orderStatusID = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Sets the value of the deliveryInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstructions(String value) {
        this.deliveryInstructions = value;
    }

    /**
     * Gets the value of the salesOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderType() {
        return salesOrderType;
    }

    /**
     * Sets the value of the salesOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderType(String value) {
        this.salesOrderType = value;
    }

    /**
     * Gets the value of the customerInvoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInvoiceReference() {
        return customerInvoiceReference;
    }

    /**
     * Sets the value of the customerInvoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInvoiceReference(String value) {
        this.customerInvoiceReference = value;
    }

    /**
     * Gets the value of the orderShipType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipType }
     *     
     */
    public ShipType getOrderShipType() {
        return orderShipType;
    }

    /**
     * Sets the value of the orderShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipType }
     *     
     */
    public void setOrderShipType(ShipType value) {
        this.orderShipType = value;
    }

    /**
     * Gets the value of the customOrderShipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomOrderShipType() {
        return customOrderShipType;
    }

    /**
     * Sets the value of the customOrderShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomOrderShipType(String value) {
        this.customOrderShipType = value;
    }

    /**
     * Gets the value of the isPreOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreOrder() {
        return isPreOrder;
    }

    /**
     * Sets the value of the isPreOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreOrder(Boolean value) {
        this.isPreOrder = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerms(String value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the paymentTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionID() {
        return paymentTransactionID;
    }

    /**
     * Sets the value of the paymentTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionID(String value) {
        this.paymentTransactionID = value;
    }

    /**
     * Gets the value of the authorizationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizationAmount() {
        return authorizationAmount;
    }

    /**
     * Sets the value of the authorizationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizationAmount(BigDecimal value) {
        this.authorizationAmount = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTax(BigDecimal value) {
        this.salesTax = value;
    }

}
