
package com.mycompany.business.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftBody" type="{http://service.business.dtbafrica.com/}FTBody" minOccurs="0"/>
 *         &lt;element name="ftHeader" type="{http://service.business.dtbafrica.com/}FTHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTRequest", propOrder = {
    "ftBody",
    "ftHeader"
})
public class FTRequest {

    protected FTBody ftBody;
    protected FTHeader ftHeader;

    /**
     * Gets the value of the ftBody property.
     * 
     * @return
     *     possible object is
     *     {@link FTBody }
     *     
     */
    public FTBody getFtBody() {
        return ftBody;
    }

    /**
     * Sets the value of the ftBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTBody }
     *     
     */
    public void setFtBody(FTBody value) {
        this.ftBody = value;
    }

    /**
     * Gets the value of the ftHeader property.
     * 
     * @return
     *     possible object is
     *     {@link FTHeader }
     *     
     */
    public FTHeader getFtHeader() {
        return ftHeader;
    }

    /**
     * Sets the value of the ftHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTHeader }
     *     
     */
    public void setFtHeader(FTHeader value) {
        this.ftHeader = value;
    }

}
