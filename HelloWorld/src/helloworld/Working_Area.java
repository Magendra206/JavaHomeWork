package helloworld;

import java.util.Scanner;

public class Working_Area {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();
		System.out.println("Enter the sex male or female");
		String s = scan.next();
		System.out.println("Enter the maritial status");
		String ms = scan.next();
		if (s.equalsIgnoreCase("female"))
		{
			System.out.println("she will work only  in urban areas");
		}
		else
		{
			if(age>=20 && age<=40)
			{
				System.out.println("He may work in anywhere");
			}
			else if(age>=40 && age<=60)
			{
				System.out.println("He will work in urban areas only");
			}
			else
			{
				System.out.println("ERROR");
			}
		}

	}

}
