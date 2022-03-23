package com.cg.jdbcexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallableStatementExample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step2 : Establish the Connection
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Product id....");
		int pid = sc.nextInt();
		CallableStatement cstmt = conn.prepareCall("{call getProduct(?,?,?)}");
		cstmt.setInt(1, pid);
		//get the out put in to out parameters
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		cstmt.registerOutParameter(3, java.sql.Types.FLOAT);
		boolean result = cstmt.execute();
		if(!result) {
			System.out.println("executed successfully");
			String pname = cstmt.getString(2);
			float pprice = cstmt.getFloat(3);
			System.out.println("Product Name = " + pname + "\t" + "Product Price = " + pprice);
		}else {
			System.out.println("not executed successfully");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
