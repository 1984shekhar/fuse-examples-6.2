
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPEmailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPEmailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailType" type="{http://svcs.marketplace.brightstar.com/}MPEMailType"/&gt;
 *         &lt;element name="Application" type="{http://svcs.marketplace.brightstar.com/}MPEApplication"/&gt;
 *         &lt;element name="ApplicationDomain" type="{http://svcs.marketplace.brightstar.com/}MPEApplicationDomain"/&gt;
 *         &lt;element name="EmailDataID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EmailMetaDataID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReferenceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EmailMetaData" type="{http://svcs.marketplace.brightstar.com/}MPEmailMetaData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPEmailData", propOrder = {
    "emailType",
    "application",
    "applicationDomain",
    "emailDataID",
    "emailMetaDataID",
    "referenceKey",
    "isProcessed",
    "emailMetaData"
})
public class MPEmailData
    extends MPBaseObject
{

    @XmlElement(name = "EmailType", required = true)
    @XmlSchemaType(name = "string")
    protected MPEMailType emailType;
    @XmlElement(name = "Application", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplication application;
    @XmlElement(name = "ApplicationDomain", required = true)
    @XmlSchemaType(name = "string")
    protected MPEApplicationDomain applicationDomain;
    @XmlElement(name = "EmailDataID")
    protected int emailDataID;
    @XmlElement(name = "EmailMetaDataID")
    protected int emailMetaDataID;
    @XmlElement(name = "ReferenceKey")
    protected String referenceKey;
    @XmlElement(name = "IsProcessed")
    protected boolean isProcessed;
    @XmlElement(name = "EmailMetaData")
    protected MPEmailMetaData emailMetaData;

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
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplication }
     *     
     */
    public MPEApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplication }
     *     
     */
    public void setApplication(MPEApplication value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationDomain property.
     * 
     * @return
     *     possible object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public MPEApplicationDomain getApplicationDomain() {
        return applicationDomain;
    }

    /**
     * Sets the value of the applicationDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEApplicationDomain }
     *     
     */
    public void setApplicationDomain(MPEApplicationDomain value) {
        this.applicationDomain = value;
    }

    /**
     * Gets the value of the emailDataID property.
     * 
     */
    public int getEmailDataID() {
        return emailDataID;
    }

    /**
     * Sets the value of the emailDataID property.
     * 
     */
    public void setEmailDataID(int value) {
        this.emailDataID = value;
    }

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
     * Gets the value of the referenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceKey() {
        return referenceKey;
    }

    /**
     * Sets the value of the referenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceKey(String value) {
        this.referenceKey = value;
    }

    /**
     * Gets the value of the isProcessed property.
     * 
     */
    public boolean isIsProcessed() {
        return isProcessed;
    }

    /**
     * Sets the value of the isProcessed property.
     * 
     */
    public void setIsProcessed(boolean value) {
        this.isProcessed = value;
    }

    /**
     * Gets the value of the emailMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link MPEmailMetaData }
     *     
     */
    public MPEmailMetaData getEmailMetaData() {
        return emailMetaData;
    }

    /**
     * Sets the value of the emailMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPEmailMetaData }
     *     
     */
    public void setEmailMetaData(MPEmailMetaData value) {
        this.emailMetaData = value;
    }

}
