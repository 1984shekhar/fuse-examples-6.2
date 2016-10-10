package com.mycompany.test.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path(value="/v1/myapi")
public class MyRestService {
	@GET
	@Path(value="/myresource/{identifier}")
	@Produces("application/json")
	public String getData(
				  @PathParam("identifier") String identifier) {
		// Camel is going to take over.
		return null;
	}
}
