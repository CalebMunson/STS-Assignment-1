package com.ccm.assignment1.prompt2_0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ccm.assignment1.prompt2_1.Prompt2_1;

//Prompt 2: Create example classes for Autowire.
//This file includes a byType autowire.
//This is because it autowires a Prompt2_1.

@Controller
public class Prompt2_0 {
	
	@Autowired
	Prompt2_1 prompt2_1;
	
	public void getUsers() {
		System.out.println("From prompt2_0");
	}
	
}
