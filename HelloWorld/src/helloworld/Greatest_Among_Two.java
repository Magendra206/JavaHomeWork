package helloworld;

import java.util.Scanner;

public class Greatest_Among_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first numbers");
		int a = scan.nextInt();
		System.out.println("Enter sceond number");
		int b = scan.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else if(a==b)
		{
			System.out.println("Both the numbers are equal");
		}
		else
		{
			System.out.println(b+" is greater");
		}

	}

}
