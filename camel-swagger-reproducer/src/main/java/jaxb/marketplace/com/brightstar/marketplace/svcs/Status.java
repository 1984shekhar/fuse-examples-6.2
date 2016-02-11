
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="InvalidPartNumber"/&gt;
 *     &lt;enumeration value="InvalidSerialNumber"/&gt;
 *     &lt;enumeration value="InvalidBin"/&gt;
 *     &lt;enumeration value="InactiveBin"/&gt;
 *     &lt;enumeration value="SIMRequired"/&gt;
 *     &lt;enumeration value="InactivePartNumber"/&gt;
 *     &lt;enumeration value="SerialActiveInSystem"/&gt;
 *     &lt;enumeration value="InvalidSecurityToken"/&gt;
 *     &lt;enumeration value="BinMaxedOut"/&gt;
 *     &lt;enumeration value="NoMixedProductsInBin"/&gt;
 *     &lt;enumeration value="InvalidSerialStatus"/&gt;
 *     &lt;enumeration value="InvalidCustomerPartNumber"/&gt;
 *     &lt;enumeration value="InvalidOrderType"/&gt;
 *     &lt;enumeration value="ERPOrderIDDoesNotMatch"/&gt;
 *     &lt;enumeration value="QuantityMismatchWithBeacon"/&gt;
 *     &lt;enumeration value="ERPPriceNotAvailable"/&gt;
 *     &lt;enumeration value="SerialNotInSystem"/&gt;
 *     &lt;enumeration value="SerialReserved"/&gt;
 *     &lt;enumeration value="NoSerialAvailableForPart"/&gt;
 *     &lt;enumeration value="InvalidUnreserveReason"/&gt;
 *     &lt;enumeration value="InvalidUnreserveReasonID"/&gt;
 *     &lt;enumeration value="ReservationInWrongStatus"/&gt;
 *     &lt;enumeration value="SerialAlreadyShipped"/&gt;
 *     &lt;enumeration value="SerialUnableToUnReserve"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *     &lt;enumeration value="RequestObjectIsNull"/&gt;
 *     &lt;enumeration value="InvalidHeaderInformation"/&gt;
 *     &lt;enumeration value="ERPUnderMaintenance"/&gt;
 *     &lt;enumeration value="InvalidOrder"/&gt;
 *     &lt;enumeration value="InvalidOrderLine"/&gt;
 *     &lt;enumeration value="OrderAlreadyConfirmed"/&gt;
 *     &lt;enumeration value="OrderDoesNotBelongToLocationAppID"/&gt;
 *     &lt;enumeration value="PartNotInActiveCatalog"/&gt;
 *     &lt;enumeration value="MissingOrderLineIDs"/&gt;
 *     &lt;enumeration value="ReservedLinesCantBeModified"/&gt;
 *     &lt;enumeration value="OrderInWrongStatus"/&gt;
 *     &lt;enumeration value="PickNumberExists"/&gt;
 *     &lt;enumeration value="InvalidDate"/&gt;
 *     &lt;enumeration value="OrderLineIDMismatch"/&gt;
 *     &lt;enumeration value="PlanIDMissing"/&gt;
 *     &lt;enumeration value="SerialCountNotMatchingQuantityRequested"/&gt;
 *     &lt;enumeration value="QuantityRequestedGreaterThanQuantityMarketPlace"/&gt;
 *     &lt;enumeration value="OrderReserveIDNotFoundInOrder"/&gt;
 *     &lt;enumeration value="ErrorInLineLevelOfRequest"/&gt;
 *     &lt;enumeration value="InventoryNotAvailable"/&gt;
 *     &lt;enumeration value="UnableToCreateTheOrderInERPSystem"/&gt;
 *     &lt;enumeration value="SerialNotBelongToOrderLine"/&gt;
 *     &lt;enumeration value="NotAnOpenOrder"/&gt;
 *     &lt;enumeration value="NoOrderLinesAvailable"/&gt;
 *     &lt;enumeration value="ReservationFailure"/&gt;
 *     &lt;enumeration value="POAlreadyExists"/&gt;
 *     &lt;enumeration value="NoOrdersFound"/&gt;
 *     &lt;enumeration value="EmptyAddress"/&gt;
 *     &lt;enumeration value="InvalidAddress"/&gt;
 *     &lt;enumeration value="OrderAlreadyShipped"/&gt;
 *     &lt;enumeration value="OrderNotInCancellableStatus"/&gt;
 *     &lt;enumeration value="PickNumberDoesNotExists"/&gt;
 *     &lt;enumeration value="DuplicateRule"/&gt;
 *     &lt;enumeration value="InvalidUserOrPassword"/&gt;
 *     &lt;enumeration value="InvalidUserCredentials"/&gt;
 *     &lt;enumeration value="ExpiredSecurityToken"/&gt;
 *     &lt;enumeration value="UserNameExists"/&gt;
 *     &lt;enumeration value="SerialSIMMismatch"/&gt;
 *     &lt;enumeration value="SerialActiveButNotReserved"/&gt;
 *     &lt;enumeration value="SerialShipperMismatch"/&gt;
 *     &lt;enumeration value="SerialNotInRadioBeacon"/&gt;
 *     &lt;enumeration value="InvalidReservationID"/&gt;
 *     &lt;enumeration value="SerialActiveInMarketPlace"/&gt;
 *     &lt;enumeration value="NoEmailMetaDataAvailable"/&gt;
 *     &lt;enumeration value="UnableToInsertInToEmailData"/&gt;
 *     &lt;enumeration value="UnableToInsertIntoEmailQueue"/&gt;
 *     &lt;enumeration value="UnableToDeactivateEmailData"/&gt;
 *     &lt;enumeration value="UnableToDeactivateEmailQueue"/&gt;
 *     &lt;enumeration value="ProductNotSoldByBrightstar"/&gt;
 *     &lt;enumeration value="ProductIsalreadyonRMA"/&gt;
 *     &lt;enumeration value="NotHandset"/&gt;
 *     &lt;enumeration value="ProductIsOutOfWarranty"/&gt;
 *     &lt;enumeration value="NotSoldToThisCustomer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status")
@XmlEnum
public enum Status {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("InvalidPartNumber")
    INVALID_PART_NUMBER("InvalidPartNumber"),
    @XmlEnumValue("InvalidSerialNumber")
    INVALID_SERIAL_NUMBER("InvalidSerialNumber"),
    @XmlEnumValue("InvalidBin")
    INVALID_BIN("InvalidBin"),
    @XmlEnumValue("InactiveBin")
    INACTIVE_BIN("InactiveBin"),
    @XmlEnumValue("SIMRequired")
    SIM_REQUIRED("SIMRequired"),
    @XmlEnumValue("InactivePartNumber")
    INACTIVE_PART_NUMBER("InactivePartNumber"),
    @XmlEnumValue("SerialActiveInSystem")
    SERIAL_ACTIVE_IN_SYSTEM("SerialActiveInSystem"),
    @XmlEnumValue("InvalidSecurityToken")
    INVALID_SECURITY_TOKEN("InvalidSecurityToken"),
    @XmlEnumValue("BinMaxedOut")
    BIN_MAXED_OUT("BinMaxedOut"),
    @XmlEnumValue("NoMixedProductsInBin")
    NO_MIXED_PRODUCTS_IN_BIN("NoMixedProductsInBin"),
    @XmlEnumValue("InvalidSerialStatus")
    INVALID_SERIAL_STATUS("InvalidSerialStatus"),
    @XmlEnumValue("InvalidCustomerPartNumber")
    INVALID_CUSTOMER_PART_NUMBER("InvalidCustomerPartNumber"),
    @XmlEnumValue("InvalidOrderType")
    INVALID_ORDER_TYPE("InvalidOrderType"),
    @XmlEnumValue("ERPOrderIDDoesNotMatch")
    ERP_ORDER_ID_DOES_NOT_MATCH("ERPOrderIDDoesNotMatch"),
    @XmlEnumValue("QuantityMismatchWithBeacon")
    QUANTITY_MISMATCH_WITH_BEACON("QuantityMismatchWithBeacon"),
    @XmlEnumValue("ERPPriceNotAvailable")
    ERP_PRICE_NOT_AVAILABLE("ERPPriceNotAvailable"),
    @XmlEnumValue("SerialNotInSystem")
    SERIAL_NOT_IN_SYSTEM("SerialNotInSystem"),
    @XmlEnumValue("SerialReserved")
    SERIAL_RESERVED("SerialReserved"),
    @XmlEnumValue("NoSerialAvailableForPart")
    NO_SERIAL_AVAILABLE_FOR_PART("NoSerialAvailableForPart"),
    @XmlEnumValue("InvalidUnreserveReason")
    INVALID_UNRESERVE_REASON("InvalidUnreserveReason"),
    @XmlEnumValue("InvalidUnreserveReasonID")
    INVALID_UNRESERVE_REASON_ID("InvalidUnreserveReasonID"),
    @XmlEnumValue("ReservationInWrongStatus")
    RESERVATION_IN_WRONG_STATUS("ReservationInWrongStatus"),
    @XmlEnumValue("SerialAlreadyShipped")
    SERIAL_ALREADY_SHIPPED("SerialAlreadyShipped"),
    @XmlEnumValue("SerialUnableToUnReserve")
    SERIAL_UNABLE_TO_UN_RESERVE("SerialUnableToUnReserve"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("RequestObjectIsNull")
    REQUEST_OBJECT_IS_NULL("RequestObjectIsNull"),
    @XmlEnumValue("InvalidHeaderInformation")
    INVALID_HEADER_INFORMATION("InvalidHeaderInformation"),
    @XmlEnumValue("ERPUnderMaintenance")
    ERP_UNDER_MAINTENANCE("ERPUnderMaintenance"),
    @XmlEnumValue("InvalidOrder")
    INVALID_ORDER("InvalidOrder"),
    @XmlEnumValue("InvalidOrderLine")
    INVALID_ORDER_LINE("InvalidOrderLine"),
    @XmlEnumValue("OrderAlreadyConfirmed")
    ORDER_ALREADY_CONFIRMED("OrderAlreadyConfirmed"),
    @XmlEnumValue("OrderDoesNotBelongToLocationAppID")
    ORDER_DOES_NOT_BELONG_TO_LOCATION_APP_ID("OrderDoesNotBelongToLocationAppID"),
    @XmlEnumValue("PartNotInActiveCatalog")
    PART_NOT_IN_ACTIVE_CATALOG("PartNotInActiveCatalog"),
    @XmlEnumValue("MissingOrderLineIDs")
    MISSING_ORDER_LINE_I_DS("MissingOrderLineIDs"),
    @XmlEnumValue("ReservedLinesCantBeModified")
    RESERVED_LINES_CANT_BE_MODIFIED("ReservedLinesCantBeModified"),
    @XmlEnumValue("OrderInWrongStatus")
    ORDER_IN_WRONG_STATUS("OrderInWrongStatus"),
    @XmlEnumValue("PickNumberExists")
    PICK_NUMBER_EXISTS("PickNumberExists"),
    @XmlEnumValue("InvalidDate")
    INVALID_DATE("InvalidDate"),
    @XmlEnumValue("OrderLineIDMismatch")
    ORDER_LINE_ID_MISMATCH("OrderLineIDMismatch"),
    @XmlEnumValue("PlanIDMissing")
    PLAN_ID_MISSING("PlanIDMissing"),
    @XmlEnumValue("SerialCountNotMatchingQuantityRequested")
    SERIAL_COUNT_NOT_MATCHING_QUANTITY_REQUESTED("SerialCountNotMatchingQuantityRequested"),
    @XmlEnumValue("QuantityRequestedGreaterThanQuantityMarketPlace")
    QUANTITY_REQUESTED_GREATER_THAN_QUANTITY_MARKET_PLACE("QuantityRequestedGreaterThanQuantityMarketPlace"),
    @XmlEnumValue("OrderReserveIDNotFoundInOrder")
    ORDER_RESERVE_ID_NOT_FOUND_IN_ORDER("OrderReserveIDNotFoundInOrder"),
    @XmlEnumValue("ErrorInLineLevelOfRequest")
    ERROR_IN_LINE_LEVEL_OF_REQUEST("ErrorInLineLevelOfRequest"),
    @XmlEnumValue("InventoryNotAvailable")
    INVENTORY_NOT_AVAILABLE("InventoryNotAvailable"),
    @XmlEnumValue("UnableToCreateTheOrderInERPSystem")
    UNABLE_TO_CREATE_THE_ORDER_IN_ERP_SYSTEM("UnableToCreateTheOrderInERPSystem"),
    @XmlEnumValue("SerialNotBelongToOrderLine")
    SERIAL_NOT_BELONG_TO_ORDER_LINE("SerialNotBelongToOrderLine"),
    @XmlEnumValue("NotAnOpenOrder")
    NOT_AN_OPEN_ORDER("NotAnOpenOrder"),
    @XmlEnumValue("NoOrderLinesAvailable")
    NO_ORDER_LINES_AVAILABLE("NoOrderLinesAvailable"),
    @XmlEnumValue("ReservationFailure")
    RESERVATION_FAILURE("ReservationFailure"),
    @XmlEnumValue("POAlreadyExists")
    PO_ALREADY_EXISTS("POAlreadyExists"),
    @XmlEnumValue("NoOrdersFound")
    NO_ORDERS_FOUND("NoOrdersFound"),
    @XmlEnumValue("EmptyAddress")
    EMPTY_ADDRESS("EmptyAddress"),
    @XmlEnumValue("InvalidAddress")
    INVALID_ADDRESS("InvalidAddress"),
    @XmlEnumValue("OrderAlreadyShipped")
    ORDER_ALREADY_SHIPPED("OrderAlreadyShipped"),
    @XmlEnumValue("OrderNotInCancellableStatus")
    ORDER_NOT_IN_CANCELLABLE_STATUS("OrderNotInCancellableStatus"),
    @XmlEnumValue("PickNumberDoesNotExists")
    PICK_NUMBER_DOES_NOT_EXISTS("PickNumberDoesNotExists"),
    @XmlEnumValue("DuplicateRule")
    DUPLICATE_RULE("DuplicateRule"),
    @XmlEnumValue("InvalidUserOrPassword")
    INVALID_USER_OR_PASSWORD("InvalidUserOrPassword"),
    @XmlEnumValue("InvalidUserCredentials")
    INVALID_USER_CREDENTIALS("InvalidUserCredentials"),
    @XmlEnumValue("ExpiredSecurityToken")
    EXPIRED_SECURITY_TOKEN("ExpiredSecurityToken"),
    @XmlEnumValue("UserNameExists")
    USER_NAME_EXISTS("UserNameExists"),
    @XmlEnumValue("SerialSIMMismatch")
    SERIAL_SIM_MISMATCH("SerialSIMMismatch"),
    @XmlEnumValue("SerialActiveButNotReserved")
    SERIAL_ACTIVE_BUT_NOT_RESERVED("SerialActiveButNotReserved"),
    @XmlEnumValue("SerialShipperMismatch")
    SERIAL_SHIPPER_MISMATCH("SerialShipperMismatch"),
    @XmlEnumValue("SerialNotInRadioBeacon")
    SERIAL_NOT_IN_RADIO_BEACON("SerialNotInRadioBeacon"),
    @XmlEnumValue("InvalidReservationID")
    INVALID_RESERVATION_ID("InvalidReservationID"),
    @XmlEnumValue("SerialActiveInMarketPlace")
    SERIAL_ACTIVE_IN_MARKET_PLACE("SerialActiveInMarketPlace"),
    @XmlEnumValue("NoEmailMetaDataAvailable")
    NO_EMAIL_META_DATA_AVAILABLE("NoEmailMetaDataAvailable"),
    @XmlEnumValue("UnableToInsertInToEmailData")
    UNABLE_TO_INSERT_IN_TO_EMAIL_DATA("UnableToInsertInToEmailData"),
    @XmlEnumValue("UnableToInsertIntoEmailQueue")
    UNABLE_TO_INSERT_INTO_EMAIL_QUEUE("UnableToInsertIntoEmailQueue"),
    @XmlEnumValue("UnableToDeactivateEmailData")
    UNABLE_TO_DEACTIVATE_EMAIL_DATA("UnableToDeactivateEmailData"),
    @XmlEnumValue("UnableToDeactivateEmailQueue")
    UNABLE_TO_DEACTIVATE_EMAIL_QUEUE("UnableToDeactivateEmailQueue"),
    @XmlEnumValue("ProductNotSoldByBrightstar")
    PRODUCT_NOT_SOLD_BY_BRIGHTSTAR("ProductNotSoldByBrightstar"),
    @XmlEnumValue("ProductIsalreadyonRMA")
    PRODUCT_ISALREADYON_RMA("ProductIsalreadyonRMA"),
    @XmlEnumValue("NotHandset")
    NOT_HANDSET("NotHandset"),
    @XmlEnumValue("ProductIsOutOfWarranty")
    PRODUCT_IS_OUT_OF_WARRANTY("ProductIsOutOfWarranty"),
    @XmlEnumValue("NotSoldToThisCustomer")
    NOT_SOLD_TO_THIS_CUSTOMER("NotSoldToThisCustomer");
    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c: Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
