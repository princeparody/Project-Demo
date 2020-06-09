package com.exception;

public class UserNotFound extends Exception {
	
	@Override
	public String getMessage() {
	
		String n = "User is not found";
		return n;
	}

}
