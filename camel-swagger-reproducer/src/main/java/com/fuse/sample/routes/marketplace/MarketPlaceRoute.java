package com.fuse.sample.routes.marketplace;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import com.fuse.sample.processors.marketplace.ParseBodyForMarketPlace;
import com.fuse.sample.processors.marketplace.PrepareBodyForMarketPlace;

public class MarketPlaceRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:http://localhost:8200/marketplace?resourceClasses=io.swagger.api.OrderApi")
		.log("Inputs : companyID ->  ${header.companyID} | shopID -> ${header.shopID} | phoneModelID -> ${header.phoneModelID}")
		.process(new PrepareBodyForMarketPlace()).process(new ParseBodyForMarketPlace()).marshal().json(JsonLibrary.Jackson);
	}
}
