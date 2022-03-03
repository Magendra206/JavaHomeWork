package stringpractice;

import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter th string");
		String str = scan.nextLine();
		
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]+" ");
					break;
				}
			}
		}

		
		
		/*char ch[] = str.toCharArray();
		System.out.println(ch);
		
		/*for(int i=0;i<str.length();i++)
		{
			System.out.println(ch);
		}*/
		
		
		
		
	}

}
