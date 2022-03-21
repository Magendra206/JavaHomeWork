package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = conn.createStatement();
			String dropTable = "drop table seller123456";
		 int i = stmt.executeUpdate(dropTable);
		 if(i==0) {
			 System.out.println("Table Dropped Successfully");
		 }else {
			 System.out.println("Table Not Dropped Successfully");
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
