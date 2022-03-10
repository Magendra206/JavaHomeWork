package com.cg.exceptionimppoints;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		System.out.println("Enter b value");
		int b = scan.nextInt();
		try {
			FileReader fe = new FileReader("d.txt");
			
		}catch(FileNotFoundException fen)
		{
			
		}catch(IOException ie)
		{
			
		}catch(Exception e)
		{
			
		}finally
		{
			
		}

	}

}
