package encapsulation;

import java.util.Scanner;

public class Bank {
	float simpleIntrest, time, principalAmount, rateOfIntrest;

	Scanner sc = new Scanner(System.in);

	public void readDetails() {
		System.out.println("Emter the details");

		System.out.println("Enter the Simple Intrest ");
		simpleIntrest = sc.nextFloat();

		System.out.println("Enter the time in years ");
		time = sc.nextFloat();

		System.out.println("Enter the principalAmount ");
		principalAmount = sc.nextFloat();
	}

	public void printDetails() {
		System.out.println("Entered details are");

		System.out.println("simpleIntrest = " + simpleIntrest);

		System.out.println(" time in years =" + time);

		System.out.println(" principalAmount = " + principalAmount);
		
		rateOfIntrest=(simpleIntrest*100)/(principalAmount*time);
		System.out.println("Rate Of intrest "+rateOfIntrest);

	}

}


