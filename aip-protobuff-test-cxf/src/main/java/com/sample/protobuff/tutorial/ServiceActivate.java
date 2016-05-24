package com.sample.protobuff.tutorial;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sample.protobuff.tutorial.AddressBookProtos.Person;

public interface ServiceActivate {

	@POST
	@Path("/")
	@Consumes({"application/octet-stream", "application/x-protobuf"})
	@Produces({"application/octet-stream", MediaType.APPLICATION_JSON, "application/x-protobuf"})
	Response serviceActivate( InputStream request );
}
