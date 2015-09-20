
package ftbusinessservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creditBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creditCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creditValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debitAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debitBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debitCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debitValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="internalRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sourceRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ftHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="correlId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ubsComp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ftBody",
    "ftHeader"
})
@XmlRootElement(name = "arg0")
public class Arg0 {

    @XmlElement(required = true)
    protected Arg0 .FtBody ftBody;
    @XmlElement(required = true)
    protected Arg0 .FtHeader ftHeader;

    /**
     * Gets the value of the ftBody property.
     * 
     * @return
     *     possible object is
     *     {@link Arg0 .FtBody }
     *     
     */
    public Arg0 .FtBody getFtBody() {
        return ftBody;
    }

    /**
     * Sets the value of the ftBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arg0 .FtBody }
     *     
     */
    public void setFtBody(Arg0 .FtBody value) {
        this.ftBody = value;
    }

    /**
     * Gets the value of the ftHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Arg0 .FtHeader }
     *     
     */
    public Arg0 .FtHeader getFtHeader() {
        return ftHeader;
    }

    /**
     * Sets the value of the ftHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arg0 .FtHeader }
     *     
     */
    public void setFtHeader(Arg0 .FtHeader value) {
        this.ftHeader = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creditBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creditCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creditValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debitAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debitBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debitCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debitValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="internalRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sourceRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "branch",
        "creditAccount",
        "creditAmount",
        "creditBranch",
        "creditCurrency",
        "creditValueDate",
        "debitAccount",
        "debitAmount",
        "debitBranch",
        "debitCurrency",
        "debitValueDate",
        "internalRemarks",
        "product",
        "sourceRefNo",
        "userRefNo",
        "valueDate"
    })
    public static class FtBody {

        @XmlElement(required = true)
        protected String branch;
        @XmlElement(required = true)
        protected String creditAccount;
        @XmlElement(required = true)
        protected String creditAmount;
        @XmlElement(required = true)
        protected String creditBranch;
        @XmlElement(required = true)
        protected String creditCurrency;
        @XmlElement(required = true)
        protected String creditValueDate;
        @XmlElement(required = true)
        protected String debitAccount;
        @XmlElement(required = true)
        protected String debitAmount;
        @XmlElement(required = true)
        protected String debitBranch;
        @XmlElement(required = true)
        protected String debitCurrency;
        @XmlElement(required = true)
        protected String debitValueDate;
        @XmlElement(required = true)
        protected String internalRemarks;
        @XmlElement(required = true)
        protected String product;
        @XmlElement(required = true)
        protected String sourceRefNo;
        @XmlElement(required = true)
        protected String userRefNo;
        @XmlElement(required = true)
        protected String valueDate;

        /**
         * Gets the value of the branch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBranch() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBranch(String value) {
            this.branch = value;
        }

        /**
         * Gets the value of the creditAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditAccount() {
            return creditAccount;
        }

        /**
         * Sets the value of the creditAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditAccount(String value) {
            this.creditAccount = value;
        }

        /**
         * Gets the value of the creditAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditAmount() {
            return creditAmount;
        }

        /**
         * Sets the value of the creditAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditAmount(String value) {
            this.creditAmount = value;
        }

        /**
         * Gets the value of the creditBranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditBranch() {
            return creditBranch;
        }

        /**
         * Sets the value of the creditBranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditBranch(String value) {
            this.creditBranch = value;
        }

        /**
         * Gets the value of the creditCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditCurrency() {
            return creditCurrency;
        }

        /**
         * Sets the value of the creditCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditCurrency(String value) {
            this.creditCurrency = value;
        }

        /**
         * Gets the value of the creditValueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditValueDate() {
            return creditValueDate;
        }

        /**
         * Sets the value of the creditValueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditValueDate(String value) {
            this.creditValueDate = value;
        }

        /**
         * Gets the value of the debitAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitAccount() {
            return debitAccount;
        }

        /**
         * Sets the value of the debitAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitAccount(String value) {
            this.debitAccount = value;
        }

        /**
         * Gets the value of the debitAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitAmount() {
            return debitAmount;
        }

        /**
         * Sets the value of the debitAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitAmount(String value) {
            this.debitAmount = value;
        }

        /**
         * Gets the value of the debitBranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitBranch() {
            return debitBranch;
        }

        /**
         * Sets the value of the debitBranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitBranch(String value) {
            this.debitBranch = value;
        }

        /**
         * Gets the value of the debitCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitCurrency() {
            return debitCurrency;
        }

        /**
         * Sets the value of the debitCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitCurrency(String value) {
            this.debitCurrency = value;
        }

        /**
         * Gets the value of the debitValueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitValueDate() {
            return debitValueDate;
        }

        /**
         * Sets the value of the debitValueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitValueDate(String value) {
            this.debitValueDate = value;
        }

        /**
         * Gets the value of the internalRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalRemarks() {
            return internalRemarks;
        }

        /**
         * Sets the value of the internalRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalRemarks(String value) {
            this.internalRemarks = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProduct(String value) {
            this.product = value;
        }

        /**
         * Gets the value of the sourceRefNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceRefNo() {
            return sourceRefNo;
        }

        /**
         * Sets the value of the sourceRefNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceRefNo(String value) {
            this.sourceRefNo = value;
        }

        /**
         * Gets the value of the userRefNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserRefNo() {
            return userRefNo;
        }

        /**
         * Sets the value of the userRefNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserRefNo(String value) {
            this.userRefNo = value;
        }

        /**
         * Gets the value of the valueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueDate() {
            return valueDate;
        }

        /**
         * Sets the value of the valueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueDate(String value) {
            this.valueDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="correlId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ubsComp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "branch",
        "correlId",
        "msgId",
        "operation",
        "password",
        "service",
        "sourceId",
        "ubsComp",
        "userId"
    })
    public static class FtHeader {

        @XmlElement(required = true)
        protected String branch;
        @XmlElement(required = true)
        protected String correlId;
        @XmlElement(required = true)
        protected String msgId;
        @XmlElement(required = true)
        protected String operation;
        @XmlElement(required = true)
        protected String password;
        @XmlElement(required = true)
        protected String service;
        @XmlElement(required = true)
        protected String sourceId;
        @XmlElement(required = true)
        protected String ubsComp;
        @XmlElement(required = true)
        protected String userId;

        /**
         * Gets the value of the branch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBranch() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBranch(String value) {
            this.branch = value;
        }

        /**
         * Gets the value of the correlId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorrelId() {
            return correlId;
        }

        /**
         * Sets the value of the correlId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorrelId(String value) {
            this.correlId = value;
        }

        /**
         * Gets the value of the msgId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgId() {
            return msgId;
        }

        /**
         * Sets the value of the msgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgId(String value) {
            this.msgId = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperation(String value) {
            this.operation = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setService(String value) {
            this.service = value;
        }

        /**
         * Gets the value of the sourceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceId() {
            return sourceId;
        }

        /**
         * Sets the value of the sourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceId(String value) {
            this.sourceId = value;
        }

        /**
         * Gets the value of the ubsComp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUbsComp() {
            return ubsComp;
        }

        /**
         * Sets the value of the ubsComp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUbsComp(String value) {
            this.ubsComp = value;
        }

        /**
         * Gets the value of the userId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

    }

}
