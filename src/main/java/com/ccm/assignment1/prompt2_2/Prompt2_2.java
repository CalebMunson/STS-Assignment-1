package com.ccm.assignment1.prompt2_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ccm.assignment1.prompt2_3.Prompt2_3;

//Prompt 2: Create example classes for Autowire.
//This file includes a byName autowire.
//This is because it autowires a Prompt2_3 but specifies the name as an implementation, Prompt2_3aImpl.

@Service("Prompt2_2")
public class Prompt2_2 {
	
	@Autowired
	Prompt2_3 prompt2_3aImpl;
	
	public void getUsers() {
		prompt2_3aImpl.getUsers();
	}
}
