package io.swagger.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.wordnik.swagger.annotations.ApiParam;

import io.swagger.api.factories.ServicePlanApiServiceFactory;
import io.swagger.model.ServicePlanResponseBO;

@Path("/servicePlan")


@com.wordnik.swagger.annotations.Api(value="",description = "the servicePlan API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ServicePlanApi  {
   private final ServicePlanApiService delegate = ServicePlanApiServiceFactory.getServicePlanApi();

    @GET
    @Path("/{clientID}")
    
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "This service will fetch the Service Plan and SKU information", response = ServicePlanResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = ServicePlanResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = ServicePlanResponseBO.class) })

    public Response getServicePlanAndSKU(@ApiParam(value = "the client ID to be used, eg. 10042",required=true) @PathParam("clientID") String clientID,@ApiParam(value = "flag to describe the phone condition, eg 1 2",required=true) @QueryParam("phoneFlag") String phoneFlag,@ApiParam(value = "the location code of the calling application",required=true) @QueryParam("locationID") String locationID,@ApiParam(value = "code to define the featureCode ( max 63 chars )") @QueryParam("featureCode") String featureCode,@ApiParam(value = "description of the phone ( max 63 chars )") @QueryParam("description") String description,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getServicePlanAndSKU(clientID,phoneFlag,locationID,featureCode,description,securityContext);
    }
}
