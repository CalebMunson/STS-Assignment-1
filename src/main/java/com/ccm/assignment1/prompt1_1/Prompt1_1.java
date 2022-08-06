package com.ccm.assignment1.prompt1_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.ccm.assignment1.prompt1_2.Prompt1_2;
import com.ccm.assignment1.prompt2_3.Prompt2_3;

//Prompt 1: Create example classes for dependency injection: Constructor, Setter, Field
//This file includes a setter dependency injection

@Repository
public class Prompt1_1 {

	Prompt1_2 prompt1_2;
	
	@Autowired
	public void setPrompt1_2(Prompt1_2 prompt1_2) {
		System.out.println("From prompt1_1 setter injection");
		this.prompt1_2 = prompt1_2;
	}
	
}
