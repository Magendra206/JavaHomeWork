package stringpractice;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		/*for(char c:ch1)
		{
			System.out.print(c);
		}
		System.out.println();*/

	}

}
