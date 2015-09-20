package com.mycompany.business.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
public class FTBody {

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
