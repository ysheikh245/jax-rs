package com.yusuf.learning.jax.rs.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello World!";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postMessage() {
		return "Post Method !!!";
	}

}
