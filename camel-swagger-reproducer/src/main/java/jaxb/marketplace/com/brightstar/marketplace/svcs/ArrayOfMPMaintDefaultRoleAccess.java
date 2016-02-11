
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPMaintDefaultRoleAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPMaintDefaultRoleAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPMaintDefaultRoleAccess" type="{http://svcs.marketplace.brightstar.com/}MPMaintDefaultRoleAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPMaintDefaultRoleAccess", propOrder = {
    "mpMaintDefaultRoleAccess"
})
public class ArrayOfMPMaintDefaultRoleAccess {

    @XmlElement(name = "MPMaintDefaultRoleAccess", nillable = true)
    protected List<MPMaintDefaultRoleAccess> mpMaintDefaultRoleAccess;

    /**
     * Gets the value of the mpMaintDefaultRoleAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpMaintDefaultRoleAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPMaintDefaultRoleAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPMaintDefaultRoleAccess }
     * 
     * 
     */
    public List<MPMaintDefaultRoleAccess> getMPMaintDefaultRoleAccess() {
        if (mpMaintDefaultRoleAccess == null) {
            mpMaintDefaultRoleAccess = new ArrayList<MPMaintDefaultRoleAccess>();
        }
        return this.mpMaintDefaultRoleAccess;
    }

}
