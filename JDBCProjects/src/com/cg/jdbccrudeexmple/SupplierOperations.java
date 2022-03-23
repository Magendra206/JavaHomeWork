package com.cg.jdbccrudeexmple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SupplierOperations {
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	
	public Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step2 : Establish the Connection
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public void selectData() {
		String selectSupplier = "select * from supplierr";
		try {
			conn = getDBConnection();
			pstmt = conn.prepareStatement(selectSupplier);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("supplier Details are.......");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getFloat(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void insertData() {
		try {
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String insertSql = "insert into supplierr values(?,?,?)";
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter the supplierDetails....");
			System.out.println("Enter the supplier Id....");
			int ppid = sc.nextInt();
			System.out.println("Enter the supplier Name....");
			sc.nextLine();
			String ppname = sc.nextLine();
			System.out.println("Enter the supplier Price....");
			float pprice = sc.nextFloat();

			PreparedStatement pstmt = conn.prepareStatement(insertSql);

			pstmt.setInt(1, ppid);
			pstmt.setString(2, ppname);
			pstmt.setFloat(3, pprice);
			// insert into product values(ppid,ppid,pprice);
			int i = pstmt.executeUpdate();
			conn.commit();
			if (i != 0) {
				System.out.println("Inserted Data Successfully");
			} else {
				System.out.println("Data is not Inserted  Successfully");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

	public void updateSupplierPriceData() {
		// TODO Auto-generated method stub
		try {
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String updateSql = "update product set supp_price = ? where supp_id = ?";
			
			System.out.println("Enter the supplierDetails to update....");
			System.out.println("Enter the supplier Id to update price....");
			int ppid = sc.nextInt();

			System.out.println("Enter the updated supplier Price....");
			float pprice = sc.nextFloat();

			PreparedStatement pstmt = conn.prepareStatement(updateSql);
			pstmt.setFloat(1, pprice);
			pstmt.setInt(2, ppid);
			//pstmt.setString(2, ppname);
			
			// insert into product values(ppid,ppid,pprice);
			int i = pstmt.executeUpdate();
			conn.commit();
			if (i != 0) {
				System.out.println("updated Data Successfully");
			} else {
				System.out.println("Data is not updated  Successfully");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteData() {
		try {
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String deleteSql = "delete from supplierr where supp_id = ?";
			
		
			System.out.println("Enter the supplier Id to delete....");
			int ppid = sc.nextInt();



			PreparedStatement pstmt = conn.prepareStatement(deleteSql);
			//pstmt.setFloat(1, pprice);
			pstmt.setInt(1, ppid);
			//pstmt.setString(2, ppname);
			
			// insert into product values(ppid,ppid,pprice);
			int i = pstmt.executeUpdate();
			conn.commit();
			if (i != 0) {
				System.out.println("delete Data Successfully");
			} else {
				System.out.println("Data is not deleted  Successfully");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	

}
