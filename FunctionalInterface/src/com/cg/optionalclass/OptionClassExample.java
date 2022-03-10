package com.cg.optionalclass;

import java.util.Optional;

public class OptionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] stmts = new String[20];
		
		String str = "This is Optional Class in Java 8 for handling Null Pointer Exception";
		stmts[5] = str; //setting value of 5th index of string array
		Optional<String> checkStr5IsNull = Optional.ofNullable(stmts[3]);
		boolean nullOrNot = checkStr5IsNull.isPresent();
		System.out.println(nullOrNot);
		System.out.println(checkStr5IsNull.get());

	}

}
