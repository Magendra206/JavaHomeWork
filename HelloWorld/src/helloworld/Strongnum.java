package helloworld;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		long fact = 1;
		long add = 0;
		long remainder;
		for(int i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial is "+fact);
		while(fact!=0)
		{
			remainder = fact%10;
			add = add + remainder;
			fact = fact/10;
		}
		System.out.println("addition is"+add);
		if(number==add)
		{
			System.out.println("given number is strong");
		}
		else
		{
			System.out.println("given number is not a strong number");
		}
		

	}

}
