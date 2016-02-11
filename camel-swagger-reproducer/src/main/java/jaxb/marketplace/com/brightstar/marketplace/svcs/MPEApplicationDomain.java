
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEApplicationDomain.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MPEApplicationDomain"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="MARKETPLACE"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="JDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MPEApplicationDomain")
@XmlEnum
public enum MPEApplicationDomain {

    UNKNOWN,
    MARKETPLACE,
    RMA,
    JDE;

    public String value() {
        return name();
    }

    public static MPEApplicationDomain fromValue(String v) {
        return valueOf(v);
    }

}
