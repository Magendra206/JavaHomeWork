package com.cg.jdbccrudeexmple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOperations {
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);

	/*
	 * the following method is used to connect with database
	 */

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
		String selectProducts = "select * from product";
		try {
			conn = getDBConnection();
			pstmt = conn.prepareStatement(selectProducts);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Product Details are.......");
			System.out.println("ProductId " + "\t" + "ProductName " + "\t" + "ProductPrice ");
			System.out.println("|============|" + "\t" + "================|" + "\t" + "============|");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getFloat(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertData() {
		// Step1 : Register the Driver
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step2 : Establish the Connection
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String insertSql = "insert into product values(?,?,?)";
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ProductDetails....");
			System.out.println("Enter the Product Id....");
			int ppid = sc.nextInt();
			System.out.println("Enter the Product Name....");
			sc.nextLine();
			String ppname = sc.nextLine();
			System.out.println("Enter the Product Price....");
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

	public void updateProductPriceData() {
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step2 : Establish the Connection
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String updateSql = "update product set prod_price = ? where prod_id = ?";
			
			System.out.println("Enter the ProductDetails to update....");
			System.out.println("Enter the Product Id to update price....");
			int ppid = sc.nextInt();

			System.out.println("Enter the updated Product Price....");
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
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step2 : Establish the Connection
			conn = getDBConnection();

			// Step3: create the sql insert prepared statement
			String deleteSql = "delete from product where prod_id = ?";
			
		
			System.out.println("Enter the Product Id to delete....");
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
