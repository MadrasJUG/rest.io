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

package com.restio.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.restio.provider.RequestJsonWriter;
import com.restio.resource.HelloWorldResource;
import com.restio.resource.demo.GetResource;

/**
 * Resource registrator for REST.IO application
 * 
 * @author tham
 *
 */
public class RestIOApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>(8);
	private Set<Class<?>> classes = new HashSet<Class<?>>(8);
	
	public RestIOApplication() {
		singletons.add(new HelloWorldResource());
		singletons.add(new GetResource());
		
		singletons.add(new RequestJsonWriter());
	}
	
	@Override
    public Set<Class<?>> getClasses() {
        //Register resources
        classes.add(HelloWorldResource.class);
        classes.add(GetResource.class);
        
        //Register providers (writers and readers)
        classes.add(RequestJsonWriter.class);
        return classes;
    }

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
