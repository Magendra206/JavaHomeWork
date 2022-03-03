package stringpractice;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = scan.nextLine();
		String rstr = "";
		String nstr = "";
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				
			}
		}
		System.out.println(nstr);
		
		

	}

}
