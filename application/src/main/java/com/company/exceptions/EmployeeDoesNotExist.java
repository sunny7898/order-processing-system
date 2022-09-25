package com.company.exceptions;

public class EmployeeDoesNotExist extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EmployeeDoesNotExist(String message) {
		super(message);
	}
}
