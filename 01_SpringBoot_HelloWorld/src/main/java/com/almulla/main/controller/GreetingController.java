package com.almulla.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/greetingapi/greet
//http://localhost:8080/greetingapi/meet
//Hello World!!
@RestController
@RequestMapping("greetingapi")
public class GreetingController {

	//@RequestMapping(value = "greet" , method = RequestMethod.GET)
	@GetMapping("greet")
	public String printGreetMessage() {
		return "Hello World!!";
	}
	

	//@RequestMapping(value = "meet" , method = RequestMethod.GET)
	@GetMapping("meet")
	public String printMeetMessage() {
		return "Hello World From Meet !!";
	}

}
