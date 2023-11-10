package com.test.lamiaprimaprova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PrimoController {
	
	@GetMapping("/hello")
	public String getHelloWorl() {
		return "Hello world";
	}
	
	@PostMapping("/hello")
	public String getHelloWorldPost() {
		return "Hello World, ma con il metodo Post";
	}
}
