package stringpractice;

import java.util.Scanner;

public class DeleteAgivenWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		String nstr = "";
		System.out.println("Enter a string to remove from given string");
		String word = scan.next();
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(!words[i].equals(word))
			{
				nstr = nstr+words[i]+" ";
			}
		}
		
		System.out.println(nstr);

	}

}
