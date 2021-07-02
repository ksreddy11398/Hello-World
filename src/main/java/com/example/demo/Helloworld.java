package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@GetMapping("/")
	public String show() {
		return "Hi ksreddy";
	}
	
	@GetMapping("value=/hello")
	public String show1() {
		return "Hello";
	}
	
	

}