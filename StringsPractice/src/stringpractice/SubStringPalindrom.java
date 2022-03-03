package stringpractice;

import java.util.Scanner;

public class SubStringPalindrom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("Enter the indexs to extract a string");
		
		String rev = "";
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		String substr = str.substring(index1,index2);
		for(int i=substr.length()-1;i>=0;i--)
		{
			rev = rev + substr.charAt(i);
		}
		if(rev.equals(substr))
		{
			System.out.println("given string is palindrom");
		}
		else
		{
			System.out.println("given string is not a palindrom");
		}
		
		//StringBuilder sb = new StringBuilder();
		
		//sb.append(str.substring(index1, index2));
		//System.out.println(sb);
		//System.out.println(sb.reverse());
		//if(sb.equals(sb.reverse()))
		/*{
			System.out.println("given string is palindrom");		}
		else
		{
			System.out.println("is not  a palindrom");
		}*/
		

	}

}
