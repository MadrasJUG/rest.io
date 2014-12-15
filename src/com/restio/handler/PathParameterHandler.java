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

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.restio.model.Parameter;
import com.restio.model.Request;

/**
 * 
 * @author tham
 *
 */
public class PathParameterHandler {
	private WebTarget webTarget;
	private Request request;
	private List<Parameter> pathParameters;
	
	public PathParameterHandler(WebTarget webTarget, Request request) {
		this.webTarget = webTarget;
		this.request = request;
	}
	
	public WebTarget handlePathParameters() {
		pathParameters = request.getParameters();
		if (pathParameters == null || pathParameters.isEmpty()) {
			return webTarget;
		}
		
//		if (!shouldResolveTemplate()) {
//			return;
//		}
		
		return resolveTemplates();
	}

	private WebTarget resolveTemplates() {
		for (Parameter pathParameter : pathParameters) {
			return webTarget.resolveTemplate(pathParameter.getName(), pathParameter.getValue());
		}
		return webTarget;
	}

	private boolean shouldResolveTemplate() {
		URI pathUri = webTarget.getUri();
		String path = pathUri.getPath();
		return path.contains("{") && path.contains("}");
	}
}
