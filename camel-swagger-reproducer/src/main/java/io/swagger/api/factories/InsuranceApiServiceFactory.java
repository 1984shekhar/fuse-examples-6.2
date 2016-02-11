package io.swagger.api.factories;

import io.swagger.api.InsuranceApiService;
import io.swagger.api.impl.InsuranceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class InsuranceApiServiceFactory {

   private final static InsuranceApiService service = new InsuranceApiServiceImpl();

   public static InsuranceApiService getInsuranceApi()
   {
      return service;
   }
}
