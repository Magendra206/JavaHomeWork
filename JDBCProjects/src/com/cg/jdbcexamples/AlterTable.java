package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		
		//Step3: create the sql select statement
			Statement stmt = conn.createStatement();
		//Step4 : execute the query
			String alterProductTable = "alter table product add prod_category varchar(30)";
		 int i = stmt.executeUpdate(alterProductTable);
		 if(i==0) {
			 System.out.println("Table Altered Successfully");
		 }else {
			 System.out.println("Table Not Altered Successfully");
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
