
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nothing"/&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="ERPSalesOrderCreated"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Shipped"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="ERPPickTicketCreated"/&gt;
 *     &lt;enumeration value="PendingConfirmation"/&gt;
 *     &lt;enumeration value="PendingCancellation"/&gt;
 *     &lt;enumeration value="BackOrder"/&gt;
 *     &lt;enumeration value="BackOrderRelease"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="PreOrder"/&gt;
 *     &lt;enumeration value="PartiallyShipped"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("ERPSalesOrderCreated")
    ERP_SALES_ORDER_CREATED("ERPSalesOrderCreated"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("ERPPickTicketCreated")
    ERP_PICK_TICKET_CREATED("ERPPickTicketCreated"),
    @XmlEnumValue("PendingConfirmation")
    PENDING_CONFIRMATION("PendingConfirmation"),
    @XmlEnumValue("PendingCancellation")
    PENDING_CANCELLATION("PendingCancellation"),
    @XmlEnumValue("BackOrder")
    BACK_ORDER("BackOrder"),
    @XmlEnumValue("BackOrderRelease")
    BACK_ORDER_RELEASE("BackOrderRelease"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("PreOrder")
    PRE_ORDER("PreOrder"),
    @XmlEnumValue("PartiallyShipped")
    PARTIALLY_SHIPPED("PartiallyShipped");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
