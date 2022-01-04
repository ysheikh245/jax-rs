package com.yusuf.learning.jax.advanced.rs.param;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

/**
 * If this provider is taken away, we start getting MessageBodyWriter errors in the console log.
 * As part of this class, we are trying to print the Date in the text/plain format
 * @See MyCustomMessageBodyWriterResource
 * 
 * @author ysheikh245
 *
 */

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class MyCustomMessageBodyWriterResource implements MessageBodyWriter<Date>{

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return Date.class.isAssignableFrom(type);
	}

	@Override
	public long getSize(Date t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(Date date, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream out)
			throws IOException, WebApplicationException {
		out.write(date.toString().getBytes());
	}

}
