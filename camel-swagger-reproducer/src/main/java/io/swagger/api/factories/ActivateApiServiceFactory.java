package io.swagger.api.factories;

import io.swagger.api.ActivateApiService;
import io.swagger.api.impl.ActivateApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ActivateApiServiceFactory {

   private final static ActivateApiService service = new ActivateApiServiceImpl();

   public static ActivateApiService getActivateApi()
   {
      return service;
   }
}
