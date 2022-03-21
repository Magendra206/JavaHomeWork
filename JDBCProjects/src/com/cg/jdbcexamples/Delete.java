package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step2 : Establish the Connection
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		
		//Step3: create the sql select statement
			Statement stmt = conn.createStatement();
		//Step4 : execute the query
			String deleteProduct = "delete from product where prod_id = 4";
		 int i = stmt.executeUpdate(deleteProduct);
		 if(i != 0) {
			 System.out.println(i + " rows deleted.......");
			 System.out.println("Delete Data Successfully");
		 }else {
			 System.out.println("Data is not deleted");
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
