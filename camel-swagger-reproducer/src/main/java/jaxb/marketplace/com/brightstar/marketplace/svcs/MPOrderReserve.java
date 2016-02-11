
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPOrderReserve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPOrderReserve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPOrderLineBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityAllocated" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantityRequested" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderReserveID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReserveRequestID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActionType" type="{http://svcs.marketplace.brightstar.com/}ReserveActionType"/&gt;
 *         &lt;element name="UnreserveReason" type="{http://svcs.marketplace.brightstar.com/}UnreserveReason" minOccurs="0"/&gt;
 *         &lt;element name="UnreserveReasonID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPOrderReserve", propOrder = {
    "quantityAllocated",
    "quantityRequested",
    "orderReserveID",
    "reservationID",
    "reserveRequestID",
    "actionType",
    "unreserveReason",
    "unreserveReasonID"
})
public class MPOrderReserve
    extends MPOrderLineBaseObject
{

    @XmlElement(name = "QuantityAllocated")
    protected int quantityAllocated;
    @XmlElement(name = "QuantityRequested")
    protected int quantityRequested;
    @XmlElement(name = "OrderReserveID")
    protected int orderReserveID;
    @XmlElement(name = "ReservationID")
    protected int reservationID;
    @XmlElement(name = "ReserveRequestID")
    protected int reserveRequestID;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ReserveActionType actionType;
    @XmlElement(name = "UnreserveReason")
    @XmlSchemaType(name = "string")
    protected UnreserveReason unreserveReason;
    @XmlElement(name = "UnreserveReasonID")
    protected int unreserveReasonID;

    /**
     * Gets the value of the quantityAllocated property.
     * 
     */
    public int getQuantityAllocated() {
        return quantityAllocated;
    }

    /**
     * Sets the value of the quantityAllocated property.
     * 
     */
    public void setQuantityAllocated(int value) {
        this.quantityAllocated = value;
    }

    /**
     * Gets the value of the quantityRequested property.
     * 
     */
    public int getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     */
    public void setQuantityRequested(int value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the orderReserveID property.
     * 
     */
    public int getOrderReserveID() {
        return orderReserveID;
    }

    /**
     * Sets the value of the orderReserveID property.
     * 
     */
    public void setOrderReserveID(int value) {
        this.orderReserveID = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     */
    public int getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     */
    public void setReservationID(int value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the reserveRequestID property.
     * 
     */
    public int getReserveRequestID() {
        return reserveRequestID;
    }

    /**
     * Sets the value of the reserveRequestID property.
     * 
     */
    public void setReserveRequestID(int value) {
        this.reserveRequestID = value;
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
     * Gets the value of the unreserveReason property.
     * 
     * @return
     *     possible object is
     *     {@link UnreserveReason }
     *     
     */
    public UnreserveReason getUnreserveReason() {
        return unreserveReason;
    }

    /**
     * Sets the value of the unreserveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnreserveReason }
     *     
     */
    public void setUnreserveReason(UnreserveReason value) {
        this.unreserveReason = value;
    }

    /**
     * Gets the value of the unreserveReasonID property.
     * 
     */
    public int getUnreserveReasonID() {
        return unreserveReasonID;
    }

    /**
     * Sets the value of the unreserveReasonID property.
     * 
     */
    public void setUnreserveReasonID(int value) {
        this.unreserveReasonID = value;
    }

}
