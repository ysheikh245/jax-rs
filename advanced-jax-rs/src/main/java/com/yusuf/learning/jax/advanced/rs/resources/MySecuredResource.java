package com.yusuf.learning.jax.advanced.rs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yusuf.learning.jax.advanced.rs.filter.MyRequestFilter;

/**
 * This is a secured resource. There is nothing secured about it. 
 * Its just that if we want to apply authentication mechanisms, we have a better handle while handling URI.
 * 
 * We have created RequestFilter and ResponseFilter which intercepts request and response
 * @See {@link MyRequestFilter}
 * 
 * @author ysheikh245
 *
 */

@Path("secured")
public class MySecuredResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String securedResource() {
		return "Secured Resource";
	}
	
}