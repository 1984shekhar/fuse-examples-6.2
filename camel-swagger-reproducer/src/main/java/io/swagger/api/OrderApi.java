package io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.wordnik.swagger.annotations.ApiParam;

import io.swagger.api.factories.OrderApiServiceFactory;
import io.swagger.model.OrderRequestBO;
import io.swagger.model.OrderResponseBO;

@Path("/order")


@com.wordnik.swagger.annotations.Api(value="",description = "the order API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderApi  {
   private final OrderApiService delegate = OrderApiServiceFactory.getOrderApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "service to order the mobile phone", response = OrderResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Success Response", response = OrderResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = OrderResponseBO.class) })

    public Response submitOrder(@ApiParam(value = "" ,required=true) OrderRequestBO orderRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitOrder(orderRequest,securityContext);
    }
}
