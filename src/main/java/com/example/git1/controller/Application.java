package com.example.git1.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Application {

	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "hello, " + name +", this is spring boot demo";
	}
}
