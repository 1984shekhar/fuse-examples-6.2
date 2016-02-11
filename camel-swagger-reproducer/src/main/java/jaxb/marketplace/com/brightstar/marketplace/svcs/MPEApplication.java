
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEApplication.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MPEApplication"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="MARKETPLACE_MAINT"/&gt;
 *     &lt;enumeration value="KIOSK"/&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="B2B"/&gt;
 *     &lt;enumeration value="DESKTOP"/&gt;
 *     &lt;enumeration value="PHONEIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MPEApplication")
@XmlEnum
public enum MPEApplication {

    UNKNOWN("UNKNOWN"),
    MARKETPLACE_MAINT("MARKETPLACE_MAINT"),
    KIOSK("KIOSK"),
    WEB("WEB"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    DESKTOP("DESKTOP"),
    PHONEIN("PHONEIN");
    private final String value;

    MPEApplication(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MPEApplication fromValue(String v) {
        for (MPEApplication c: MPEApplication.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
