package lmspractice;

import java.util.Scanner;

public class PrimeLarge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter tha value of a");
		int a = scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		boolean f1 = true;
		boolean f2 = true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				f1 = false;
				break;
			}
		}
		for(int i =2;i<b;i++)
		{
			if(b%i==0)
			{
				f2 = false;
				break;
			}
		}
		if(a==b)
		{
			System.out.println(0);
		}
		else if(f1==true && f2==true)
		{
			if(a>b)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(b);
			}
		}
		else
		{
			if(a<b)
			{
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}

	}

}
