package stringpractice;

import java.util.Scanner;

public class CountNoOfCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		int count = 0;
		String[] ch = str.split("");
		for(String c:ch)
		{
			System.out.println(c);
		}
		for(String c:ch)
		{
			count = count+1;
		}
		System.out.println(count);
		

	}

}
