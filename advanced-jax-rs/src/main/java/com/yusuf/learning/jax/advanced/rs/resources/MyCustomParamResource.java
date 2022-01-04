package com.yusuf.learning.jax.advanced.rs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yusuf.learning.jax.advanced.rs.model.MyDate;

@Path("/date/{dayParam}")
public class MyCustomParamResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String customParam(@PathParam("dayParam") MyDate dayParam) {
		return "What came back, went back " + dayParam;
	}

}
