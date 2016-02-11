package io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.wordnik.swagger.annotations.ApiParam;

import io.swagger.api.factories.BuybackApiServiceFactory;
import io.swagger.model.BuybackConditionsResponseBO;
import io.swagger.model.BuybackOrderRequestBO;
import io.swagger.model.BuybackOrderResponseBO;
import io.swagger.model.BuybackPriceResponseBO;

@Path("/buyback")


@com.wordnik.swagger.annotations.Api(value="",description = "the buyback API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackApi  {
   private final BuybackApiService delegate = BuybackApiServiceFactory.getBuybackApi();

    @GET
    @Path("/conditions/{companyID}/{shopID}/{phoneModelID}")
    
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "get the conditions to apply for BBTi", response = BuybackConditionsResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = BuybackConditionsResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = BuybackConditionsResponseBO.class) })

    public Response getPhoneConditions(@ApiParam(value = "The company Id, for example 10042",required=true) @PathParam("companyID") String companyID,@ApiParam(value = "This parameters supplies the shopID",required=true) @PathParam("shopID") String shopID,@ApiParam(value = "define the model Id of the phone",required=true) @PathParam("phoneModelID") String phoneModelID,@ApiParam(value = "the location code of the calling application",required=true) @QueryParam("locationID") String locationID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPhoneConditions(companyID,shopID,phoneModelID,locationID,securityContext);
    }
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "The service to create a new buyback order", response = BuybackOrderResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = BuybackOrderResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = BuybackOrderResponseBO.class) })

    public Response submitBuybackOrder(@ApiParam(value = "" ,required=true) BuybackOrderRequestBO buybackOrderRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitBuybackOrder(buybackOrderRequest,securityContext);
    }
    @GET
    @Path("/price/{companyID}/{shopID}/{phoneModelID}/{currencyID}/{colourID}/{conditions}")
    
    @Produces({ "application/json" })
    @com.wordnik.swagger.annotations.ApiOperation(value = "", notes = "get the price based on conditions", response = BuybackPriceResponseBO.class)
    @com.wordnik.swagger.annotations.ApiResponses(value = { 
        @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "Successful Response", response = BuybackPriceResponseBO.class),
        
        @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Error / Exception Response", response = BuybackPriceResponseBO.class) })

    public Response getPhoneBuybackPrice(@ApiParam(value = "The company Id, for example 10042",required=true) @PathParam("companyID") String companyID,@ApiParam(value = "This parameters supplies the shopID",required=true) @PathParam("shopID") String shopID,@ApiParam(value = "define the model Id of the phone",required=true) @PathParam("phoneModelID") String phoneModelID,@ApiParam(value = "The ID of the currency to be used for price",required=true) @PathParam("currencyID") String currencyID,@ApiParam(value = "ID to define the phone colour",required=true) @PathParam("colourID") String colourID,@ApiParam(value = "a comma separated list of conditions in format '1:true,2:false,3:true'",required=true) @PathParam("conditions") String conditions,@ApiParam(value = "the location code of the calling application",required=true) @QueryParam("locationID") String locationID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPhoneBuybackPrice(companyID,shopID,phoneModelID,currencyID,colourID,conditions,locationID,securityContext);
    }
}
