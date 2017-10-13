package com.mycompany.test.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*import com.city.connect.beans.MaskVO;*/

/**
 * This is main class that is used to expose as the <b>REST service</b> with declaration of Consumer type and producer type
 * @author dalals
 *
 */
@Path("/")
public class RestServiceGeneric {
	/**
	 * This variable is declared for logging the message or errors
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(RestServiceGeneric.class);



	@GET
	@Path("/getMaskedMessage3/")
	//@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage3(@PathParam("comments") String comments) {
		return null;		
	}
	
}