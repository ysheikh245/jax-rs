package com.yusuf.learning.jax.advanced.rs.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class MyRequestFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Request Filter method");
		return;
	}

	@Override
	public void filter(ContainerRequestContext requestContext, 
					   ContainerResponseContext responseContext) throws IOException {
		System.out.println("Request Response Filter");
		return;
	}

}
