
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPPart" type="{http://svcs.marketplace.brightstar.com/}MPPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPPart", propOrder = {
    "mpPart"
})
public class ArrayOfMPPart {

    @XmlElement(name = "MPPart", nillable = true)
    protected List<MPPart> mpPart;

    /**
     * Gets the value of the mpPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPPart }
     * 
     * 
     */
    public List<MPPart> getMPPart() {
        if (mpPart == null) {
            mpPart = new ArrayList<MPPart>();
        }
        return this.mpPart;
    }

}
