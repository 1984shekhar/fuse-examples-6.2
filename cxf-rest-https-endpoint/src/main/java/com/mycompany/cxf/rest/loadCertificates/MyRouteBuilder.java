package com.mycompany.cxf.rest.loadCertificates;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.jaxrs.CxfRsComponent;
import org.apache.camel.component.cxf.jaxrs.CxfRsEndpoint;

public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     * @throws Exception 
     */
	@Override
    public void configure() throws Exception {
		
		   String endpointUri = "cxfrs:https://localhost:9090/endpoint"
		            + "?loggingFeatureEnabled=true&loggingSizeLimit=200"
		            + "&resourceClasses=com.mycompany.cxf.rest.model.PersonService";
		            
		        CxfRsComponent component = new CxfRsComponent(getContext());
		        CxfRsEndpoint endpoint = (CxfRsEndpoint)component.createEndpoint(endpointUri);
		        LoadCertificates.configureSSLOnTheServer(9090);
		        getContext().addEndpoint(endpointUri, endpoint);
		        from(endpoint).log("${body}");
    }

}
