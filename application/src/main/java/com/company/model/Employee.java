package com.company.model;

import java.util.ArrayList;

public class Employee {
	private String id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String lastLoggedInDateTime;
	private ArrayList<String> orders;
	private boolean valid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public ArrayList<String> getOrders(String empId){
		return orders;
	}
	
}
