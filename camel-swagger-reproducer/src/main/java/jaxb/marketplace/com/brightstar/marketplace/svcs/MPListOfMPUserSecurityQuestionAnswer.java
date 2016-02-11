
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPListOfMPUserSecurityQuestionAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPListOfMPUserSecurityQuestionAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://svcs.marketplace.brightstar.com/}ArrayOfMPUserSecurityQuestionAnswer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPListOfMPUserSecurityQuestionAnswer", propOrder = {
    "items"
})
@XmlSeeAlso({
    MPUserSecurityQuestionAnswerList.class
})
public class MPListOfMPUserSecurityQuestionAnswer
    extends MPBaseObject
{

    @XmlElement(name = "Items")
    protected ArrayOfMPUserSecurityQuestionAnswer items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMPUserSecurityQuestionAnswer }
     *     
     */
    public ArrayOfMPUserSecurityQuestionAnswer getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMPUserSecurityQuestionAnswer }
     *     
     */
    public void setItems(ArrayOfMPUserSecurityQuestionAnswer value) {
        this.items = value;
    }

}
