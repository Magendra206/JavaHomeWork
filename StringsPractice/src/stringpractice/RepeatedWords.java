package stringpractice;

import java.util.Scanner;

public class RepeatedWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			count = 1;
			for(int j=i+1;j<words.length;j++)
			{
				
				if(words[i].equals(words[j]))
				{
					count = count + 1;
					words[j] = "0";
				}
			}
			if(count>1 && words[i]!="0")
			{
				System.out.println(words[i]);
			}
		}
		
	}

}
