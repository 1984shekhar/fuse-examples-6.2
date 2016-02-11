
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnreserveReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnreserveReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nothing"/&gt;
 *     &lt;enumeration value="CarrierActivationFailure"/&gt;
 *     &lt;enumeration value="CreditCheckFailure"/&gt;
 *     &lt;enumeration value="CancelOrder"/&gt;
 *     &lt;enumeration value="IsolateOnCustomerRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnreserveReason")
@XmlEnum
public enum UnreserveReason {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("CarrierActivationFailure")
    CARRIER_ACTIVATION_FAILURE("CarrierActivationFailure"),
    @XmlEnumValue("CreditCheckFailure")
    CREDIT_CHECK_FAILURE("CreditCheckFailure"),
    @XmlEnumValue("CancelOrder")
    CANCEL_ORDER("CancelOrder"),
    @XmlEnumValue("IsolateOnCustomerRequest")
    ISOLATE_ON_CUSTOMER_REQUEST("IsolateOnCustomerRequest");
    private final String value;

    UnreserveReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnreserveReason fromValue(String v) {
        for (UnreserveReason c: UnreserveReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
