
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MPErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Validation"/&gt;
 *     &lt;enumeration value="Security"/&gt;
 *     &lt;enumeration value="Exception"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MPErrorType")
@XmlEnum
public enum MPErrorType {

    @XmlEnumValue("Validation")
    VALIDATION("Validation"),
    @XmlEnumValue("Security")
    SECURITY("Security"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    MPErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MPErrorType fromValue(String v) {
        for (MPErrorType c: MPErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
