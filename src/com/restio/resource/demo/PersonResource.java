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

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author tham
 *
 */

@Path("/persons")
public class PersonResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPersons() {
		return null;
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") String id) {
		return null;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPerson(Person person) {
		
	}
	
	@Path("{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updatePerson(@PathParam("id") String id, Person person) {
		
	}
	
	@Path("{id}")
	@DELETE
	public void deletePerson(String id) {
		
	}
}
