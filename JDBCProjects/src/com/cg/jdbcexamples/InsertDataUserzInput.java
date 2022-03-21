package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataUserzInput {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		String insertSql = "insert into product values(?,?,?)";
		Scanner sc = new Scanner(System.in);
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
		//insert into product values(ppid,ppid,pprice);
		int i = pstmt.executeUpdate();
		conn.commit();
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
