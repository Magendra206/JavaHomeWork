package com.cg.crudexampleonhashmap;

public class ProductNotFoundException extends Exception {
	String message;

	public ProductNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	

}
