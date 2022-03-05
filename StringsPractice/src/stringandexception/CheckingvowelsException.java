package stringandexception;

import java.util.Scanner;

public class CheckingvowelsException {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine().toLowerCase();
		int count = 0;
		
		try {
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				{
					count = count + 1;
				}
				else
				{
					Exception e = new Exception();
					throw e;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Special character occured");
		}
		finally
		{
			System.out.println("No Of vowels" +count);
		}

	}

}
