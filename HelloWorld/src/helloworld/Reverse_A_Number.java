package helloworld;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Four digit Number");
		int number = scan.nextInt();
		int reverse = 0;
		int remainder;
		while(number!=0)
		{
			remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;
		}
		System.out.println("Reversed Number is"+reverse);

	}

}
