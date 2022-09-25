package com.company.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.exceptions.EmployeeDoesNotExist;
import com.company.model.Employee;
import com.company.util.DbUtil;

public class EmployeeDAO {
	
	static Connection currentConnection = null;
	static ResultSet queryResult = null; 
	
	public static Employee login(Employee employee) throws SQLException, ClassNotFoundException {
		
		PreparedStatement statement;
		
		String userName = employee.getUserName();
		String password = employee.getPassword();
		
		String searchQuery = "SELECT * FROM EMPLOYEES WHERE UserName =" 
								+ userName 
								+ " AND Password=" 
								+ password 
								+";";
		
		try {
			// Connect to DB
			currentConnection = DbUtil.getConnection();
			statement = currentConnection.prepareStatement(searchQuery);
			queryResult = statement.executeQuery();
			
			boolean employeeExist = queryResult.next();
			
			if (!employeeExist) {
				throw new EmployeeDoesNotExist("Employee does not exist in the database");
			}
			
			else if (employeeExist) {
				String firstName = queryResult.getString("FirstName");
				String lastName = queryResult.getString("LastName");
				
				System.out.println("Welcome" + firstName);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
			}
			employee.setValid(employeeExist);			
		} catch(EmployeeDoesNotExist e) {
			e.getMessage();
		}
		return employee;
	}
	
}
