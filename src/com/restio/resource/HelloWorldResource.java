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

package com.restio.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restio.common.ResourcePath;
import com.restio.model.Method;
import com.restio.model.Request;

/**
 * Sample resource for validating the REST service
 * 
 * @author tham
 *
 */
@Path(ResourcePath.HELLO)
public class HelloWorldResource {
	
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String sayHello() {
		return "Hello REST.IO";
	}
	
	@Path("provider")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Request getObject() {
		Request request = new Request("/Tham", Method.GET);
		return request;
	}
}
