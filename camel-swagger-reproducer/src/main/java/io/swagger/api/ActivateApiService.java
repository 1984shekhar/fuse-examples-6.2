package io.swagger.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.model.ActiviateRequestBO;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public abstract class ActivateApiService {
  
      public abstract Response activatePlan(ActiviateRequestBO activateRequest,SecurityContext securityContext)
      throws NotFoundException;
  
}
