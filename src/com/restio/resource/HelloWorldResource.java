package com.restio.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restio.common.ResourcePath;

@Path(ResourcePath.HELLO)
public class HelloWorldResource {
	
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String sayHello() {
		return "Hello REST.IO";
	}

}
