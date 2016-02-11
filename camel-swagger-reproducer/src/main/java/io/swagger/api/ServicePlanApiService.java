package io.swagger.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public abstract class ServicePlanApiService {
  
      public abstract Response getServicePlanAndSKU(String clientID,String phoneFlag,String locationID,String featureCode,String description,SecurityContext securityContext)
      throws NotFoundException;
  
}
