/*
 * Copyright 2014 REST.IO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.restio.provider;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.restio.model.Request;

/**
 * 
 * @author tham
 *
 */

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class RequestJsonWriter implements MessageBodyWriter<Request>{

	@Override
	public long getSize(Request request, Class<?> clazz, Type type,
			Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] annotations,
			MediaType mediaType) {
		return clazz == Request.class;
	}

	@Override
	public void writeTo(Request request, Class<?> clazz, Type type,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> multiValuedMap, OutputStream stream)
			throws IOException, WebApplicationException {
		DataOutputStream dataOutputStream = new DataOutputStream(stream);
		
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("\"name\"");
		builder.append(":");
		builder.append("\"Thamizh\"");
		builder.append("}");
		dataOutputStream.writeUTF(builder.toString());
	}
}
