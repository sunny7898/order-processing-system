package com.company.model;

public class Company {
	private String GSTNumber;
	private String name;
	private String address;
	private String city;
	public Company(String gSTNumber, String name, String address, String city) {
		super();
		GSTNumber = gSTNumber;
		this.name = name;
		this.address = address;
		this.city = city;
	}
	public String getGSTNumber() {
		return GSTNumber;
	}
	public void setGSTNumber(String gSTNumber) {
		GSTNumber = gSTNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
