package com.other;

import java.util.Scanner;

public class HRDesignation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of string array");
		int n = scan.nextInt();
		int count = 0;
		boolean found = false;
		String[] str = new String[n];
		if(n>0)
		{
			for(int i=0;i<str.length;i++)
			{
				str[i] = scan.nextLine();
			}
			for(int i=0;i<str.length;i++)
			{
				if(str[i].substring(0, 2).equalsIgnoreCase("HR"))
				{
					found = true;
					count++;
				}
			}
			if(found==true)
			{
				System.out.println("Total "+count +"Designation in hr department");
			}
			else
			{
				System.out.println("No designation found in hr department");
			}
			for(String s:str)
			{
				if(s.substring(0, 2).equalsIgnoreCase("HR"))
				{
					System.out.println(s.toUpperCase());
				}
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

	}

}
