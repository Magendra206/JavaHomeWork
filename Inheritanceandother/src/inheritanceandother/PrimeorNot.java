package inheritanceandother;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter b number");
		int b = scan.nextInt();
		int temp = 0;
		for(int i=2;i<a && i<b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				temp = temp + 1;
			}
		}
		if(temp == 0)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
		

	}

}
