package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = conn.createStatement();
			String updateProduct = "update product set prod_price = 65 where prod_id = 3";
		 int i = stmt.executeUpdate(updateProduct);
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