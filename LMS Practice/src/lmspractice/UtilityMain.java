package lmspractice;

import java.util.Scanner;

public class UtilityMain {

	public static void main(String[] args) {
		Utility ut = new Utility();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the option");
		int option = scan.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("enter the temp in farheit");
			double fahrenheit = scan.nextDouble();
			int res = ut.fahrenheitToCelcius(fahrenheit);
			System.out.println(res);
			break;
		case 2:
			System.out.println("enter the length of array");
			int n = scan.nextInt();
			int[] array = new int[n];
			System.out.println("enter the elements into array");
			for(int i=0;i<n;i++)
			{
				array[i] = scan.nextInt();
			}
			String res1 = ut.getLevel(array);
			System.out.println(res1);
			break;
		default:
			System.out.println("Invalid option");
		}

	}

}
