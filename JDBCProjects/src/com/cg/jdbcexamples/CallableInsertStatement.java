package com.cg.jdbcexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableInsertStatement {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step2 : Establish the Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");

			//CallableStatement cstmt = conn.prepareCall("{call insertProduct()}");
			CallableStatement cstmt = conn.prepareCall("{call insertProductUsingParameter(?,?,?)}");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the product details....");
			System.out.println("Enter the productId...");
			int productId = sc.nextInt();
			System.out.println("Enter the productName...");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Enter the productPrice...");
			float productPrice = sc.nextFloat();
			cstmt.setInt(1, productId);
			cstmt.setString(2, productName);
			cstmt.setFloat(3, productPrice);
			
			boolean result = cstmt.execute();
			if(!result) {
				System.out.println("inserted successfully");
			}else {
				System.out.println("not inserted successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
