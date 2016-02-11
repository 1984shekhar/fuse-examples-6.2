
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPCompanyLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPCompanyLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPCompanyLocation" type="{http://svcs.marketplace.brightstar.com/}MPCompanyLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPCompanyLocation", propOrder = {
    "mpCompanyLocation"
})
public class ArrayOfMPCompanyLocation {

    @XmlElement(name = "MPCompanyLocation", nillable = true)
    protected List<MPCompanyLocation> mpCompanyLocation;

    /**
     * Gets the value of the mpCompanyLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpCompanyLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPCompanyLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPCompanyLocation }
     * 
     * 
     */
    public List<MPCompanyLocation> getMPCompanyLocation() {
        if (mpCompanyLocation == null) {
            mpCompanyLocation = new ArrayList<MPCompanyLocation>();
        }
        return this.mpCompanyLocation;
    }

}
