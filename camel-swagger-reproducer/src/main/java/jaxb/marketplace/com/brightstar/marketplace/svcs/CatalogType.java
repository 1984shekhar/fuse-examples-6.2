
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CatalogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MARKETPLACE_LEVEL"/&gt;
 *     &lt;enumeration value="ORGANIZATION_LEVEL"/&gt;
 *     &lt;enumeration value="COMPANY_LEVEL"/&gt;
 *     &lt;enumeration value="LOCATION_APP_LEVEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CatalogType")
@XmlEnum
public enum CatalogType {

    MARKETPLACE_LEVEL,
    ORGANIZATION_LEVEL,
    COMPANY_LEVEL,
    LOCATION_APP_LEVEL;

    public String value() {
        return name();
    }

    public static CatalogType fromValue(String v) {
        return valueOf(v);
    }

}
