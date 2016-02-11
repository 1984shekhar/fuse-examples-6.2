package io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.wordnik.swagger.annotations.ApiParam;

import io.swagger.api.factories.ActivateApiServiceFactory;
import io.swagger.model.ActiviateRequestBO;

@Path("/activate")


@com.wordnik.swagger.annotations.Api(value="",description = "the activate API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ActivateApi  {
   private final ActivateApiService delegate = ActivateApiServiceFactory.getActivateApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "the request to activiate a request", response = Void.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = Void.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = Void.class) })

    public Response activatePlan(@ApiParam(value = "" ,required=true) ActiviateRequestBO activateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.activatePlan(activateRequest,securityContext);
    }
}
