package com.fuse.sample.routes.flex;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import com.fuse.sample.processors.flex.ParseBodyForFlex;
import com.fuse.sample.processors.flex.PrepareBodyForFlex;

public class FlexRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:http://localhost:8200/services?resourceClasses=io.swagger.api.BuybackApi&bindingStyle=SimpleConsumer")
		.log("Inputs : companyID ->  ${header.companyID} | shopID -> ${header.shopID} | phoneModelID -> ${header.phoneModelID}")
		.process(new PrepareBodyForFlex()).process(new ParseBodyForFlex()).marshal().json(JsonLibrary.Jackson);
	}

}
