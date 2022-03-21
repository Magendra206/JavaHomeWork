package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = conn.createStatement();
			String insertProduct = "insert into product values(4,'TextBook',95)";
		 int i = stmt.executeUpdate(insertProduct);
		 if(i!=0) {
			 System.out.println("Inserted Data Successfully");
		 }else {
			 System.out.println("Data is not Inserted  Successfully");
		 }
		}catch (ClassNotFoundException ce) {	
			ce.printStackTrace();
		}
		catch (SQLException se) {	
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
