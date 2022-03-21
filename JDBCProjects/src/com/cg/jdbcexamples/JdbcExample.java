package com.cg.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" \t"+rs.getString(2)+"\t"+rs.getString(3));
		}

	}

}
