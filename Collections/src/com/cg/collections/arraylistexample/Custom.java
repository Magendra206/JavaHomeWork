package com.cg.collections.arraylistexample;

public class Custom {
	

	public void ageChecking(int age) throws InvalidAgeException {
		if(age>18)
		{
			System.out.println("age is greater than 18");
		}
		else
		{
			throw new InvalidAgeException("age is less than 18");
		}
		
	}

}
