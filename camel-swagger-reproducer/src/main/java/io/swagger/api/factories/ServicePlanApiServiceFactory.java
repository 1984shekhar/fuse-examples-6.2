package io.swagger.api.factories;

import io.swagger.api.ServicePlanApiService;
import io.swagger.api.impl.ServicePlanApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ServicePlanApiServiceFactory {

   private final static ServicePlanApiService service = new ServicePlanApiServiceImpl();

   public static ServicePlanApiService getServicePlanApi()
   {
      return service;
   }
}
