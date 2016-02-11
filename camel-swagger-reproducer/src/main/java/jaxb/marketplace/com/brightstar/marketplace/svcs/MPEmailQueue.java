
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MPEmailQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPEmailQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailQueueID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsInternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProcessedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeToSend" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EmailMetaData" type="{http://svcs.marketplace.brightstar.com/}MPEmailMetaData" minOccurs="0"/&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPEmailQueue", propOrder = {
    "emailQueueID",
    "isInternal",
    "processedDate",
    "dateTimeToSend",
    "emailMetaData",
    "batchID",
    "replyTo"
})
public class MPEmailQueue
    extends MPBaseObject
{

    @XmlElement(name = "EmailQueueID")
    protected int emailQueueID;
    @XmlElement(name = "IsInternal")
    protected boolean isInternal;
    @XmlElement(name = "ProcessedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedDate;
    @XmlElement(name = "DateTimeToSend", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeToSend;
    @XmlElement(name = "EmailMetaData")
    protected MPEmailMetaData emailMetaData;
    @XmlElement(name = "BatchID")
    protected int batchID;
    @XmlElement(name = "ReplyTo")
    protected String replyTo;

    /**
     * Gets the value of the emailQueueID property.
     * 
     */
    public int getEmailQueueID() {
        return emailQueueID;
    }

    /**
     * Sets the value of the emailQueueID property.
     * 
     */
    public void setEmailQueueID(int value) {
        this.emailQueueID = value;
    }

    /**
     * Gets the value of the isInternal property.
     * 
     */
    public boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the value of the isInternal property.
     * 
     */
    public void setIsInternal(boolean value) {
        this.isInternal = value;
    }

    /**
     * Gets the value of the processedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedDate() {
        return processedDate;
    }

    /**
     * Sets the value of the processedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedDate(XMLGregorianCalendar value) {
        this.processedDate = value;
    }

    /**
     * Gets the value of the dateTimeToSend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeToSend() {
        return dateTimeToSend;
    }

    /**
     * Sets the value of the dateTimeToSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeToSend(XMLGregorianCalendar value) {
        this.dateTimeToSend = value;
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

    /**
     * Gets the value of the batchID property.
     * 
     */
    public int getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     */
    public void setBatchID(int value) {
        this.batchID = value;
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

}
