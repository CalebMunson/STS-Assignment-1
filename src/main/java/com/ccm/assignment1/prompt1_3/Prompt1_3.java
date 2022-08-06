package com.ccm.assignment1.prompt1_3;

import org.springframework.stereotype.Component;

//Prompt 1: Create example classes for dependency injection: Constructor, Setter, Field
//This file exists for Prompt1_2 to have dependency injection without creating a dependency loop.

@Component
public class Prompt1_3 {
	
	Prompt1_3() {
		System.out.println("From Prompt1_3");
	}
}
