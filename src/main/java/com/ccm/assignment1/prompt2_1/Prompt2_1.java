package com.ccm.assignment1.prompt2_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ccm.assignment1.prompt2_2.Prompt2_2;

//Prompt 2: Create example classes for Autowire.
//This file includes a qualifier autowire.
//This is because it autowires a Prompt2_2 and declares the name with the qualifier annotation.

@Repository
public class Prompt2_1 {
	
	@Autowired
	@Qualifier("Prompt2_2")
	Prompt2_2 prompt2_2;
	
	public void getUsers() {
		
	}
}
