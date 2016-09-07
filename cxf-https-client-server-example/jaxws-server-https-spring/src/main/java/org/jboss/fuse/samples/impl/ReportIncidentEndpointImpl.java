
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.jboss.fuse.samples.impl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.camel.example.reportincident.ReportIncidentEndpoint;
import org.apache.camel.example.reportincident.InputReportIncident;
import org.apache.camel.example.reportincident.OutputReportIncident;


@javax.jws.WebService(
                      serviceName = "ReportIncidentEndpointService",
                      portName = "ReportIncidentService",
                      targetNamespace = "http://reportincident.example.camel.apache.org",
                      endpointInterface = "org.apache.camel.example.reportincident.ReportIncidentEndpoint")
                      
public class ReportIncidentEndpointImpl implements ReportIncidentEndpoint {

    private static final Logger LOG = Logger.getLogger(ReportIncidentEndpointImpl.class.getName());

    public OutputReportIncident reportIncident(InputReportIncident in) { 
        LOG.info("Executing operation reportIncident");

        String incidentId = in.getIncidentId();
        String givenName = in.getGivenName();
        String familyName = in.getFamilyName();
        String details = in.getDetails();
        System.out.println("Recived InputReportIncident: ");
        System.out.println("\tincidentId: " + incidentId);
        System.out.println("\tgivenName: " + givenName);
        System.out.println("\tfamilyName: " + familyName);
        System.out.println("\tdetails: " + details);
        try {
            OutputReportIncident out = new OutputReportIncident();
            out.setCode("OK");
            if (givenName.equalsIgnoreCase("joe")) {
                throw new Exception("test exception!"); 
            }
            return out;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
