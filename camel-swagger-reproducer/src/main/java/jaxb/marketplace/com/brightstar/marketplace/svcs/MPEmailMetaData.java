
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEmailMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPEmailMetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailMetaDataID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EmailFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailBCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMTPServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailType" type="{http://svcs.marketplace.brightstar.com/}MPEMailType"/&gt;
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailFromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendEmailToVendor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SendEmailToConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPEmailMetaData", propOrder = {
    "emailMetaDataID",
    "emailFrom",
    "emailTo",
    "emailBCC",
    "emailCC",
    "emailSubject",
    "smtpServer",
    "emailBody",
    "emailType",
    "replyTo",
    "emailFromName",
    "sendEmailToVendor",
    "sendEmailToConsumer"
})
public class MPEmailMetaData
    extends MPBaseObject
{

    @XmlElement(name = "EmailMetaDataID")
    protected int emailMetaDataID;
    @XmlElement(name = "EmailFrom")
    protected String emailFrom;
    @XmlElement(name = "EmailTo")
    protected String emailTo;
    @XmlElement(name = "EmailBCC")
    protected String emailBCC;
    @XmlElement(name = "EmailCC")
    protected String emailCC;
    @XmlElement(name = "EmailSubject")
    protected String emailSubject;
    @XmlElement(name = "SMTPServer")
    protected String smtpServer;
    @XmlElement(name = "EmailBody")
    protected String emailBody;
    @XmlElement(name = "EmailType", required = true)
    @XmlSchemaType(name = "string")
    protected MPEMailType emailType;
    @XmlElement(name = "ReplyTo")
    protected String replyTo;
    @XmlElement(name = "EmailFromName")
    protected String emailFromName;
    @XmlElement(name = "SendEmailToVendor")
    protected boolean sendEmailToVendor;
    @XmlElement(name = "SendEmailToConsumer")
    protected boolean sendEmailToConsumer;

    /**
     * Gets the value of the emailMetaDataID property.
     * 
     */
    public int getEmailMetaDataID() {
        return emailMetaDataID;
    }

    /**
     * Sets the value of the emailMetaDataID property.
     * 
     */
    public void setEmailMetaDataID(int value) {
        this.emailMetaDataID = value;
    }

    /**
     * Gets the value of the emailFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFrom() {
        return emailFrom;
    }

    /**
     * Sets the value of the emailFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFrom(String value) {
        this.emailFrom = value;
    }

    /**
     * Gets the value of the emailTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * Sets the value of the emailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTo(String value) {
        this.emailTo = value;
    }

    /**
     * Gets the value of the emailBCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBCC() {
        return emailBCC;
    }

    /**
     * Sets the value of the emailBCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBCC(String value) {
        this.emailBCC = value;
    }

    /**
     * Gets the value of the emailCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCC() {
        return emailCC;
    }

    /**
     * Sets the value of the emailCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCC(String value) {
        this.emailCC = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the smtpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMTPServer() {
        return smtpServer;
    }

    /**
     * Sets the value of the smtpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMTPServer(String value) {
        this.smtpServer = value;
    }

    /**
     * Gets the value of the emailBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBody() {
        return emailBody;
    }

    /**
     * Sets the value of the emailBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBody(String value) {
        this.emailBody = value;
    }

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link MPEMailType }
     *     
     */
    public MPEMailType getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEMailType }
     *     
     */
    public void setEmailType(MPEMailType value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the emailFromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFromName() {
        return emailFromName;
    }

    /**
     * Sets the value of the emailFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFromName(String value) {
        this.emailFromName = value;
    }

    /**
     * Gets the value of the sendEmailToVendor property.
     * 
     */
    public boolean isSendEmailToVendor() {
        return sendEmailToVendor;
    }

    /**
     * Sets the value of the sendEmailToVendor property.
     * 
     */
    public void setSendEmailToVendor(boolean value) {
        this.sendEmailToVendor = value;
    }

    /**
     * Gets the value of the sendEmailToConsumer property.
     * 
     */
    public boolean isSendEmailToConsumer() {
        return sendEmailToConsumer;
    }

    /**
     * Sets the value of the sendEmailToConsumer property.
     * 
     */
    public void setSendEmailToConsumer(boolean value) {
        this.sendEmailToConsumer = value;
    }

}
