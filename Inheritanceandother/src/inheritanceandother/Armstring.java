package inheritanceandother;

import java.util.Scanner;

public class Armstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scan.nextInt();
		int add=0;
		int remainder;
		while(number!=0)
		{
			remainder = number%10;
			add = add + remainder*remainder*remainder;
			number = number/10;
		}
		System.out.println(add);

	}

}
