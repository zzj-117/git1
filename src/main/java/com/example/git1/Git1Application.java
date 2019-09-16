package com.example.git1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class Git1Application {

	public static void main(String[] args) {
		System.out.println("bhxdj");
	}


	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "hello, " + name +", this is spring boot demo";
	}
}
