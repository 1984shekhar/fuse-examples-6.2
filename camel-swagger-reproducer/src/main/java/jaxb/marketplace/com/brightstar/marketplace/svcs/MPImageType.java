
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPImageType", propOrder = {
    "imageTypeID",
    "imageTypeName"
})
public class MPImageType
    extends MPBaseObject
{

    @XmlElement(name = "ImageTypeID")
    protected int imageTypeID;
    @XmlElement(name = "ImageTypeName")
    protected String imageTypeName;

    /**
     * Gets the value of the imageTypeID property.
     * 
     */
    public int getImageTypeID() {
        return imageTypeID;
    }

    /**
     * Sets the value of the imageTypeID property.
     * 
     */
    public void setImageTypeID(int value) {
        this.imageTypeID = value;
    }

    /**
     * Gets the value of the imageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageTypeName() {
        return imageTypeName;
    }

    /**
     * Sets the value of the imageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageTypeName(String value) {
        this.imageTypeName = value;
    }

}
