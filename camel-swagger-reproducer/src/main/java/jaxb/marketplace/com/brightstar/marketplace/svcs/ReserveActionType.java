
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReserveActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReserveActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nothing"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Remove"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReserveActionType")
@XmlEnum
public enum ReserveActionType {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    ReserveActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReserveActionType fromValue(String v) {
        for (ReserveActionType c: ReserveActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
