
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderLineBaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderLineBaseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Part" type="{http://svcs.marketplace.brightstar.com/}MPPart" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLineReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReserveNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPreOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ERPOrderLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ERPLineMapperID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HighLevelItemNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderDetailID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MSRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InstantRebate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PurchasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderFeeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CollateralFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StickerLineID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLineReference1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLineReference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLineReference3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERPOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Shipper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemList" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPOrderItem" minOccurs="0"/&gt;
 *         &lt;element name="Plan" type="{http://svcs.marketplace.brightstar.com/}MPPlan" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderLineBaseObject", propOrder = {
    "partNumber",
    "customerPartNumber",
    "part",
    "customerLineReference",
    "reserveNeeded",
    "isPreOrder",
    "erpOrderLine",
    "orderLineID",
    "erpLineMapperID",
    "highLevelItemNumber",
    "orderDetailID",
    "msrp",
    "instantRebate",
    "purchasePrice",
    "equipmentTax",
    "orderFee",
    "orderFeeTax",
    "collateralFileName",
    "stickerLineID",
    "customerLineReference1",
    "customerLineReference2",
    "customerLineReference3",
    "warehouseID",
    "erpOrderID",
    "shipper",
    "orderItemList",
    "plan",
    "unitPrice"
})
@XmlSeeAlso({
    MPOrderReserve.class,
    MPOrderLine.class
})
public class MPOrderLineBaseObject
    extends MPBaseObject
{

    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "CustomerPartNumber")
    protected String customerPartNumber;
    @XmlElement(name = "Part")
    protected MPPart part;
    @XmlElement(name = "CustomerLineReference")
    protected String customerLineReference;
    @XmlElement(name = "ReserveNeeded")
    protected boolean reserveNeeded;
    @XmlElement(name = "IsPreOrder")
    protected Boolean isPreOrder;
    @XmlElement(name = "ERPOrderLine")
    protected String erpOrderLine;
    @XmlElement(name = "OrderLineID")
    protected int orderLineID;
    @XmlElement(name = "ERPLineMapperID")
    protected int erpLineMapperID;
    @XmlElement(name = "HighLevelItemNumber")
    protected Integer highLevelItemNumber;
    @XmlElement(name = "OrderDetailID")
    protected Integer orderDetailID;
    @XmlElement(name = "MSRP")
    protected BigDecimal msrp;
    @XmlElement(name = "InstantRebate")
    protected BigDecimal instantRebate;
    @XmlElement(name = "PurchasePrice")
    protected BigDecimal purchasePrice;
    @XmlElement(name = "EquipmentTax")
    protected BigDecimal equipmentTax;
    @XmlElement(name = "OrderFee")
    protected BigDecimal orderFee;
    @XmlElement(name = "OrderFeeTax")
    protected BigDecimal orderFeeTax;
    @XmlElement(name = "CollateralFileName")
    protected String collateralFileName;
    @XmlElement(name = "StickerLineID")
    protected Integer stickerLineID;
    @XmlElement(name = "CustomerLineReference1")
    protected String customerLineReference1;
    @XmlElement(name = "CustomerLineReference2")
    protected String customerLineReference2;
    @XmlElement(name = "CustomerLineReference3")
    protected String customerLineReference3;
    @XmlElement(name = "WarehouseID")
    protected String warehouseID;
    @XmlElementRef(name = "ERPOrderID", namespace = "http://svcs.marketplace.brightstar.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erpOrderID;
    @XmlElement(name = "Shipper")
    protected String shipper;
    @XmlElement(name = "OrderItemList")
    protected ArrayOfMPOrderItem orderItemList;
    @XmlElement(name = "Plan")
    protected MPPlan plan;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the customerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartNumber() {
        return customerPartNumber;
    }

    /**
     * Sets the value of the customerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartNumber(String value) {
        this.customerPartNumber = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link MPPart }
     *     
     */
    public MPPart getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPPart }
     *     
     */
    public void setPart(MPPart value) {
        this.part = value;
    }

    /**
     * Gets the value of the customerLineReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLineReference() {
        return customerLineReference;
    }

    /**
     * Sets the value of the customerLineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLineReference(String value) {
        this.customerLineReference = value;
    }

    /**
     * Gets the value of the reserveNeeded property.
     * 
     */
    public boolean isReserveNeeded() {
        return reserveNeeded;
    }

    /**
     * Sets the value of the reserveNeeded property.
     * 
     */
    public void setReserveNeeded(boolean value) {
        this.reserveNeeded = value;
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
     * Gets the value of the erpOrderLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERPOrderLine() {
        return erpOrderLine;
    }

    /**
     * Sets the value of the erpOrderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERPOrderLine(String value) {
        this.erpOrderLine = value;
    }

    /**
     * Gets the value of the orderLineID property.
     * 
     */
    public int getOrderLineID() {
        return orderLineID;
    }

    /**
     * Sets the value of the orderLineID property.
     * 
     */
    public void setOrderLineID(int value) {
        this.orderLineID = value;
    }

    /**
     * Gets the value of the erpLineMapperID property.
     * 
     */
    public int getERPLineMapperID() {
        return erpLineMapperID;
    }

    /**
     * Sets the value of the erpLineMapperID property.
     * 
     */
    public void setERPLineMapperID(int value) {
        this.erpLineMapperID = value;
    }

    /**
     * Gets the value of the highLevelItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighLevelItemNumber() {
        return highLevelItemNumber;
    }

    /**
     * Sets the value of the highLevelItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighLevelItemNumber(Integer value) {
        this.highLevelItemNumber = value;
    }

    /**
     * Gets the value of the orderDetailID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderDetailID() {
        return orderDetailID;
    }

    /**
     * Sets the value of the orderDetailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderDetailID(Integer value) {
        this.orderDetailID = value;
    }

    /**
     * Gets the value of the msrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSRP() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSRP(BigDecimal value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the instantRebate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstantRebate() {
        return instantRebate;
    }

    /**
     * Sets the value of the instantRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstantRebate(BigDecimal value) {
        this.instantRebate = value;
    }

    /**
     * Gets the value of the purchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchasePrice(BigDecimal value) {
        this.purchasePrice = value;
    }

    /**
     * Gets the value of the equipmentTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquipmentTax() {
        return equipmentTax;
    }

    /**
     * Sets the value of the equipmentTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquipmentTax(BigDecimal value) {
        this.equipmentTax = value;
    }

    /**
     * Gets the value of the orderFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderFee() {
        return orderFee;
    }

    /**
     * Sets the value of the orderFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderFee(BigDecimal value) {
        this.orderFee = value;
    }

    /**
     * Gets the value of the orderFeeTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderFeeTax() {
        return orderFeeTax;
    }

    /**
     * Sets the value of the orderFeeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderFeeTax(BigDecimal value) {
        this.orderFeeTax = value;
    }

    /**
     * Gets the value of the collateralFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralFileName() {
        return collateralFileName;
    }

    /**
     * Sets the value of the collateralFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralFileName(String value) {
        this.collateralFileName = value;
    }

    /**
     * Gets the value of the stickerLineID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStickerLineID() {
        return stickerLineID;
    }

    /**
     * Sets the value of the stickerLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStickerLineID(Integer value) {
        this.stickerLineID = value;
    }

    /**
     * Gets the value of the customerLineReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLineReference1() {
        return customerLineReference1;
    }

    /**
     * Sets the value of the customerLineReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLineReference1(String value) {
        this.customerLineReference1 = value;
    }

    /**
     * Gets the value of the customerLineReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLineReference2() {
        return customerLineReference2;
    }

    /**
     * Sets the value of the customerLineReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLineReference2(String value) {
        this.customerLineReference2 = value;
    }

    /**
     * Gets the value of the customerLineReference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLineReference3() {
        return customerLineReference3;
    }

    /**
     * Sets the value of the customerLineReference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLineReference3(String value) {
        this.customerLineReference3 = value;
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
     * Gets the value of the erpOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getERPOrderID() {
        return erpOrderID;
    }

    /**
     * Sets the value of the erpOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setERPOrderID(JAXBElement<Integer> value) {
        this.erpOrderID = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipper(String value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the orderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPOrderItem }
     *     
     */
    public ArrayOfMPOrderItem getOrderItemList() {
        return orderItemList;
    }

    /**
     * Sets the value of the orderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPOrderItem }
     *     
     */
    public void setOrderItemList(ArrayOfMPOrderItem value) {
        this.orderItemList = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link MPPlan }
     *     
     */
    public MPPlan getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPPlan }
     *     
     */
    public void setPlan(MPPlan value) {
        this.plan = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

}
