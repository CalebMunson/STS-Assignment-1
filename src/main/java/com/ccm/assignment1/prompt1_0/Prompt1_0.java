package com.ccm.assignment1.prompt1_0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccm.assignment1.prompt1_1.Prompt1_1;
import com.ccm.assignment1.prompt2_3.Prompt2_3;

//Prompt 1: Create example classes for dependency injection: Constructor, Setter, Field
//This file includes a constructor dependency injection

//Prompt 2: Create example classes for Autowire.
//This file includes a byName autowire on line #30.
//This file includes a byType autowire on line #33.
//This file includes a Qualifier autowire on line #27.

//Prompt 3: Create a spring boot program and write a simple get end-point
//This file contains several commands using @getmapping to run the results of autowiring from prompt 2.

@RestController
public class Prompt1_0 {
	
	@Autowired
	@Qualifier("Prompt2_3bImpl")
	Prompt2_3 prompt2_3;
	
	@Autowired
	Prompt2_3 prompt2_3aImpl;
	
	@Autowired
	Prompt1_1 prompt1_1;
	
	@Autowired
	Prompt1_0(Prompt1_1 prompt1_1) {
		System.out.println("From prompt1_0 constructor injection");
		this.prompt1_1 = prompt1_1;
	}
	
	@GetMapping("/test")
	public String getUsers() {
		return "Hello world!";
	}
	
	@GetMapping("/test2")
	public void testImpl() {
		prompt2_3aImpl.getUsers();
	}
	
	@GetMapping("/test3")
	public void testQualif() {
		prompt2_3.getUsers();
	}	
}