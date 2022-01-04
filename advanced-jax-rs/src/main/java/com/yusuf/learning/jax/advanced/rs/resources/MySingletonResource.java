package com.yusuf.learning.jax.advanced.rs.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("singleton")
@Singleton
public class MySingletonResource {
	
	private int count;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		count += 1;
		return "It works!. This method was invoked " + count + " time(s)";
	}
	
}
