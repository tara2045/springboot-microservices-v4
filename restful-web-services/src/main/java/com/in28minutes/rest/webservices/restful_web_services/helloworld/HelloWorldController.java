package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {
	
	// /hello-world
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world1")
	public String helloWorld() {
		return "Hello World Back1";
	}

}
