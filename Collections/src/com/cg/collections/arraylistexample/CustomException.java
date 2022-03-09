package com.cg.collections.arraylistexample;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();
		Custom c = new Custom();
		try {
			c.ageChecking(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
