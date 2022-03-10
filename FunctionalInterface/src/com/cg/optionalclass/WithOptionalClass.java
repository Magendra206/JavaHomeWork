package com.cg.optionalclass;

import java.util.ArrayList;
import java.util.Scanner;

public class WithOptionalClass {

	static ArrayList<String> groceries = null;
	public static void main(String[] args) {
		groceries =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		groceries.add(null);
		//groceries.add("Wheat");
		//groceries.add("Toor Dal");
		//groceries.add("Chana Dal");
		//groceries.add("Urad Dal");
		//groceries.add(null);
		//System.out.println("enter the grocery name to search in arrayList.......");
		//String searchGrocery = sc.nextLine();
		//boolean found = false;
		//Optional<ArrayList<String>> checkFound  = null;
		
			//checkFound = Optional.ofNullable(groceries);	
		
		System.out.println(groceries.get(0));
		
		
			
		
		
		sc.close();
		

	}

}
