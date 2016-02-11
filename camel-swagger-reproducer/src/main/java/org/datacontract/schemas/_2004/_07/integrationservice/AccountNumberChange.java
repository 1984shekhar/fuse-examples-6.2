
package org.datacontract.schemas._2004._07.integrationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Information required to change the customer's account number.
 *             </summary>
 * 
 * <p>Java class for AccountNumberChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountNumberChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewAccountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNumberChange", propOrder = {
    "accountNumber",
    "accountType",
    "newAccountNumber",
    "newAccountType"
})
public class AccountNumberChange {

    @XmlElement(name = "AccountNumber", required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(name = "AccountType")
    protected int accountType;
    @XmlElement(name = "NewAccountNumber", required = true, nillable = true)
    protected String newAccountNumber;
    @XmlElement(name = "NewAccountType")
    protected int newAccountType;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the newAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccountNumber() {
        return newAccountNumber;
    }

    /**
     * Sets the value of the newAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccountNumber(String value) {
        this.newAccountNumber = value;
    }

    /**
     * Gets the value of the newAccountType property.
     * 
     */
    public int getNewAccountType() {
        return newAccountType;
    }

    /**
     * Sets the value of the newAccountType property.
     * 
     */
    public void setNewAccountType(int value) {
        this.newAccountType = value;
    }

}
