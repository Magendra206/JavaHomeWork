package helloworld;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		int add = 0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				add = add + i;
			}
		}
		System.out.println(add);
		if(number == add)
		{
			System.out.println("given number is perfect number");
		}
		else
		{
			System.out.println("given number is not a perfect number");
		}

	}

}
