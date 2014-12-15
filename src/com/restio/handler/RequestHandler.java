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

package com.restio.handler;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.restio.model.Request;

/**
 * 
 * @author tham
 *
 */
public class RequestHandler {
	private Request request;
	public RequestHandler(Request request) {
		this.request = request;
	}
	
	public void handleRequest() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(request.getUrl());
		
		PathParameterHandler pathParameterHandler = new PathParameterHandler(webTarget, request);
		webTarget = pathParameterHandler.handlePathParameters();
		
		Builder invocationBuilder = webTarget.request();
		invocationBuilder.accept(MediaType.TEXT_PLAIN);
		String response = invocationBuilder.get(String.class);
		System.out.println("Now Response: " + response);
		
//		Response response = webTarget.request(MediaType.TEXT_PLAIN).get();
//		System.out.println(response.readEntity(String.class));
	}
}
