package com.ccm.assignment1.prompt1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccm.assignment1.prompt1_3.Prompt1_3;

//Prompt 1: Create example classes for dependency injection: Constructor, Setter, Field
//This file includes a field dependency injection

@Service
public class Prompt1_2 {
	
	@Autowired
	Prompt1_3 prompt1_3;
	
	Prompt1_2() {
		System.out.println("From Prompt1_2 field injection");
	}
}
