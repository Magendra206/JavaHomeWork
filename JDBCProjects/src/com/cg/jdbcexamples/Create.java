package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = conn.createStatement();
			String createSeller = "create table seller12(seller_id int,seller_name varchar(30),seller_email varchar(40),seller_mobno varchar(12),seller_city varchar(20))";
		 int i = stmt.executeUpdate(createSeller);
		 if(i==0) {
			 System.out.println("Table created Successfully");
		 }else {
			 System.out.println("Table not created  Successfully");
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
