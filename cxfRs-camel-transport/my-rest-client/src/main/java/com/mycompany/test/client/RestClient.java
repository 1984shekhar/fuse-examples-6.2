package com.mycompany.test.client;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path(value="/v1/myapi")
public interface RestClient {
	@POST
	@Path(value="/myresource/{identifier}")
	@Produces("application/json")
	Response getData(@PathParam("identifier") String identifier);
}
