package io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.wordnik.swagger.annotations.ApiParam;

import io.swagger.api.factories.InsuranceApiServiceFactory;
import io.swagger.model.InsuranceEnrollRequestBO;
import io.swagger.model.InsuranceEnrollResponseBO;

@Path("/insurance")


@com.wordnik.swagger.annotations.Api(value="",description = "the insurance API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class InsuranceApi  {
   private final InsuranceApiService delegate = InsuranceApiServiceFactory.getInsuranceApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "enroll for an insurance service", response = InsuranceEnrollResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = InsuranceEnrollResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = InsuranceEnrollResponseBO.class) })

    public Response enrollInsurance(@ApiParam(value = "The request to enroll the insurance for a device" ,required=true) InsuranceEnrollRequestBO enrollRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.enrollInsurance(enrollRequest,securityContext);
    }
}
