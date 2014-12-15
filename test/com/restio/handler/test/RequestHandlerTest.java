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

package com.restio.handler.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ext.Provider;

import org.junit.Test;

import com.restio.handler.RequestHandler;
import com.restio.model.Method;
import com.restio.model.Parameter;
import com.restio.model.PathParameter;
import com.restio.model.Request;

/**
 * 
 * @author tham
 *
 */

@Provider
public class RequestHandlerTest {
	private static final String PATH = "http://localhost:8080/restio/api/demo/get/{id}";

	@Test
	public void testRequestHandler() {
		Request request = new Request(PATH, Method.GET);
		
		List<Parameter> parameters = new ArrayList<Parameter>(2);
		parameters.add(new PathParameter("id", "REST.IO"));
		request.setParameters(parameters);
		
		RequestHandler requestHandler = new RequestHandler(request);
		requestHandler.handleRequest();
	}
}
