package com.cg.jdbccrudeexmple;

import java.util.Scanner;

public class JDBCUtil {
	public static void jdbcOperations() {
		Scanner sc = new Scanner(System.in);
		String choice;
		char ch = 'y';
		JDBCOperations jop = new JDBCOperations();
		// ch = sc.next().charAt(0);
		while(ch=='y') {
			System.out.println("Enter the choice");
			System.out.println("select : for select stmt");
			System.out.println("insert : for insert stmt");
			System.out.println("update : for update stmt");
			System.out.println("delete : for delete stmt");
			sc.nextLine();
			choice = sc.nextLine();
			switch (choice) {
			case "select":
				jop.selectData();
				break;
			case "insert":
				jop.insertData();
				break;
			case "update":
				jop.updateProductPriceData();
				break;
			case "delete":
				jop.deleteData();
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
