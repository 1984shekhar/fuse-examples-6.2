
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrollmentResultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnrollmentResultCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="AuthenticationFailed"/&gt;
 *     &lt;enumeration value="UnauthorizedAccess"/&gt;
 *     &lt;enumeration value="SystemErrorEncountered"/&gt;
 *     &lt;enumeration value="InvalidOrMissingData"/&gt;
 *     &lt;enumeration value="PhoneNumberInUse"/&gt;
 *     &lt;enumeration value="SerialNumberInUse"/&gt;
 *     &lt;enumeration value="DuplicatePhoneNumber"/&gt;
 *     &lt;enumeration value="DuplicateSerialNumber"/&gt;
 *     &lt;enumeration value="CreditCardFailed"/&gt;
 *     &lt;enumeration value="InactiveSubscriber"/&gt;
 *     &lt;enumeration value="MDNAccountNumberMismatch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnrollmentResultCode")
@XmlEnum
public enum EnrollmentResultCode {


    /**
     * <summary>
     *             This occurs when the API process succeeds without any errors.
     *             <remarks>Success</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * <summary>
     *             This occurs with the userid/password combination is invalid.
     *             <remarks>Authentication failed.</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("AuthenticationFailed")
    AUTHENTICATION_FAILED("AuthenticationFailed"),

    /**
     * <summary>
     *             Each API has access security.  This error is encountered when the userid doesn't have access security.
     *             <remarks>Unauthorized access.</remarks>        
     *             </summary>
     * 
     */
    @XmlEnumValue("UnauthorizedAccess")
    UNAUTHORIZED_ACCESS("UnauthorizedAccess"),

    /**
     * <summary>
     *             This occurs when an unknown error occurs.
     *             <remarks>System error encountered.</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("SystemErrorEncountered")
    SYSTEM_ERROR_ENCOUNTERED("SystemErrorEncountered"),

    /**
     * <summary>
     *             This occurs when some parameter or parameter field is invalid or missing.  This message will list all the fields that are in error.  This will include lookup items such as skus and service plan id.
     *             <remarks>Invalid or missing data: field, field, field, …</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("InvalidOrMissingData")
    INVALID_OR_MISSING_DATA("InvalidOrMissingData"),

    /**
     * <summary>
     *             This occurs when when one or more equipment phone number is being enrolled is already in used by another customer account.  It could also occur if the incorrect account number is passed in.
     *             <remarks>Phone number already in use by another account: phone number, phone number, ...</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("PhoneNumberInUse")
    PHONE_NUMBER_IN_USE("PhoneNumberInUse"),

    /**
     * <summary>
     *             This occurs when when one or more equipment serial numbers is being enrolled is already in used by another customer account.  It could also occur if the incorrect account number is passed in.
     *             <remarks>Serial number already in use by another account: serial number, serial number</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("SerialNumberInUse")
    SERIAL_NUMBER_IN_USE("SerialNumberInUse"),

    /**
     * <summary>
     *             This occurs when when two or more entries of equipment  is being enrolled and there is a duplicate phone number in the equipment collection passed in.
     *             <remarks>Duplicate phone number: phone number, phone number, ...</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("DuplicatePhoneNumber")
    DUPLICATE_PHONE_NUMBER("DuplicatePhoneNumber"),

    /**
     * <summary>
     *             This occurs when when two or more entries of equipment  is being enrolled and there is a duplicate serial number the equipment collection passed in.
     *             <remarks>Duplicate serial number: serial number, serial number</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("DuplicateSerialNumber")
    DUPLICATE_SERIAL_NUMBER("DuplicateSerialNumber"),

    /**
     * <summary>
     *             This occurs when credit card information is invalid.
     *             <remarks>Duplicate serial number: serial number, serial number</remarks>       
     *             </summary>
     * 
     */
    @XmlEnumValue("CreditCardFailed")
    CREDIT_CARD_FAILED("CreditCardFailed"),
    @XmlEnumValue("InactiveSubscriber")
    INACTIVE_SUBSCRIBER("InactiveSubscriber"),
    @XmlEnumValue("MDNAccountNumberMismatch")
    MDN_ACCOUNT_NUMBER_MISMATCH("MDNAccountNumberMismatch");
    private final String value;

    EnrollmentResultCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnrollmentResultCode fromValue(String v) {
        for (EnrollmentResultCode c: EnrollmentResultCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
