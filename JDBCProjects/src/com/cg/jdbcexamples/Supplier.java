package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Supplier {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = conn.createStatement();
				String insertProduct = "insert into supplier values(1,'Raj','raj@gmail.com','8411026385','pune')";
			 int i = stmt.executeUpdate(insertProduct);
			 if(i!=0) {
				 System.out.println("Inserted Data Successfully");
			 }else {
				 System.out.println("Data is not Inserted  Successfully");
			 }
		}
		catch (ClassNotFoundException ce) {	
			ce.printStackTrace();
		}
		catch (SQLException se) {	
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
