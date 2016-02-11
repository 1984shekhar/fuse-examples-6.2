
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPLocationApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPLocationApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPLocationApp" type="{http://svcs.marketplace.brightstar.com/}MPLocationApp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPLocationApp", propOrder = {
    "mpLocationApp"
})
public class ArrayOfMPLocationApp {

    @XmlElement(name = "MPLocationApp", nillable = true)
    protected List<MPLocationApp> mpLocationApp;

    /**
     * Gets the value of the mpLocationApp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpLocationApp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPLocationApp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPLocationApp }
     * 
     * 
     */
    public List<MPLocationApp> getMPLocationApp() {
        if (mpLocationApp == null) {
            mpLocationApp = new ArrayList<MPLocationApp>();
        }
        return this.mpLocationApp;
    }

}
