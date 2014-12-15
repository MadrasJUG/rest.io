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

package com.restio.resource.demo;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.restio.common.ResourcePath;

/**
 * 
 * @author tham
 *
 */
@Path(ResourcePath.DEMO_GET)
public class GetResource {
	
	@GET
	@Path("{id}")
	public String withPathParam(@PathParam("id") String id) {
		return "Get with path param {id}: " + id;
	}
	
	@GET
	@Path("query")
	public String withQueryParam(@QueryParam("query1") String query1, @QueryParam("query2") String query2) {
		StringBuilder builder = new StringBuilder();
		builder.append("Get with query param");
		builder.append("\t Query1: " + query1);
		builder.append("\t Query2: " + query2);
		
		return builder.toString();
	}
	
	@GET
	@Path("header")
	public String withHeaderParam(@HeaderParam("header1") String header1, @HeaderParam("header2") String header2) {
		StringBuilder builder = new StringBuilder();
		builder.append("Get with header param");
		builder.append("\t Header1: " + header1);
		builder.append("\t Header2: " + header2);
		
		return builder.toString();
	}
	
	public String withMatrixParam() {
		return null;
	}
	
	public String withCookieParam() {
		return null;
	}
}
