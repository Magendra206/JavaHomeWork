package com.cg.collections.arraylistexample;

public class AgeInvalidException extends Exception {
	String message;

	public AgeInvalidException(String message) {
		super(message);
		this.message = message;
	}
	

}
