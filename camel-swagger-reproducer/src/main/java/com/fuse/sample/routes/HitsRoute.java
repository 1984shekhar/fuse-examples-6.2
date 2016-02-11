package com.fuse.sample.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import com.fuse.sample.processor.hits.ParseBodyForHitsGetServicePlanDetailAndSku;
import com.fuse.sample.processor.hits.PrepareBodyForHitsGetServicePlan;

/*
from ( "cxfrs:http://localhost:8888/sample?resourceClasses=io.swagger.api.ServicePlanApi&bindingStyle=SimpleConsumer" )
.log("Inputs : ClientID ->  ${header.clientID} | PhoneFlag -> ${header.phoneFlag}")
.process( new ServicePlanProcessor()  )
.marshal().json(JsonLibrary.Jackson);
*/
public class HitsRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:http://localhost:8200/services?resourceClasses=io.swagger.api.ServicePlanApi&bindingStyle=SimpleConsumer")
		.log("Inputs : ClientID ->  ${header.clientID} | PhoneFlag -> ${header.phoneFlag}")
		.process(new PrepareBodyForHitsGetServicePlan()).process(new ParseBodyForHitsGetServicePlanDetailAndSku()).marshal().json(JsonLibrary.Jackson);
	}

}
