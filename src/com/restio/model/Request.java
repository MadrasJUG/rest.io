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

package com.restio.model;

import java.util.List;

/**
 * 
 * @author tham
 *
 */
public class Request {
	private String url;
	private Method method;
	private List<Parameter> parameters;
	
	public Request(String url, Method method) {
		this.url  = url;
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public Method getMethod() {
		return method;
	}
	
	public List<Parameter> getParameters() {
		return parameters;
	}
	
	public void setParameters( List<Parameter> parameters) {
		this.parameters = parameters;
	}
}
