
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="ONE_DAY_AM"/&gt;
 *     &lt;enumeration value="ONE_DAY_AM_RES"/&gt;
 *     &lt;enumeration value="ONE_DAY_AM_RES_SIG"/&gt;
 *     &lt;enumeration value="ONE_DAY_PM"/&gt;
 *     &lt;enumeration value="ONE_DAY_PM_RES"/&gt;
 *     &lt;enumeration value="ONE_DAY_PM_RES_SIG"/&gt;
 *     &lt;enumeration value="ONE_DAY_SAT"/&gt;
 *     &lt;enumeration value="TWO_DAY"/&gt;
 *     &lt;enumeration value="TWO_DAY_RES"/&gt;
 *     &lt;enumeration value="TWO_DAY_RES_SIG"/&gt;
 *     &lt;enumeration value="GROUND"/&gt;
 *     &lt;enumeration value="GROUND_RES"/&gt;
 *     &lt;enumeration value="GROUND_RES_SIG"/&gt;
 *     &lt;enumeration value="THREE_DAY"/&gt;
 *     &lt;enumeration value="THREE_DAY_RES"/&gt;
 *     &lt;enumeration value="THREE_DAY_RES_SIG"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_AM"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_AM_RES"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_AM_RES_SIG"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_HW"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_PM"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_PM_RES"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_PM_RES_SIG"/&gt;
 *     &lt;enumeration value="FEDEX_ONE_DAY_SAT"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_AM"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_AM_RES"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_AM_RES_SIG"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_PM"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_PM_RES"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_PM_RES_SIG"/&gt;
 *     &lt;enumeration value="UPS_ONE_DAY_SAT"/&gt;
 *     &lt;enumeration value="USPS_PRIORITY"/&gt;
 *     &lt;enumeration value="CSC"/&gt;
 *     &lt;enumeration value="FED_2D_RES_SIGN"/&gt;
 *     &lt;enumeration value="FED_3D_RES_SIGN"/&gt;
 *     &lt;enumeration value="FED_GRD_RES_SIG"/&gt;
 *     &lt;enumeration value="FX_RES_2D_PM"/&gt;
 *     &lt;enumeration value="FX_RES_3DAY"/&gt;
 *     &lt;enumeration value="FX_RES_GND"/&gt;
 *     &lt;enumeration value="FED_2D_PM"/&gt;
 *     &lt;enumeration value="FED_3D"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND"/&gt;
 *     &lt;enumeration value="BBYRL_2DAY"/&gt;
 *     &lt;enumeration value="BBYRL_3DAY"/&gt;
 *     &lt;enumeration value="BBYRL_GROUND"/&gt;
 *     &lt;enumeration value="BBYRL_1DAY"/&gt;
 *     &lt;enumeration value="UPS_SUREPOST"/&gt;
 *     &lt;enumeration value="ONE_DAY_SAT_RES_SIG"/&gt;
 *     &lt;enumeration value="ONE_DAY_SAT_RES"/&gt;
 *     &lt;enumeration value="FOUR_DAY"/&gt;
 *     &lt;enumeration value="FOUR_DAY_RES"/&gt;
 *     &lt;enumeration value="FOUR_DAY_RES_SIG"/&gt;
 *     &lt;enumeration value="UPS_3D_RES"/&gt;
 *     &lt;enumeration value="UPS_GROUND_RES"/&gt;
 *     &lt;enumeration value="UPS_TWO_DAY_PM_RES_SIG"/&gt;
 *     &lt;enumeration value="UPS_GROUND_RES_SIG"/&gt;
 *     &lt;enumeration value="UPS_TWO_DAY_PM_RES"/&gt;
 *     &lt;enumeration value="UPS_TWO_DAY_PM"/&gt;
 *     &lt;enumeration value="UPS_GROUND"/&gt;
 *     &lt;enumeration value="PICK_UP"/&gt;
 *     &lt;enumeration value="UPS_WORLDWIDE_SAVER"/&gt;
 *     &lt;enumeration value="UPS_WORLDWIDE_SAVER_RES"/&gt;
 *     &lt;enumeration value="UPS_STANDARD_RES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipType")
@XmlEnum
public enum ShipType {

    NONE("NONE"),
    DEFAULT("DEFAULT"),
    ONE_DAY_AM("ONE_DAY_AM"),
    ONE_DAY_AM_RES("ONE_DAY_AM_RES"),
    ONE_DAY_AM_RES_SIG("ONE_DAY_AM_RES_SIG"),
    ONE_DAY_PM("ONE_DAY_PM"),
    ONE_DAY_PM_RES("ONE_DAY_PM_RES"),
    ONE_DAY_PM_RES_SIG("ONE_DAY_PM_RES_SIG"),
    ONE_DAY_SAT("ONE_DAY_SAT"),
    TWO_DAY("TWO_DAY"),
    TWO_DAY_RES("TWO_DAY_RES"),
    TWO_DAY_RES_SIG("TWO_DAY_RES_SIG"),
    GROUND("GROUND"),
    GROUND_RES("GROUND_RES"),
    GROUND_RES_SIG("GROUND_RES_SIG"),
    THREE_DAY("THREE_DAY"),
    THREE_DAY_RES("THREE_DAY_RES"),
    THREE_DAY_RES_SIG("THREE_DAY_RES_SIG"),
    FEDEX_ONE_DAY_AM("FEDEX_ONE_DAY_AM"),
    FEDEX_ONE_DAY_AM_RES("FEDEX_ONE_DAY_AM_RES"),
    FEDEX_ONE_DAY_AM_RES_SIG("FEDEX_ONE_DAY_AM_RES_SIG"),
    FEDEX_ONE_DAY_HW("FEDEX_ONE_DAY_HW"),
    FEDEX_ONE_DAY_PM("FEDEX_ONE_DAY_PM"),
    FEDEX_ONE_DAY_PM_RES("FEDEX_ONE_DAY_PM_RES"),
    FEDEX_ONE_DAY_PM_RES_SIG("FEDEX_ONE_DAY_PM_RES_SIG"),
    FEDEX_ONE_DAY_SAT("FEDEX_ONE_DAY_SAT"),
    UPS_ONE_DAY_AM("UPS_ONE_DAY_AM"),
    UPS_ONE_DAY_AM_RES("UPS_ONE_DAY_AM_RES"),
    UPS_ONE_DAY_AM_RES_SIG("UPS_ONE_DAY_AM_RES_SIG"),
    UPS_ONE_DAY_PM("UPS_ONE_DAY_PM"),
    UPS_ONE_DAY_PM_RES("UPS_ONE_DAY_PM_RES"),
    UPS_ONE_DAY_PM_RES_SIG("UPS_ONE_DAY_PM_RES_SIG"),
    UPS_ONE_DAY_SAT("UPS_ONE_DAY_SAT"),
    USPS_PRIORITY("USPS_PRIORITY"),
    CSC("CSC"),
    @XmlEnumValue("FED_2D_RES_SIGN")
    FED_2_D_RES_SIGN("FED_2D_RES_SIGN"),
    @XmlEnumValue("FED_3D_RES_SIGN")
    FED_3_D_RES_SIGN("FED_3D_RES_SIGN"),
    FED_GRD_RES_SIG("FED_GRD_RES_SIG"),
    @XmlEnumValue("FX_RES_2D_PM")
    FX_RES_2_D_PM("FX_RES_2D_PM"),
    @XmlEnumValue("FX_RES_3DAY")
    FX_RES_3_DAY("FX_RES_3DAY"),
    FX_RES_GND("FX_RES_GND"),
    @XmlEnumValue("FED_2D_PM")
    FED_2_D_PM("FED_2D_PM"),
    @XmlEnumValue("FED_3D")
    FED_3_D("FED_3D"),
    FEDEX_GROUND("FEDEX_GROUND"),
    @XmlEnumValue("BBYRL_2DAY")
    BBYRL_2_DAY("BBYRL_2DAY"),
    @XmlEnumValue("BBYRL_3DAY")
    BBYRL_3_DAY("BBYRL_3DAY"),
    BBYRL_GROUND("BBYRL_GROUND"),
    @XmlEnumValue("BBYRL_1DAY")
    BBYRL_1_DAY("BBYRL_1DAY"),
    UPS_SUREPOST("UPS_SUREPOST"),
    ONE_DAY_SAT_RES_SIG("ONE_DAY_SAT_RES_SIG"),
    ONE_DAY_SAT_RES("ONE_DAY_SAT_RES"),
    FOUR_DAY("FOUR_DAY"),
    FOUR_DAY_RES("FOUR_DAY_RES"),
    FOUR_DAY_RES_SIG("FOUR_DAY_RES_SIG"),
    @XmlEnumValue("UPS_3D_RES")
    UPS_3_D_RES("UPS_3D_RES"),
    UPS_GROUND_RES("UPS_GROUND_RES"),
    UPS_TWO_DAY_PM_RES_SIG("UPS_TWO_DAY_PM_RES_SIG"),
    UPS_GROUND_RES_SIG("UPS_GROUND_RES_SIG"),
    UPS_TWO_DAY_PM_RES("UPS_TWO_DAY_PM_RES"),
    UPS_TWO_DAY_PM("UPS_TWO_DAY_PM"),
    UPS_GROUND("UPS_GROUND"),
    PICK_UP("PICK_UP"),
    UPS_WORLDWIDE_SAVER("UPS_WORLDWIDE_SAVER"),
    UPS_WORLDWIDE_SAVER_RES("UPS_WORLDWIDE_SAVER_RES"),
    UPS_STANDARD_RES("UPS_STANDARD_RES");
    private final String value;

    ShipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipType fromValue(String v) {
        for (ShipType c: ShipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
