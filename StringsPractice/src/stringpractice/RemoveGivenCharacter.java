package stringpractice;

import java.util.Scanner;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("Enter the character to remove from the given string");
		char c = scan.next().charAt(0) ;
		String nstr = "";
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(!(c==ch[i]))
			{
				nstr = nstr+ch[i];
			}
		}
		System.out.println(nstr);

	}

}
