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

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author tham
 *
 */
public class PersonDataProvider {
	private static final PersonDataProvider instance = new PersonDataProvider();
	private static final Map<String, Person> personMap = new HashMap<String, Person>(8);
	
	private PersonDataProvider() {}
	
	public static final synchronized PersonDataProvider getInstance() {
		return instance;
	}
	
	static {
		personMap.put("1", new Person("1", "Roy", "Fielding"));
		personMap.put("2", new Person("2", "Emily", "Mia"));
		personMap.put("3", new Person("3", "Daniel", "Liam"));
	}
}
