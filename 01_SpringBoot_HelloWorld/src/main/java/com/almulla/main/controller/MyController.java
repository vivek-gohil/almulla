package com.almulla.main.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myapi")
public class MyController {
	
	@GetMapping("getmessage")
	public String printGetMessage() {
		return "printGetMessage() called";
	}
	
	@PostMapping("postmessage")
	public String printPostMessage() {
		return "printPostMessage() called";
	}
	
	@PutMapping("postmessage")
	public String printPutMessage() {
		return "printPutMessage() called";
	}
	
	@DeleteMapping("deletemessage")
	public String printDeleteMessage() {
		return "printDeleteMessage() called";
	}
}
