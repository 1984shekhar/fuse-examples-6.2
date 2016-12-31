package com.mycompany.presto.test.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface Rest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	Response testPrestoDB();

}
