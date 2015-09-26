
package com.mycompany.business.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dtbafrica.business.service package. 
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

    private final static QName _PostTransaction_QNAME = new QName("http://service.business.dtbafrica.com/", "postTransaction");
    private final static QName _PostTransactionResponse_QNAME = new QName("http://service.business.dtbafrica.com/", "postTransactionResponse");
    private final static QName _Arg0_QNAME = new QName("http://service.business.dtbafrica.com/", "arg0");
    private final static QName _FtResponse_QNAME = new QName("http://service.business.dtbafrica.com/", "ftResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dtbafrica.business.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FtResponse }
     * 
     */
    public FtResponse createFtResponse() {
        return new FtResponse();
    }

    /**
     * Create an instance of {@link FTRequest }
     * 
     */
    public FTRequest createFTRequest() {
        return new FTRequest();
    }

    /**
     * Create an instance of {@link PostTransactionResponse }
     * 
     */
    public PostTransactionResponse createPostTransactionResponse() {
        return new PostTransactionResponse();
    }

    /**
     * Create an instance of {@link PostTransaction }
     * 
     */
    public PostTransaction createPostTransaction() {
        return new PostTransaction();
    }

    /**
     * Create an instance of {@link ErrorDetail }
     * 
     */
    public ErrorDetail createErrorDetail() {
        return new ErrorDetail();
    }

    /**
     * Create an instance of {@link FTHeader }
     * 
     */
    public FTHeader createFTHeader() {
        return new FTHeader();
    }

    /**
     * Create an instance of {@link FTBody }
     * 
     */
    public FTBody createFTBody() {
        return new FTBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.business.dtbafrica.com/", name = "postTransaction")
    public JAXBElement<PostTransaction> createPostTransaction(PostTransaction value) {
        return new JAXBElement<PostTransaction>(_PostTransaction_QNAME, PostTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.business.dtbafrica.com/", name = "postTransactionResponse")
    public JAXBElement<PostTransactionResponse> createPostTransactionResponse(PostTransactionResponse value) {
        return new JAXBElement<PostTransactionResponse>(_PostTransactionResponse_QNAME, PostTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.business.dtbafrica.com/", name = "arg0")
    public JAXBElement<FTRequest> createArg0(FTRequest value) {
        return new JAXBElement<FTRequest>(_Arg0_QNAME, FTRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.business.dtbafrica.com/", name = "ftResponse")
    public JAXBElement<FtResponse> createFtResponse(FtResponse value) {
        return new JAXBElement<FtResponse>(_FtResponse_QNAME, FtResponse.class, null, value);
    }

}
