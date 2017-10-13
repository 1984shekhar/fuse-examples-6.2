/**
 * 
 */
package com.mycompany.test.util;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * @author dalals
 *
 */
@Provider
public class CORSFilter implements ContainerResponseFilter {

	private String accessURL;
    /**
	 * @return the accessURL
	 */
	public String getAccessURL() {
		return accessURL;
	}
	/**
	 * @param accessURL the accessURL to set
	 */
	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
	/*
     * (non-Javadoc)
     *
     * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.
     * container.ContainerRequestContext,
     * javax.ws.rs.container.ContainerResponseContext)
     */
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, X-Requested-With, content-type, accept, key, authorization");
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
    
}