package com.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody // convert java to json

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}


}
