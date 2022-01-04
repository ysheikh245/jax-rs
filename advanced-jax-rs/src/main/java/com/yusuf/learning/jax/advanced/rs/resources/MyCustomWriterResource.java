package com.yusuf.learning.jax.advanced.rs.resources;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/plain-date")
public class MyCustomWriterResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date customPlainDate() {
		return Calendar.getInstance().getTime();
	}
	
}
