package com.yusuf.learning.jax.advanced.rs.param;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.yusuf.learning.jax.advanced.rs.model.MyDate;

@Provider
public class MyCustomParameterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if(rawType.getTypeName().equals(MyDate.class.getName())) {
			return new ParamConverter() {

				@Override
				public Object fromString(String value) {
					MyDate myDate = new MyDate();
					myDate.setDay("1");
					myDate.setMonth("January");
					myDate.setYear("2022");
					return myDate;
				}

				@Override
				public String toString(Object value) {
					// TODO Auto-generated method stub
					return null;
				}
				
			};
		}
		return null;
	}
}
