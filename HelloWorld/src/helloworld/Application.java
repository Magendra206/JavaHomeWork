package helloworld;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of employee");
		String name = scan.next();
		System.out.println("Enter the Working Years of Employee");
		int wy = scan.nextInt();
		System.out.println("Enter the Department of Employee");
		String department = scan.next();
		System.out.println("Enter the employee Rating");
		String rating = scan.next();
		System.out.println("Enter the employee salary");
		int sal = scan.nextInt();
		if(wy>=2 && rating.equalsIgnoreCase("average") || rating.equalsIgnoreCase("above average") || rating.equalsIgnoreCase("outstanding"))
		{
			System.out.println(name +" is eligible of bonus");
			if(department.equalsIgnoreCase("HR"))
			{
				int bonus = sal*2/100;
				System.out.println(bonus+"is your bonus increased by 2%");
			}
			else if(department.equalsIgnoreCase("Accounting"))
			{
				int bonus = sal*3/100;
				System.out.println(bonus+"is your bonus increased by 3%");
			}
			else if(department.equalsIgnoreCase("IT"))
			{
				int bonus = sal*5/100;
				System.out.println(bonus+"is your bonus increased by 5%");
			}
			else if(department.equalsIgnoreCase("sales"))
			{
				int bonus = sal*8/100;
				System.out.println(bonus+"is your bonus increased by 8%");
			}
			
		}
		else
		{
			System.out.println("employee is not eligible for bonus");
		}
		
		
		

	}

}
