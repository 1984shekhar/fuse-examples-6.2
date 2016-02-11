
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfCustomerChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrollmentResultCode;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipment;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfPhoneNumberChange;
import org.datacontract.schemas._2004._07.integrationservice.ArrayOfServicePlanChange;
import org.datacontract.schemas._2004._07.integrationservice.ChannelInformation;
import org.datacontract.schemas._2004._07.integrationservice.Customer;
import org.datacontract.schemas._2004._07.integrationservice.ModelResult;
import org.datacontract.schemas._2004._07.integrationservice.Result;
import org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult;
import org.datacontract.schemas._2004._07.integrationservice.ServicePlanResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _EnrollCustomer_QNAME = new QName("http://tempuri.org/", "customer");
    private final static QName _EnrollEquipment_QNAME = new QName("http://tempuri.org/", "equipment");
    private final static QName _EnrollPayment_QNAME = new QName("http://tempuri.org/", "payment");
    private final static QName _EnrollChannelInformation_QNAME = new QName("http://tempuri.org/", "channelInformation");
    private final static QName _EnrollResponseEnrollResult_QNAME = new QName("http://tempuri.org/", "EnrollResult");
    private final static QName _CancelCoverageAccountNumber_QNAME = new QName("http://tempuri.org/", "accountNumber");
    private final static QName _CancelCoverageEnrolledEquipment_QNAME = new QName("http://tempuri.org/", "enrolledEquipment");
    private final static QName _CancelCoverageCancelDate_QNAME = new QName("http://tempuri.org/", "cancelDate");
    private final static QName _CancelCoverageResponseCancelCoverageResult_QNAME = new QName("http://tempuri.org/", "CancelCoverageResult");
    private final static QName _SuspendSuspendDate_QNAME = new QName("http://tempuri.org/", "suspendDate");
    private final static QName _SuspendResponseSuspendResult_QNAME = new QName("http://tempuri.org/", "SuspendResult");
    private final static QName _ResumeResumeDate_QNAME = new QName("http://tempuri.org/", "resumeDate");
    private final static QName _ResumeResponseResumeResult_QNAME = new QName("http://tempuri.org/", "ResumeResult");
    private final static QName _ChangeServicePlanServicePlanChange_QNAME = new QName("http://tempuri.org/", "servicePlanChange");
    private final static QName _ChangeServicePlanResponseChangeServicePlanResult_QNAME = new QName("http://tempuri.org/", "ChangeServicePlanResult");
    private final static QName _ChangeEquipmentEquipmentChange_QNAME = new QName("http://tempuri.org/", "equipmentChange");
    private final static QName _ChangeEquipmentResponseChangeEquipmentResult_QNAME = new QName("http://tempuri.org/", "ChangeEquipmentResult");
    private final static QName _TransferEquipmentAccountNumberChange_QNAME = new QName("http://tempuri.org/", "accountNumberChange");
    private final static QName _TransferEquipmentNewCustomer_QNAME = new QName("http://tempuri.org/", "newCustomer");
    private final static QName _TransferEquipmentResponseTransferEquipmentResult_QNAME = new QName("http://tempuri.org/", "TransferEquipmentResult");
    private final static QName _ChangeCustomerInformationCustomerChange_QNAME = new QName("http://tempuri.org/", "customerChange");
    private final static QName _ChangeCustomerInformationResponseChangeCustomerInformationResult_QNAME = new QName("http://tempuri.org/", "ChangeCustomerInformationResult");
    private final static QName _ChangeAccountNumberResponseChangeAccountNumberResult_QNAME = new QName("http://tempuri.org/", "ChangeAccountNumberResult");
    private final static QName _ChangeCustomerAccountNumberNewAccountNumber_QNAME = new QName("http://tempuri.org/", "newAccountNumber");
    private final static QName _ChangeCustomerAccountNumberPhoneNumber_QNAME = new QName("http://tempuri.org/", "phoneNumber");
    private final static QName _ChangeCustomerAccountNumberResponseChangeCustomerAccountNumberResult_QNAME = new QName("http://tempuri.org/", "ChangeCustomerAccountNumberResult");
    private final static QName _ChangePhoneNumberPhoneNumberChange_QNAME = new QName("http://tempuri.org/", "phoneNumberChange");
    private final static QName _ChangePhoneNumberResponseChangePhoneNumberResult_QNAME = new QName("http://tempuri.org/", "ChangePhoneNumberResult");
    private final static QName _UpdatePaymentResponseUpdatePaymentResult_QNAME = new QName("http://tempuri.org/", "UpdatePaymentResult");
    private final static QName _SelectSkuResponseSelectSkuResult_QNAME = new QName("http://tempuri.org/", "SelectSkuResult");
    private final static QName _SelectServicePlanResponseSelectServicePlanResult_QNAME = new QName("http://tempuri.org/", "SelectServicePlanResult");
    private final static QName _SelectResultCodesResponseSelectResultCodesResult_QNAME = new QName("http://tempuri.org/", "SelectResultCodesResult");
    private final static QName _GetServicePlanDetailsResponseGetServicePlanDetailsResult_QNAME = new QName("http://tempuri.org/", "GetServicePlanDetailsResult");
    private final static QName _GetServicePlanDetailAndSkuFeatureCode_QNAME = new QName("http://tempuri.org/", "featureCode");
    private final static QName _GetServicePlanDetailAndSkuProductDescription_QNAME = new QName("http://tempuri.org/", "productDescription");
    private final static QName _GetServicePlanDetailAndSkuResponseGetServicePlanDetailAndSkuResult_QNAME = new QName("http://tempuri.org/", "GetServicePlanDetailAndSkuResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Enroll }
     * 
     */
    public Enroll createEnroll() {
        return new Enroll();
    }

    /**
     * Create an instance of {@link EnrollResponse }
     * 
     */
    public EnrollResponse createEnrollResponse() {
        return new EnrollResponse();
    }

    /**
     * Create an instance of {@link CancelCoverage }
     * 
     */
    public CancelCoverage createCancelCoverage() {
        return new CancelCoverage();
    }

    /**
     * Create an instance of {@link CancelCoverageResponse }
     * 
     */
    public CancelCoverageResponse createCancelCoverageResponse() {
        return new CancelCoverageResponse();
    }

    /**
     * Create an instance of {@link Suspend }
     * 
     */
    public Suspend createSuspend() {
        return new Suspend();
    }

    /**
     * Create an instance of {@link SuspendResponse }
     * 
     */
    public SuspendResponse createSuspendResponse() {
        return new SuspendResponse();
    }

    /**
     * Create an instance of {@link Resume }
     * 
     */
    public Resume createResume() {
        return new Resume();
    }

    /**
     * Create an instance of {@link ResumeResponse }
     * 
     */
    public ResumeResponse createResumeResponse() {
        return new ResumeResponse();
    }

    /**
     * Create an instance of {@link ChangeServicePlan }
     * 
     */
    public ChangeServicePlan createChangeServicePlan() {
        return new ChangeServicePlan();
    }

    /**
     * Create an instance of {@link ChangeServicePlanResponse }
     * 
     */
    public ChangeServicePlanResponse createChangeServicePlanResponse() {
        return new ChangeServicePlanResponse();
    }

    /**
     * Create an instance of {@link ChangeEquipment }
     * 
     */
    public ChangeEquipment createChangeEquipment() {
        return new ChangeEquipment();
    }

    /**
     * Create an instance of {@link ChangeEquipmentResponse }
     * 
     */
    public ChangeEquipmentResponse createChangeEquipmentResponse() {
        return new ChangeEquipmentResponse();
    }

    /**
     * Create an instance of {@link TransferEquipment }
     * 
     */
    public TransferEquipment createTransferEquipment() {
        return new TransferEquipment();
    }

    /**
     * Create an instance of {@link TransferEquipmentResponse }
     * 
     */
    public TransferEquipmentResponse createTransferEquipmentResponse() {
        return new TransferEquipmentResponse();
    }

    /**
     * Create an instance of {@link ChangeCustomerInformation }
     * 
     */
    public ChangeCustomerInformation createChangeCustomerInformation() {
        return new ChangeCustomerInformation();
    }

    /**
     * Create an instance of {@link ChangeCustomerInformationResponse }
     * 
     */
    public ChangeCustomerInformationResponse createChangeCustomerInformationResponse() {
        return new ChangeCustomerInformationResponse();
    }

    /**
     * Create an instance of {@link ChangeAccountNumber }
     * 
     */
    public ChangeAccountNumber createChangeAccountNumber() {
        return new ChangeAccountNumber();
    }

    /**
     * Create an instance of {@link ChangeAccountNumberResponse }
     * 
     */
    public ChangeAccountNumberResponse createChangeAccountNumberResponse() {
        return new ChangeAccountNumberResponse();
    }

    /**
     * Create an instance of {@link ChangeCustomerAccountNumber }
     * 
     */
    public ChangeCustomerAccountNumber createChangeCustomerAccountNumber() {
        return new ChangeCustomerAccountNumber();
    }

    /**
     * Create an instance of {@link ChangeCustomerAccountNumberResponse }
     * 
     */
    public ChangeCustomerAccountNumberResponse createChangeCustomerAccountNumberResponse() {
        return new ChangeCustomerAccountNumberResponse();
    }

    /**
     * Create an instance of {@link ChangePhoneNumber }
     * 
     */
    public ChangePhoneNumber createChangePhoneNumber() {
        return new ChangePhoneNumber();
    }

    /**
     * Create an instance of {@link ChangePhoneNumberResponse }
     * 
     */
    public ChangePhoneNumberResponse createChangePhoneNumberResponse() {
        return new ChangePhoneNumberResponse();
    }

    /**
     * Create an instance of {@link UpdatePayment }
     * 
     */
    public UpdatePayment createUpdatePayment() {
        return new UpdatePayment();
    }

    /**
     * Create an instance of {@link UpdatePaymentResponse }
     * 
     */
    public UpdatePaymentResponse createUpdatePaymentResponse() {
        return new UpdatePaymentResponse();
    }

    /**
     * Create an instance of {@link SelectSku }
     * 
     */
    public SelectSku createSelectSku() {
        return new SelectSku();
    }

    /**
     * Create an instance of {@link SelectSkuResponse }
     * 
     */
    public SelectSkuResponse createSelectSkuResponse() {
        return new SelectSkuResponse();
    }

    /**
     * Create an instance of {@link SelectServicePlan }
     * 
     */
    public SelectServicePlan createSelectServicePlan() {
        return new SelectServicePlan();
    }

    /**
     * Create an instance of {@link SelectServicePlanResponse }
     * 
     */
    public SelectServicePlanResponse createSelectServicePlanResponse() {
        return new SelectServicePlanResponse();
    }

    /**
     * Create an instance of {@link SelectResultCodes }
     * 
     */
    public SelectResultCodes createSelectResultCodes() {
        return new SelectResultCodes();
    }

    /**
     * Create an instance of {@link SelectResultCodesResponse }
     * 
     */
    public SelectResultCodesResponse createSelectResultCodesResponse() {
        return new SelectResultCodesResponse();
    }

    /**
     * Create an instance of {@link GetServicePlanDetails }
     * 
     */
    public GetServicePlanDetails createGetServicePlanDetails() {
        return new GetServicePlanDetails();
    }

    /**
     * Create an instance of {@link GetServicePlanDetailsResponse }
     * 
     */
    public GetServicePlanDetailsResponse createGetServicePlanDetailsResponse() {
        return new GetServicePlanDetailsResponse();
    }

    /**
     * Create an instance of {@link GetServicePlanDetailAndSku }
     * 
     */
    public GetServicePlanDetailAndSku createGetServicePlanDetailAndSku() {
        return new GetServicePlanDetailAndSku();
    }

    /**
     * Create an instance of {@link GetServicePlanDetailAndSkuResponse }
     * 
     */
    public GetServicePlanDetailAndSkuResponse createGetServicePlanDetailAndSkuResponse() {
        return new GetServicePlanDetailAndSkuResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customer", scope = Enroll.class)
    public JAXBElement<Customer> createEnrollCustomer(Customer value) {
        return new JAXBElement<Customer>(_EnrollCustomer_QNAME, Customer.class, Enroll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "equipment", scope = Enroll.class)
    public JAXBElement<ArrayOfEquipment> createEnrollEquipment(ArrayOfEquipment value) {
        return new JAXBElement<ArrayOfEquipment>(_EnrollEquipment_QNAME, ArrayOfEquipment.class, Enroll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payment", scope = Enroll.class)
    public JAXBElement<ArrayOfPayment> createEnrollPayment(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_EnrollPayment_QNAME, ArrayOfPayment.class, Enroll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = Enroll.class)
    public JAXBElement<ChannelInformation> createEnrollChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, Enroll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnrollResult", scope = EnrollResponse.class)
    public JAXBElement<Result> createEnrollResponseEnrollResult(Result value) {
        return new JAXBElement<Result>(_EnrollResponseEnrollResult_QNAME, Result.class, EnrollResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = CancelCoverage.class)
    public JAXBElement<String> createCancelCoverageAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, CancelCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnrolledEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "enrolledEquipment", scope = CancelCoverage.class)
    public JAXBElement<ArrayOfEnrolledEquipment> createCancelCoverageEnrolledEquipment(ArrayOfEnrolledEquipment value) {
        return new JAXBElement<ArrayOfEnrolledEquipment>(_CancelCoverageEnrolledEquipment_QNAME, ArrayOfEnrolledEquipment.class, CancelCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancelDate", scope = CancelCoverage.class)
    public JAXBElement<String> createCancelCoverageCancelDate(String value) {
        return new JAXBElement<String>(_CancelCoverageCancelDate_QNAME, String.class, CancelCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = CancelCoverage.class)
    public JAXBElement<ChannelInformation> createCancelCoverageChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, CancelCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelCoverageResult", scope = CancelCoverageResponse.class)
    public JAXBElement<Result> createCancelCoverageResponseCancelCoverageResult(Result value) {
        return new JAXBElement<Result>(_CancelCoverageResponseCancelCoverageResult_QNAME, Result.class, CancelCoverageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = Suspend.class)
    public JAXBElement<String> createSuspendAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, Suspend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnrolledEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "enrolledEquipment", scope = Suspend.class)
    public JAXBElement<ArrayOfEnrolledEquipment> createSuspendEnrolledEquipment(ArrayOfEnrolledEquipment value) {
        return new JAXBElement<ArrayOfEnrolledEquipment>(_CancelCoverageEnrolledEquipment_QNAME, ArrayOfEnrolledEquipment.class, Suspend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "suspendDate", scope = Suspend.class)
    public JAXBElement<String> createSuspendSuspendDate(String value) {
        return new JAXBElement<String>(_SuspendSuspendDate_QNAME, String.class, Suspend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = Suspend.class)
    public JAXBElement<ChannelInformation> createSuspendChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, Suspend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SuspendResult", scope = SuspendResponse.class)
    public JAXBElement<Result> createSuspendResponseSuspendResult(Result value) {
        return new JAXBElement<Result>(_SuspendResponseSuspendResult_QNAME, Result.class, SuspendResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = Resume.class)
    public JAXBElement<String> createResumeAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, Resume.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnrolledEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "enrolledEquipment", scope = Resume.class)
    public JAXBElement<ArrayOfEnrolledEquipment> createResumeEnrolledEquipment(ArrayOfEnrolledEquipment value) {
        return new JAXBElement<ArrayOfEnrolledEquipment>(_CancelCoverageEnrolledEquipment_QNAME, ArrayOfEnrolledEquipment.class, Resume.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "resumeDate", scope = Resume.class)
    public JAXBElement<String> createResumeResumeDate(String value) {
        return new JAXBElement<String>(_ResumeResumeDate_QNAME, String.class, Resume.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = Resume.class)
    public JAXBElement<ChannelInformation> createResumeChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, Resume.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ResumeResult", scope = ResumeResponse.class)
    public JAXBElement<Result> createResumeResponseResumeResult(Result value) {
        return new JAXBElement<Result>(_ResumeResponseResumeResult_QNAME, Result.class, ResumeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = ChangeServicePlan.class)
    public JAXBElement<String> createChangeServicePlanAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, ChangeServicePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServicePlanChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "servicePlanChange", scope = ChangeServicePlan.class)
    public JAXBElement<ArrayOfServicePlanChange> createChangeServicePlanServicePlanChange(ArrayOfServicePlanChange value) {
        return new JAXBElement<ArrayOfServicePlanChange>(_ChangeServicePlanServicePlanChange_QNAME, ArrayOfServicePlanChange.class, ChangeServicePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangeServicePlan.class)
    public JAXBElement<ChannelInformation> createChangeServicePlanChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangeServicePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeServicePlanResult", scope = ChangeServicePlanResponse.class)
    public JAXBElement<Result> createChangeServicePlanResponseChangeServicePlanResult(Result value) {
        return new JAXBElement<Result>(_ChangeServicePlanResponseChangeServicePlanResult_QNAME, Result.class, ChangeServicePlanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = ChangeEquipment.class)
    public JAXBElement<String> createChangeEquipmentAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, ChangeEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "equipmentChange", scope = ChangeEquipment.class)
    public JAXBElement<ArrayOfEquipmentChange> createChangeEquipmentEquipmentChange(ArrayOfEquipmentChange value) {
        return new JAXBElement<ArrayOfEquipmentChange>(_ChangeEquipmentEquipmentChange_QNAME, ArrayOfEquipmentChange.class, ChangeEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangeEquipment.class)
    public JAXBElement<ChannelInformation> createChangeEquipmentChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangeEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeEquipmentResult", scope = ChangeEquipmentResponse.class)
    public JAXBElement<Result> createChangeEquipmentResponseChangeEquipmentResult(Result value) {
        return new JAXBElement<Result>(_ChangeEquipmentResponseChangeEquipmentResult_QNAME, Result.class, ChangeEquipmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumberChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumberChange", scope = TransferEquipment.class)
    public JAXBElement<AccountNumberChange> createTransferEquipmentAccountNumberChange(AccountNumberChange value) {
        return new JAXBElement<AccountNumberChange>(_TransferEquipmentAccountNumberChange_QNAME, AccountNumberChange.class, TransferEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newCustomer", scope = TransferEquipment.class)
    public JAXBElement<Customer> createTransferEquipmentNewCustomer(Customer value) {
        return new JAXBElement<Customer>(_TransferEquipmentNewCustomer_QNAME, Customer.class, TransferEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "equipmentChange", scope = TransferEquipment.class)
    public JAXBElement<ArrayOfEquipmentChange> createTransferEquipmentEquipmentChange(ArrayOfEquipmentChange value) {
        return new JAXBElement<ArrayOfEquipmentChange>(_ChangeEquipmentEquipmentChange_QNAME, ArrayOfEquipmentChange.class, TransferEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payment", scope = TransferEquipment.class)
    public JAXBElement<ArrayOfPayment> createTransferEquipmentPayment(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_EnrollPayment_QNAME, ArrayOfPayment.class, TransferEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = TransferEquipment.class)
    public JAXBElement<ChannelInformation> createTransferEquipmentChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, TransferEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TransferEquipmentResult", scope = TransferEquipmentResponse.class)
    public JAXBElement<Result> createTransferEquipmentResponseTransferEquipmentResult(Result value) {
        return new JAXBElement<Result>(_TransferEquipmentResponseTransferEquipmentResult_QNAME, Result.class, TransferEquipmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = ChangeCustomerInformation.class)
    public JAXBElement<String> createChangeCustomerInformationAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, ChangeCustomerInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customerChange", scope = ChangeCustomerInformation.class)
    public JAXBElement<ArrayOfCustomerChange> createChangeCustomerInformationCustomerChange(ArrayOfCustomerChange value) {
        return new JAXBElement<ArrayOfCustomerChange>(_ChangeCustomerInformationCustomerChange_QNAME, ArrayOfCustomerChange.class, ChangeCustomerInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangeCustomerInformation.class)
    public JAXBElement<ChannelInformation> createChangeCustomerInformationChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangeCustomerInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeCustomerInformationResult", scope = ChangeCustomerInformationResponse.class)
    public JAXBElement<Result> createChangeCustomerInformationResponseChangeCustomerInformationResult(Result value) {
        return new JAXBElement<Result>(_ChangeCustomerInformationResponseChangeCustomerInformationResult_QNAME, Result.class, ChangeCustomerInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumberChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumberChange", scope = ChangeAccountNumber.class)
    public JAXBElement<AccountNumberChange> createChangeAccountNumberAccountNumberChange(AccountNumberChange value) {
        return new JAXBElement<AccountNumberChange>(_TransferEquipmentAccountNumberChange_QNAME, AccountNumberChange.class, ChangeAccountNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangeAccountNumber.class)
    public JAXBElement<ChannelInformation> createChangeAccountNumberChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangeAccountNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeAccountNumberResult", scope = ChangeAccountNumberResponse.class)
    public JAXBElement<Result> createChangeAccountNumberResponseChangeAccountNumberResult(Result value) {
        return new JAXBElement<Result>(_ChangeAccountNumberResponseChangeAccountNumberResult_QNAME, Result.class, ChangeAccountNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newAccountNumber", scope = ChangeCustomerAccountNumber.class)
    public JAXBElement<String> createChangeCustomerAccountNumberNewAccountNumber(String value) {
        return new JAXBElement<String>(_ChangeCustomerAccountNumberNewAccountNumber_QNAME, String.class, ChangeCustomerAccountNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "phoneNumber", scope = ChangeCustomerAccountNumber.class)
    public JAXBElement<String> createChangeCustomerAccountNumberPhoneNumber(String value) {
        return new JAXBElement<String>(_ChangeCustomerAccountNumberPhoneNumber_QNAME, String.class, ChangeCustomerAccountNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangeCustomerAccountNumber.class)
    public JAXBElement<ChannelInformation> createChangeCustomerAccountNumberChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangeCustomerAccountNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeCustomerAccountNumberResult", scope = ChangeCustomerAccountNumberResponse.class)
    public JAXBElement<Result> createChangeCustomerAccountNumberResponseChangeCustomerAccountNumberResult(Result value) {
        return new JAXBElement<Result>(_ChangeCustomerAccountNumberResponseChangeCustomerAccountNumberResult_QNAME, Result.class, ChangeCustomerAccountNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = ChangePhoneNumber.class)
    public JAXBElement<String> createChangePhoneNumberAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, ChangePhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumberChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "phoneNumberChange", scope = ChangePhoneNumber.class)
    public JAXBElement<ArrayOfPhoneNumberChange> createChangePhoneNumberPhoneNumberChange(ArrayOfPhoneNumberChange value) {
        return new JAXBElement<ArrayOfPhoneNumberChange>(_ChangePhoneNumberPhoneNumberChange_QNAME, ArrayOfPhoneNumberChange.class, ChangePhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = ChangePhoneNumber.class)
    public JAXBElement<ChannelInformation> createChangePhoneNumberChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, ChangePhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangePhoneNumberResult", scope = ChangePhoneNumberResponse.class)
    public JAXBElement<Result> createChangePhoneNumberResponseChangePhoneNumberResult(Result value) {
        return new JAXBElement<Result>(_ChangePhoneNumberResponseChangePhoneNumberResult_QNAME, Result.class, ChangePhoneNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountNumber", scope = UpdatePayment.class)
    public JAXBElement<String> createUpdatePaymentAccountNumber(String value) {
        return new JAXBElement<String>(_CancelCoverageAccountNumber_QNAME, String.class, UpdatePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payment", scope = UpdatePayment.class)
    public JAXBElement<ArrayOfPayment> createUpdatePaymentPayment(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_EnrollPayment_QNAME, ArrayOfPayment.class, UpdatePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channelInformation", scope = UpdatePayment.class)
    public JAXBElement<ChannelInformation> createUpdatePaymentChannelInformation(ChannelInformation value) {
        return new JAXBElement<ChannelInformation>(_EnrollChannelInformation_QNAME, ChannelInformation.class, UpdatePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdatePaymentResult", scope = UpdatePaymentResponse.class)
    public JAXBElement<Result> createUpdatePaymentResponseUpdatePaymentResult(Result value) {
        return new JAXBElement<Result>(_UpdatePaymentResponseUpdatePaymentResult_QNAME, Result.class, UpdatePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SelectSkuResult", scope = SelectSkuResponse.class)
    public JAXBElement<ModelResult> createSelectSkuResponseSelectSkuResult(ModelResult value) {
        return new JAXBElement<ModelResult>(_SelectSkuResponseSelectSkuResult_QNAME, ModelResult.class, SelectSkuResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePlanResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SelectServicePlanResult", scope = SelectServicePlanResponse.class)
    public JAXBElement<ServicePlanResult> createSelectServicePlanResponseSelectServicePlanResult(ServicePlanResult value) {
        return new JAXBElement<ServicePlanResult>(_SelectServicePlanResponseSelectServicePlanResult_QNAME, ServicePlanResult.class, SelectServicePlanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnrollmentResultCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SelectResultCodesResult", scope = SelectResultCodesResponse.class)
    public JAXBElement<ArrayOfEnrollmentResultCode> createSelectResultCodesResponseSelectResultCodesResult(ArrayOfEnrollmentResultCode value) {
        return new JAXBElement<ArrayOfEnrollmentResultCode>(_SelectResultCodesResponseSelectResultCodesResult_QNAME, ArrayOfEnrollmentResultCode.class, SelectResultCodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetServicePlanDetailsResult", scope = GetServicePlanDetailsResponse.class)
    public JAXBElement<ServicePlanDetailResult> createGetServicePlanDetailsResponseGetServicePlanDetailsResult(ServicePlanDetailResult value) {
        return new JAXBElement<ServicePlanDetailResult>(_GetServicePlanDetailsResponseGetServicePlanDetailsResult_QNAME, ServicePlanDetailResult.class, GetServicePlanDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "featureCode", scope = GetServicePlanDetailAndSku.class)
    public JAXBElement<String> createGetServicePlanDetailAndSkuFeatureCode(String value) {
        return new JAXBElement<String>(_GetServicePlanDetailAndSkuFeatureCode_QNAME, String.class, GetServicePlanDetailAndSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productDescription", scope = GetServicePlanDetailAndSku.class)
    public JAXBElement<String> createGetServicePlanDetailAndSkuProductDescription(String value) {
        return new JAXBElement<String>(_GetServicePlanDetailAndSkuProductDescription_QNAME, String.class, GetServicePlanDetailAndSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePlanDetailResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetServicePlanDetailAndSkuResult", scope = GetServicePlanDetailAndSkuResponse.class)
    public JAXBElement<ServicePlanDetailResult> createGetServicePlanDetailAndSkuResponseGetServicePlanDetailAndSkuResult(ServicePlanDetailResult value) {
        return new JAXBElement<ServicePlanDetailResult>(_GetServicePlanDetailAndSkuResponseGetServicePlanDetailAndSkuResult_QNAME, ServicePlanDetailResult.class, GetServicePlanDetailAndSkuResponse.class, value);
    }

}
