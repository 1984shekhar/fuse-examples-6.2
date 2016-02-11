package io.swagger.api.factories;

import io.swagger.api.OrderApiService;
import io.swagger.api.impl.OrderApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderApiServiceFactory {

   private final static OrderApiService service = new OrderApiServiceImpl();

   public static OrderApiService getOrderApi()
   {
      return service;
   }
}
