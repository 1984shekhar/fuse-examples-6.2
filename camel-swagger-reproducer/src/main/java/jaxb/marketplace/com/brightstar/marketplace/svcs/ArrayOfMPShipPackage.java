
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPShipPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPShipPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPShipPackage" type="{http://svcs.marketplace.brightstar.com/}MPShipPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPShipPackage", propOrder = {
    "mpShipPackage"
})
public class ArrayOfMPShipPackage {

    @XmlElement(name = "MPShipPackage", nillable = true)
    protected List<MPShipPackage> mpShipPackage;

    /**
     * Gets the value of the mpShipPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpShipPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPShipPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPShipPackage }
     * 
     * 
     */
    public List<MPShipPackage> getMPShipPackage() {
        if (mpShipPackage == null) {
            mpShipPackage = new ArrayList<MPShipPackage>();
        }
        return this.mpShipPackage;
    }

}
