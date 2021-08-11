package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/telstra";
		String username = "root";
		String password = "root";
		String selectCommand = "select * from product";
		int i =0;
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			rs = st.executeQuery(selectCommand);
			
			while(rs.next()) {
				int prodID = rs.getInt("prodID");
				String prodName = rs.getString("prodName");
				int prodPrice = rs.getInt("prodPrice");
				System.out.println("prodID: " + prodID + " prodName: "+ prodName + " prodPrice: " + prodPrice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
