package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		System.out.println("Enter elements into arraylist");
		for(int i=0;i<n;i++)
		{
			arr.add(scan.nextInt());
		}
		System.out.println("elemnts in arrayList");
		for(Object o :arr)
		{
			System.out.println(o);
		}
		Collections.sort(arr);
		System.out.println(arr);
		

	}

}
