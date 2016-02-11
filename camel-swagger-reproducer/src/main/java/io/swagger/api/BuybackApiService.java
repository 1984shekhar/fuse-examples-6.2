package io.swagger.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.model.BuybackOrderRequestBO;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public abstract class BuybackApiService {
  
      public abstract Response getPhoneConditions(String companyID,String shopID,String phoneModelID,String locationID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response submitBuybackOrder(BuybackOrderRequestBO buybackOrderRequest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getPhoneBuybackPrice(String companyID,String shopID,String phoneModelID,String currencyID,String colourID,String conditions,String locationID,SecurityContext securityContext)
      throws NotFoundException;
  
}
