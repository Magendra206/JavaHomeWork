package com.cg.jdbccrudeexmple;

import java.util.Scanner;

public class SupplierUtil {
	public static void suppOperations() {
		Scanner sc = new Scanner(System.in);
		String choice;
		char ch = 'y';
		SupplierOperations sop = new SupplierOperations();
		while(ch=='y') {
			System.out.println("Enter the choice");
			System.out.println("select : for select stmt");
			System.out.println("insert : for insert stmt");
			System.out.println("update : for update stmt");
			System.out.println("delete : for delete stmt");
			choice = sc.nextLine();
			switch (choice) {
			case "select":
				sop.selectData();
				break;
			case "insert":
				sop.insertData();
				break;
			case "update":
				sop.updateSupplierPriceData();
				break;
			case "delete":
				sop.deleteData();
				break;
			default:
				System.out.println("Not a proper choice....");
				break;
			}
			System.out.println("Enter choice if you want to continue....(y/n)...");
			ch = sc.next().charAt(0);
		}
			sc.close();
	}

}
