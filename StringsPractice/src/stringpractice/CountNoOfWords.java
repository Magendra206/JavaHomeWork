package stringpractice;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		int count = 0;
		String[] words = str.split(" ");
		for(String w:words)
		{
			System.out.println(w);
		}
		/*for(int i=0;i<words.length;i++)
		{
			count = count+1;
		}
		System.out.println(("Total words in a string is "+count));*/
		for(String c:words)
		{
			count = count + 1;
		}
		System.out.println("Total no of words in string array"+count);
		scan.close();
		

	}

}
