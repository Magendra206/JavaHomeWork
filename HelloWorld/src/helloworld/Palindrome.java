package helloworld;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		int reverse = 0;
		int remainder;
		while(number!=0)
		{
			remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;
			
		}
		if(number==reverse)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not a palindrome");
		}

	}

}
