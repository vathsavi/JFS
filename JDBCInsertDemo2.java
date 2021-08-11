package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/telstra";
		String username = "root";
		String password = "root";
		String insertCommand = "INSERT INTO product VALUES(12, 'Water Bottle', 200)";
		int i = 0;
		
		Connection cn = null;
		Statement st = null;
		try {
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			i = st.executeUpdate(insertCommand);
			System.out.println(i + " Records updated...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
