/**
 * 
 */
package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection connection;
	public static String URL;
	
	private DbUtil() {}
	
	public static Connection getConnection() throws ClassNotFoundException {
		try {
			URL = "jdbc:mysql://localhost:3306/order_processing_system";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL,"root", "root");
			System.out.println(connection.toString());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}
