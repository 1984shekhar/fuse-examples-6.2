package io.swagger.api.factories;

import io.swagger.api.BuybackApiService;
import io.swagger.api.impl.BuybackApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackApiServiceFactory {

   private final static BuybackApiService service = new BuybackApiServiceImpl();

   public static BuybackApiService getBuybackApi()
   {
      return service;
   }
}
