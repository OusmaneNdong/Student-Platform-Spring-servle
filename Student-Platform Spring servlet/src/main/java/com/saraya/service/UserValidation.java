package com.saraya.service;

public class UserValidation {
	
	public boolean isValid(String name , String password) {
		if(name.equalsIgnoreCase("ousmane") && password.equalsIgnoreCase("22446688"))
			return true;
		return false;
	}

}
