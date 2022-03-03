package stringpractice;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int idx = str.indexOf(ch,i+1);
			if(idx==-1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
	}

}
