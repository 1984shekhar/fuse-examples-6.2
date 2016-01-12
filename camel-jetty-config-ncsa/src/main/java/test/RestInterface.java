package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/probe")
public interface RestInterface {
    @GET
    @Path("/status")
    @Produces("application/json")
	public String getStatus() ;
}
