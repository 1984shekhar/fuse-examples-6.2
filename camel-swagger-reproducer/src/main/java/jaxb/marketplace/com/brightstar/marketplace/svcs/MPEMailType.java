
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEMailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MPEMailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORDER_NOTIFICATION"/&gt;
 *     &lt;enumeration value="SHIP_NOTIFICATION"/&gt;
 *     &lt;enumeration value="PARTNER_NOTIFICATION_ON_ORDER"/&gt;
 *     &lt;enumeration value="PARTNER_NOTIFICATION_ON_ORDER_SHIP"/&gt;
 *     &lt;enumeration value="INVENTORY_LEVEL_NOTIFICATION"/&gt;
 *     &lt;enumeration value="JMS_ALERT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MPEMailType")
@XmlEnum
public enum MPEMailType {

    ORDER_NOTIFICATION,
    SHIP_NOTIFICATION,
    PARTNER_NOTIFICATION_ON_ORDER,
    PARTNER_NOTIFICATION_ON_ORDER_SHIP,
    INVENTORY_LEVEL_NOTIFICATION,
    JMS_ALERT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static MPEMailType fromValue(String v) {
        return valueOf(v);
    }

}
