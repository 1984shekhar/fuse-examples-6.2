package com.city.connect.ws;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.city.connect.beans.MaskVO;

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


/*	@POST
	@Path("/getMaskedMessage1/")
	//@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage1(@WebParam(name = "comments", targetNamespace = "") String comments,
							@WebParam(name = "maskedType", targetNamespace = "") String maskedType,
							@WebParam(name = "maskedTypeValue", targetNamespace = "") String maskedTypeValue) {
		return null;		
	}
	
	@GET
	@Path("/getMaskedMessage2/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage2(@FormParam("comments") String comments, 
							@FormParam("maskedType") String maskedType, 
							@FormParam("maskedTypeValue") String maskedTypeValue) {
		return null;		
	}
	*/
	@GET
	@Path("/getMaskedMessage3/")
	//@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage3(@QueryParam("comments") String comments, 
							@QueryParam("maskedType") String maskedType, 
							@QueryParam("maskedTypeValue") String maskedTypeValue) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage4/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage4(@FormParam("comments") String comments, 
							@FormParam("maskedType") String maskedType, 
							@FormParam("maskedTypeValue") String maskedTypeValue) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage5/")
	//@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage5(@QueryParam("comments") String comments, 
							@QueryParam("maskedType") String maskedType, 
							@QueryParam("maskedTypeValue") String maskedTypeValue) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage6/")
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllMaskedMessage6(MaskVO MaskVO) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage7/")
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage7(Object[] allValues) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage8/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllMaskedMessage8(MaskVO MaskVO) {
		return null;		
	}
	
	@POST
	@Path("/getMaskedMessage9/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	//public String getAllMaskedMessage(MaskVO MaskVO) {
	public String getMaskedMessage9(Object[] allValues) {
		return null;		
	}
}
