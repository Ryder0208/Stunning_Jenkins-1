package com.vir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResources {
	@GetMapping
	public String helloworld()
	{
		return "****Hello World..****";
		
	}

}
