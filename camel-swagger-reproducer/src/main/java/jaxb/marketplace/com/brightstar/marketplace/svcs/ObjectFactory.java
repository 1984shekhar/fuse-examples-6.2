
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brightstar.marketplace.svcs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MPOrderERPCreateDate_QNAME = new QName("http://svcs.marketplace.brightstar.com/", "ERPCreateDate");
    private final static QName _MPOrderERPCancelDate_QNAME = new QName("http://svcs.marketplace.brightstar.com/", "ERPCancelDate");
    private final static QName _MPOrderLineBaseObjectERPOrderID_QNAME = new QName("http://svcs.marketplace.brightstar.com/", "ERPOrderID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brightstar.marketplace.svcs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSecurityToken }
     * 
     */
    public GetSecurityToken createGetSecurityToken() {
        return new GetSecurityToken();
    }

    /**
     * Create an instance of {@link GetSecurityTokenResponse }
     * 
     */
    public GetSecurityTokenResponse createGetSecurityTokenResponse() {
        return new GetSecurityTokenResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link MPOrderRequest }
     * 
     */
    public MPOrderRequest createMPOrderRequest() {
        return new MPOrderRequest();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link MPOrderResponse }
     * 
     */
    public MPOrderResponse createMPOrderResponse() {
        return new MPOrderResponse();
    }

    /**
     * Create an instance of {@link ConfirmOrder }
     * 
     */
    public ConfirmOrder createConfirmOrder() {
        return new ConfirmOrder();
    }

    /**
     * Create an instance of {@link ConfirmOrderResponse }
     * 
     */
    public ConfirmOrderResponse createConfirmOrderResponse() {
        return new ConfirmOrderResponse();
    }

    /**
     * Create an instance of {@link CreateAndConfirmOrder }
     * 
     */
    public CreateAndConfirmOrder createCreateAndConfirmOrder() {
        return new CreateAndConfirmOrder();
    }

    /**
     * Create an instance of {@link CreateAndConfirmOrderResponse }
     * 
     */
    public CreateAndConfirmOrderResponse createCreateAndConfirmOrderResponse() {
        return new CreateAndConfirmOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrderByOrderID }
     * 
     */
    public GetOrderByOrderID createGetOrderByOrderID() {
        return new GetOrderByOrderID();
    }

    /**
     * Create an instance of {@link GetOrderByOrderIDResponse }
     * 
     */
    public GetOrderByOrderIDResponse createGetOrderByOrderIDResponse() {
        return new GetOrderByOrderIDResponse();
    }

    /**
     * Create an instance of {@link GetOrdersBySearchParameters }
     * 
     */
    public GetOrdersBySearchParameters createGetOrdersBySearchParameters() {
        return new GetOrdersBySearchParameters();
    }

    /**
     * Create an instance of {@link MPOrderSearchRequest }
     * 
     */
    public MPOrderSearchRequest createMPOrderSearchRequest() {
        return new MPOrderSearchRequest();
    }

    /**
     * Create an instance of {@link GetOrdersBySearchParametersResponse }
     * 
     */
    public GetOrdersBySearchParametersResponse createGetOrdersBySearchParametersResponse() {
        return new GetOrdersBySearchParametersResponse();
    }

    /**
     * Create an instance of {@link MPOrderListResponse }
     * 
     */
    public MPOrderListResponse createMPOrderListResponse() {
        return new MPOrderListResponse();
    }

    /**
     * Create an instance of {@link ModifyOrder }
     * 
     */
    public ModifyOrder createModifyOrder() {
        return new ModifyOrder();
    }

    /**
     * Create an instance of {@link ModifyOrderResponse }
     * 
     */
    public ModifyOrderResponse createModifyOrderResponse() {
        return new ModifyOrderResponse();
    }

    /**
     * Create an instance of {@link CancelOrder }
     * 
     */
    public CancelOrder createCancelOrder() {
        return new CancelOrder();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link GetEstimatedDates }
     * 
     */
    public GetEstimatedDates createGetEstimatedDates() {
        return new GetEstimatedDates();
    }

    /**
     * Create an instance of {@link MPDatesRequest }
     * 
     */
    public MPDatesRequest createMPDatesRequest() {
        return new MPDatesRequest();
    }

    /**
     * Create an instance of {@link GetEstimatedDatesResponse }
     * 
     */
    public GetEstimatedDatesResponse createGetEstimatedDatesResponse() {
        return new GetEstimatedDatesResponse();
    }

    /**
     * Create an instance of {@link MPDatesResponse }
     * 
     */
    public MPDatesResponse createMPDatesResponse() {
        return new MPDatesResponse();
    }

    /**
     * Create an instance of {@link GetShipmentRate }
     * 
     */
    public GetShipmentRate createGetShipmentRate() {
        return new GetShipmentRate();
    }

    /**
     * Create an instance of {@link MPShipmentRequest }
     * 
     */
    public MPShipmentRequest createMPShipmentRequest() {
        return new MPShipmentRequest();
    }

    /**
     * Create an instance of {@link GetShipmentRateResponse }
     * 
     */
    public GetShipmentRateResponse createGetShipmentRateResponse() {
        return new GetShipmentRateResponse();
    }

    /**
     * Create an instance of {@link MPShipmentResponse }
     * 
     */
    public MPShipmentResponse createMPShipmentResponse() {
        return new MPShipmentResponse();
    }

    /**
     * Create an instance of {@link MPGenericRequest }
     * 
     */
    public MPGenericRequest createMPGenericRequest() {
        return new MPGenericRequest();
    }

    /**
     * Create an instance of {@link MPRequestHeader }
     * 
     */
    public MPRequestHeader createMPRequestHeader() {
        return new MPRequestHeader();
    }

    /**
     * Create an instance of {@link MPHeader }
     * 
     */
    public MPHeader createMPHeader() {
        return new MPHeader();
    }

    /**
     * Create an instance of {@link MPResponseHeader }
     * 
     */
    public MPResponseHeader createMPResponseHeader() {
        return new MPResponseHeader();
    }

    /**
     * Create an instance of {@link MPResponseStatus }
     * 
     */
    public MPResponseStatus createMPResponseStatus() {
        return new MPResponseStatus();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfMPError }
     * 
     */
    public ArrayOfMPError createArrayOfMPError() {
        return new ArrayOfMPError();
    }

    /**
     * Create an instance of {@link MPError }
     * 
     */
    public MPError createMPError() {
        return new MPError();
    }

    /**
     * Create an instance of {@link MPEmailQueueRequest }
     * 
     */
    public MPEmailQueueRequest createMPEmailQueueRequest() {
        return new MPEmailQueueRequest();
    }

    /**
     * Create an instance of {@link MPEmailQueue }
     * 
     */
    public MPEmailQueue createMPEmailQueue() {
        return new MPEmailQueue();
    }

    /**
     * Create an instance of {@link MPBaseObject }
     * 
     */
    public MPBaseObject createMPBaseObject() {
        return new MPBaseObject();
    }

    /**
     * Create an instance of {@link MPOrderItemBaseObject }
     * 
     */
    public MPOrderItemBaseObject createMPOrderItemBaseObject() {
        return new MPOrderItemBaseObject();
    }

    /**
     * Create an instance of {@link ArrayOfMPPricing }
     * 
     */
    public ArrayOfMPPricing createArrayOfMPPricing() {
        return new ArrayOfMPPricing();
    }

    /**
     * Create an instance of {@link MPPricing }
     * 
     */
    public MPPricing createMPPricing() {
        return new MPPricing();
    }

    /**
     * Create an instance of {@link MPOrderItem }
     * 
     */
    public MPOrderItem createMPOrderItem() {
        return new MPOrderItem();
    }

    /**
     * Create an instance of {@link MPOrderLineBaseObject }
     * 
     */
    public MPOrderLineBaseObject createMPOrderLineBaseObject() {
        return new MPOrderLineBaseObject();
    }

    /**
     * Create an instance of {@link MPPart }
     * 
     */
    public MPPart createMPPart() {
        return new MPPart();
    }

    /**
     * Create an instance of {@link ArrayOfMPPlan }
     * 
     */
    public ArrayOfMPPlan createArrayOfMPPlan() {
        return new ArrayOfMPPlan();
    }

    /**
     * Create an instance of {@link MPPlan }
     * 
     */
    public MPPlan createMPPlan() {
        return new MPPlan();
    }

    /**
     * Create an instance of {@link ArrayOfMPImage }
     * 
     */
    public ArrayOfMPImage createArrayOfMPImage() {
        return new ArrayOfMPImage();
    }

    /**
     * Create an instance of {@link MPImage }
     * 
     */
    public MPImage createMPImage() {
        return new MPImage();
    }

    /**
     * Create an instance of {@link MPImageType }
     * 
     */
    public MPImageType createMPImageType() {
        return new MPImageType();
    }

    /**
     * Create an instance of {@link ArrayOfMPFeature }
     * 
     */
    public ArrayOfMPFeature createArrayOfMPFeature() {
        return new ArrayOfMPFeature();
    }

    /**
     * Create an instance of {@link MPFeature }
     * 
     */
    public MPFeature createMPFeature() {
        return new MPFeature();
    }

    /**
     * Create an instance of {@link ArrayOfMPOrderItem }
     * 
     */
    public ArrayOfMPOrderItem createArrayOfMPOrderItem() {
        return new ArrayOfMPOrderItem();
    }

    /**
     * Create an instance of {@link MPOrderReserve }
     * 
     */
    public MPOrderReserve createMPOrderReserve() {
        return new MPOrderReserve();
    }

    /**
     * Create an instance of {@link MPOrderLine }
     * 
     */
    public MPOrderLine createMPOrderLine() {
        return new MPOrderLine();
    }

    /**
     * Create an instance of {@link MPShippingAddress }
     * 
     */
    public MPShippingAddress createMPShippingAddress() {
        return new MPShippingAddress();
    }

    /**
     * Create an instance of {@link MPAddress }
     * 
     */
    public MPAddress createMPAddress() {
        return new MPAddress();
    }

    /**
     * Create an instance of {@link MPCustomerAddress }
     * 
     */
    public MPCustomerAddress createMPCustomerAddress() {
        return new MPCustomerAddress();
    }

    /**
     * Create an instance of {@link MPOrderBaseObject }
     * 
     */
    public MPOrderBaseObject createMPOrderBaseObject() {
        return new MPOrderBaseObject();
    }

    /**
     * Create an instance of {@link MPOrder }
     * 
     */
    public MPOrder createMPOrder() {
        return new MPOrder();
    }

    /**
     * Create an instance of {@link ArrayOfMPOrderLine }
     * 
     */
    public ArrayOfMPOrderLine createArrayOfMPOrderLine() {
        return new ArrayOfMPOrderLine();
    }

    /**
     * Create an instance of {@link ArrayOfMPOrderReserve }
     * 
     */
    public ArrayOfMPOrderReserve createArrayOfMPOrderReserve() {
        return new ArrayOfMPOrderReserve();
    }

    /**
     * Create an instance of {@link MPListOfMPOrder }
     * 
     */
    public MPListOfMPOrder createMPListOfMPOrder() {
        return new MPListOfMPOrder();
    }

    /**
     * Create an instance of {@link ArrayOfMPOrder }
     * 
     */
    public ArrayOfMPOrder createArrayOfMPOrder() {
        return new ArrayOfMPOrder();
    }

    /**
     * Create an instance of {@link MPOrderList }
     * 
     */
    public MPOrderList createMPOrderList() {
        return new MPOrderList();
    }

    /**
     * Create an instance of {@link MPOrganization }
     * 
     */
    public MPOrganization createMPOrganization() {
        return new MPOrganization();
    }

    /**
     * Create an instance of {@link MPCompanyList }
     * 
     */
    public MPCompanyList createMPCompanyList() {
        return new MPCompanyList();
    }

    /**
     * Create an instance of {@link MPListOfMPCompany }
     * 
     */
    public MPListOfMPCompany createMPListOfMPCompany() {
        return new MPListOfMPCompany();
    }

    /**
     * Create an instance of {@link ArrayOfMPCompany }
     * 
     */
    public ArrayOfMPCompany createArrayOfMPCompany() {
        return new ArrayOfMPCompany();
    }

    /**
     * Create an instance of {@link MPCompany }
     * 
     */
    public MPCompany createMPCompany() {
        return new MPCompany();
    }

    /**
     * Create an instance of {@link MPCompanyLocationList }
     * 
     */
    public MPCompanyLocationList createMPCompanyLocationList() {
        return new MPCompanyLocationList();
    }

    /**
     * Create an instance of {@link MPListOfMPCompanyLocation }
     * 
     */
    public MPListOfMPCompanyLocation createMPListOfMPCompanyLocation() {
        return new MPListOfMPCompanyLocation();
    }

    /**
     * Create an instance of {@link ArrayOfMPCompanyLocation }
     * 
     */
    public ArrayOfMPCompanyLocation createArrayOfMPCompanyLocation() {
        return new ArrayOfMPCompanyLocation();
    }

    /**
     * Create an instance of {@link MPCompanyLocation }
     * 
     */
    public MPCompanyLocation createMPCompanyLocation() {
        return new MPCompanyLocation();
    }

    /**
     * Create an instance of {@link MPLocationAppList }
     * 
     */
    public MPLocationAppList createMPLocationAppList() {
        return new MPLocationAppList();
    }

    /**
     * Create an instance of {@link MPListOfMPLocationApp }
     * 
     */
    public MPListOfMPLocationApp createMPListOfMPLocationApp() {
        return new MPListOfMPLocationApp();
    }

    /**
     * Create an instance of {@link ArrayOfMPLocationApp }
     * 
     */
    public ArrayOfMPLocationApp createArrayOfMPLocationApp() {
        return new ArrayOfMPLocationApp();
    }

    /**
     * Create an instance of {@link MPLocationApp }
     * 
     */
    public MPLocationApp createMPLocationApp() {
        return new MPLocationApp();
    }

    /**
     * Create an instance of {@link MPCatalogList }
     * 
     */
    public MPCatalogList createMPCatalogList() {
        return new MPCatalogList();
    }

    /**
     * Create an instance of {@link MPListOfMPCatalog }
     * 
     */
    public MPListOfMPCatalog createMPListOfMPCatalog() {
        return new MPListOfMPCatalog();
    }

    /**
     * Create an instance of {@link ArrayOfMPCatalog }
     * 
     */
    public ArrayOfMPCatalog createArrayOfMPCatalog() {
        return new ArrayOfMPCatalog();
    }

    /**
     * Create an instance of {@link MPCatalog }
     * 
     */
    public MPCatalog createMPCatalog() {
        return new MPCatalog();
    }

    /**
     * Create an instance of {@link ArrayOfMPPart }
     * 
     */
    public ArrayOfMPPart createArrayOfMPPart() {
        return new ArrayOfMPPart();
    }

    /**
     * Create an instance of {@link MPOrganizationList }
     * 
     */
    public MPOrganizationList createMPOrganizationList() {
        return new MPOrganizationList();
    }

    /**
     * Create an instance of {@link MPListOfMPOrganization }
     * 
     */
    public MPListOfMPOrganization createMPListOfMPOrganization() {
        return new MPListOfMPOrganization();
    }

    /**
     * Create an instance of {@link ArrayOfMPOrganization }
     * 
     */
    public ArrayOfMPOrganization createArrayOfMPOrganization() {
        return new ArrayOfMPOrganization();
    }

    /**
     * Create an instance of {@link MPListOfMPCarrier }
     * 
     */
    public MPListOfMPCarrier createMPListOfMPCarrier() {
        return new MPListOfMPCarrier();
    }

    /**
     * Create an instance of {@link ArrayOfMPCarrier }
     * 
     */
    public ArrayOfMPCarrier createArrayOfMPCarrier() {
        return new ArrayOfMPCarrier();
    }

    /**
     * Create an instance of {@link MPCarrier }
     * 
     */
    public MPCarrier createMPCarrier() {
        return new MPCarrier();
    }

    /**
     * Create an instance of {@link MPCarrierList }
     * 
     */
    public MPCarrierList createMPCarrierList() {
        return new MPCarrierList();
    }

    /**
     * Create an instance of {@link MPListOfMPPart }
     * 
     */
    public MPListOfMPPart createMPListOfMPPart() {
        return new MPListOfMPPart();
    }

    /**
     * Create an instance of {@link MPPartList }
     * 
     */
    public MPPartList createMPPartList() {
        return new MPPartList();
    }

    /**
     * Create an instance of {@link MPListOfMPUser }
     * 
     */
    public MPListOfMPUser createMPListOfMPUser() {
        return new MPListOfMPUser();
    }

    /**
     * Create an instance of {@link ArrayOfMPUser }
     * 
     */
    public ArrayOfMPUser createArrayOfMPUser() {
        return new ArrayOfMPUser();
    }

    /**
     * Create an instance of {@link MPUser }
     * 
     */
    public MPUser createMPUser() {
        return new MPUser();
    }

    /**
     * Create an instance of {@link MPRoleMaster }
     * 
     */
    public MPRoleMaster createMPRoleMaster() {
        return new MPRoleMaster();
    }

    /**
     * Create an instance of {@link MPListOfMPRoleMaster }
     * 
     */
    public MPListOfMPRoleMaster createMPListOfMPRoleMaster() {
        return new MPListOfMPRoleMaster();
    }

    /**
     * Create an instance of {@link ArrayOfMPRoleMaster }
     * 
     */
    public ArrayOfMPRoleMaster createArrayOfMPRoleMaster() {
        return new ArrayOfMPRoleMaster();
    }

    /**
     * Create an instance of {@link MPMaintDefaultRoleAccessList }
     * 
     */
    public MPMaintDefaultRoleAccessList createMPMaintDefaultRoleAccessList() {
        return new MPMaintDefaultRoleAccessList();
    }

    /**
     * Create an instance of {@link MPListOfMPMaintDefaultRoleAccess }
     * 
     */
    public MPListOfMPMaintDefaultRoleAccess createMPListOfMPMaintDefaultRoleAccess() {
        return new MPListOfMPMaintDefaultRoleAccess();
    }

    /**
     * Create an instance of {@link ArrayOfMPMaintDefaultRoleAccess }
     * 
     */
    public ArrayOfMPMaintDefaultRoleAccess createArrayOfMPMaintDefaultRoleAccess() {
        return new ArrayOfMPMaintDefaultRoleAccess();
    }

    /**
     * Create an instance of {@link MPMaintDefaultRoleAccess }
     * 
     */
    public MPMaintDefaultRoleAccess createMPMaintDefaultRoleAccess() {
        return new MPMaintDefaultRoleAccess();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link MPUserSecurityQuestionAnswerList }
     * 
     */
    public MPUserSecurityQuestionAnswerList createMPUserSecurityQuestionAnswerList() {
        return new MPUserSecurityQuestionAnswerList();
    }

    /**
     * Create an instance of {@link MPListOfMPUserSecurityQuestionAnswer }
     * 
     */
    public MPListOfMPUserSecurityQuestionAnswer createMPListOfMPUserSecurityQuestionAnswer() {
        return new MPListOfMPUserSecurityQuestionAnswer();
    }

    /**
     * Create an instance of {@link ArrayOfMPUserSecurityQuestionAnswer }
     * 
     */
    public ArrayOfMPUserSecurityQuestionAnswer createArrayOfMPUserSecurityQuestionAnswer() {
        return new ArrayOfMPUserSecurityQuestionAnswer();
    }

    /**
     * Create an instance of {@link MPUserSecurityQuestionAnswer }
     * 
     */
    public MPUserSecurityQuestionAnswer createMPUserSecurityQuestionAnswer() {
        return new MPUserSecurityQuestionAnswer();
    }

    /**
     * Create an instance of {@link MPUserList }
     * 
     */
    public MPUserList createMPUserList() {
        return new MPUserList();
    }

    /**
     * Create an instance of {@link MPEmailMetaData }
     * 
     */
    public MPEmailMetaData createMPEmailMetaData() {
        return new MPEmailMetaData();
    }

    /**
     * Create an instance of {@link MPEmailData }
     * 
     */
    public MPEmailData createMPEmailData() {
        return new MPEmailData();
    }

    /**
     * Create an instance of {@link MPCompanyRequest }
     * 
     */
    public MPCompanyRequest createMPCompanyRequest() {
        return new MPCompanyRequest();
    }

    /**
     * Create an instance of {@link MPCarrierRequest }
     * 
     */
    public MPCarrierRequest createMPCarrierRequest() {
        return new MPCarrierRequest();
    }

    /**
     * Create an instance of {@link MPPartRequest }
     * 
     */
    public MPPartRequest createMPPartRequest() {
        return new MPPartRequest();
    }

    /**
     * Create an instance of {@link MPUserRequest }
     * 
     */
    public MPUserRequest createMPUserRequest() {
        return new MPUserRequest();
    }

    /**
     * Create an instance of {@link MPEmailDataRequest }
     * 
     */
    public MPEmailDataRequest createMPEmailDataRequest() {
        return new MPEmailDataRequest();
    }

    /**
     * Create an instance of {@link MPGenericListResponse }
     * 
     */
    public MPGenericListResponse createMPGenericListResponse() {
        return new MPGenericListResponse();
    }

    /**
     * Create an instance of {@link MPUserListResponse }
     * 
     */
    public MPUserListResponse createMPUserListResponse() {
        return new MPUserListResponse();
    }

    /**
     * Create an instance of {@link MPPartListResponse }
     * 
     */
    public MPPartListResponse createMPPartListResponse() {
        return new MPPartListResponse();
    }

    /**
     * Create an instance of {@link MPCompanyListResponse }
     * 
     */
    public MPCompanyListResponse createMPCompanyListResponse() {
        return new MPCompanyListResponse();
    }

    /**
     * Create an instance of {@link MPCarrierListResponse }
     * 
     */
    public MPCarrierListResponse createMPCarrierListResponse() {
        return new MPCarrierListResponse();
    }

    /**
     * Create an instance of {@link MPGenericResponse }
     * 
     */
    public MPGenericResponse createMPGenericResponse() {
        return new MPGenericResponse();
    }

    /**
     * Create an instance of {@link MPUserResponse }
     * 
     */
    public MPUserResponse createMPUserResponse() {
        return new MPUserResponse();
    }

    /**
     * Create an instance of {@link MPCarrierResponse }
     * 
     */
    public MPCarrierResponse createMPCarrierResponse() {
        return new MPCarrierResponse();
    }

    /**
     * Create an instance of {@link MPPartResponse }
     * 
     */
    public MPPartResponse createMPPartResponse() {
        return new MPPartResponse();
    }

    /**
     * Create an instance of {@link MPCompanyResponse }
     * 
     */
    public MPCompanyResponse createMPCompanyResponse() {
        return new MPCompanyResponse();
    }

    /**
     * Create an instance of {@link MPEmailQueueResponse }
     * 
     */
    public MPEmailQueueResponse createMPEmailQueueResponse() {
        return new MPEmailQueueResponse();
    }

    /**
     * Create an instance of {@link MPEmailDataResponse }
     * 
     */
    public MPEmailDataResponse createMPEmailDataResponse() {
        return new MPEmailDataResponse();
    }

    /**
     * Create an instance of {@link MPGenericListRequest }
     * 
     */
    public MPGenericListRequest createMPGenericListRequest() {
        return new MPGenericListRequest();
    }

    /**
     * Create an instance of {@link MPOrderListRequest }
     * 
     */
    public MPOrderListRequest createMPOrderListRequest() {
        return new MPOrderListRequest();
    }

    /**
     * Create an instance of {@link MPCompanyListRequest }
     * 
     */
    public MPCompanyListRequest createMPCompanyListRequest() {
        return new MPCompanyListRequest();
    }

    /**
     * Create an instance of {@link MPCarrierListRequest }
     * 
     */
    public MPCarrierListRequest createMPCarrierListRequest() {
        return new MPCarrierListRequest();
    }

    /**
     * Create an instance of {@link MPPartListRequest }
     * 
     */
    public MPPartListRequest createMPPartListRequest() {
        return new MPPartListRequest();
    }

    /**
     * Create an instance of {@link MPUserListRequest }
     * 
     */
    public MPUserListRequest createMPUserListRequest() {
        return new MPUserListRequest();
    }

    /**
     * Create an instance of {@link MPOrderSearch }
     * 
     */
    public MPOrderSearch createMPOrderSearch() {
        return new MPOrderSearch();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfOrderStatus }
     * 
     */
    public ArrayOfOrderStatus createArrayOfOrderStatus() {
        return new ArrayOfOrderStatus();
    }

    /**
     * Create an instance of {@link MPDates }
     * 
     */
    public MPDates createMPDates() {
        return new MPDates();
    }

    /**
     * Create an instance of {@link MPShipment }
     * 
     */
    public MPShipment createMPShipment() {
        return new MPShipment();
    }

    /**
     * Create an instance of {@link ArrayOfMPShipmentItem }
     * 
     */
    public ArrayOfMPShipmentItem createArrayOfMPShipmentItem() {
        return new ArrayOfMPShipmentItem();
    }

    /**
     * Create an instance of {@link MPShipmentItem }
     * 
     */
    public MPShipmentItem createMPShipmentItem() {
        return new MPShipmentItem();
    }

    /**
     * Create an instance of {@link ArrayOfMPShipPackage }
     * 
     */
    public ArrayOfMPShipPackage createArrayOfMPShipPackage() {
        return new ArrayOfMPShipPackage();
    }

    /**
     * Create an instance of {@link MPShipPackage }
     * 
     */
    public MPShipPackage createMPShipPackage() {
        return new MPShipPackage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.marketplace.brightstar.com/", name = "ERPCreateDate", scope = MPOrder.class)
    public JAXBElement<XMLGregorianCalendar> createMPOrderERPCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MPOrderERPCreateDate_QNAME, XMLGregorianCalendar.class, MPOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.marketplace.brightstar.com/", name = "ERPCancelDate", scope = MPOrder.class)
    public JAXBElement<XMLGregorianCalendar> createMPOrderERPCancelDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MPOrderERPCancelDate_QNAME, XMLGregorianCalendar.class, MPOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.marketplace.brightstar.com/", name = "ERPOrderID", scope = MPOrderLineBaseObject.class)
    public JAXBElement<Integer> createMPOrderLineBaseObjectERPOrderID(Integer value) {
        return new JAXBElement<Integer>(_MPOrderLineBaseObjectERPOrderID_QNAME, Integer.class, MPOrderLineBaseObject.class, value);
    }

}
