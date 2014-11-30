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

package com.restio.manager.parameter;

/**
 * 
 * @author tham
 *
 */
public abstract class BaseParameter implements Parameter {
	protected String name;
	protected String value;
	protected ParameterType type;
	
	protected BaseParameter(String name, String value, ParameterType type) {
		this.name  = name;
		this.value = value;
		this.type = type;
	}
	
	@Override
	public ParameterType getType() {
		return type;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}	
}
