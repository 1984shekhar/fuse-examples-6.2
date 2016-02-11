
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPBaseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPBaseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPBaseObject")
@XmlSeeAlso({
    MPEmailQueue.class,
    MPPricing.class,
    MPOrderItemBaseObject.class,
    MPPart.class,
    MPPlan.class,
    MPImage.class,
    MPImageType.class,
    MPFeature.class,
    MPOrderLineBaseObject.class,
    MPAddress.class,
    MPOrderBaseObject.class,
    MPListOfMPOrder.class,
    MPOrganization.class,
    MPListOfMPCompany.class,
    MPCompany.class,
    MPListOfMPCompanyLocation.class,
    MPCompanyLocation.class,
    MPListOfMPLocationApp.class,
    MPLocationApp.class,
    MPListOfMPCatalog.class,
    MPCatalog.class,
    MPListOfMPOrganization.class,
    MPCarrier.class,
    MPListOfMPCarrier.class,
    MPListOfMPPart.class,
    MPUser.class,
    MPRoleMaster.class,
    MPListOfMPRoleMaster.class,
    MPListOfMPMaintDefaultRoleAccess.class,
    MPMaintDefaultRoleAccess.class,
    MPListOfMPUserSecurityQuestionAnswer.class,
    MPUserSecurityQuestionAnswer.class,
    MPListOfMPUser.class,
    MPEmailMetaData.class,
    MPEmailData.class,
    MPOrderSearch.class
})
public class MPBaseObject {


}
