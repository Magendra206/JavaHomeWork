package com.cg.collections.arraylistexample;

public class StudentNotFoundException extends Exception {
	String message ;

	public StudentNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	

}
