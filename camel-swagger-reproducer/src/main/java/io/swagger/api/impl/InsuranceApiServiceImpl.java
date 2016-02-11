package io.swagger.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.InsuranceApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.InsuranceEnrollRequestBO;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class InsuranceApiServiceImpl extends InsuranceApiService {
  
      @Override
      public Response enrollInsurance(InsuranceEnrollRequestBO enrollRequest,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
