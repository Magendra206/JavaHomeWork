package com.cg.collections.arraylistexample;

import java.util.ArrayList;

public class ArrayListHw {

	public static void main(String[] args)  {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(5);
		ar.add(20);
		ar.add(11);
		ar.add(30);
		ar.add(13);
		
		System.out.println("Elements in arrayList "+ar);
		
		ArrayList<Integer> ap = new ArrayList<Integer>();
		for(Integer i:ar)
		{
			try {
				if(i%2==1)
				{
					ap.add(i);
				}
				else
				{
					throw new NorPrimeNumberException("number is not prime");
				}
			} catch (Exception msg) {
				msg.printStackTrace();
			}
		}
		System.out.println("prime numbers"+ap);
		
		

	}

}
