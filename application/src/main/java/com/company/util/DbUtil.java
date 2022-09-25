/**
 * 
 */
package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sunny
 *
 */
public class DbUtil {
	public static Connection connection;
	private DbUtil() {}
	
	public static Connection connection() {
		try {
			connection = DriverManager.getConnection("jdbc:derby:OrderDb");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}
