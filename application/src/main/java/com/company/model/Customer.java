package com.company.model;

public class Customer {
	private String id;
	private String name;
	private String GSTNum;
	private String address;
	private String city;
	private String emailId;
	private String phoneNum;
	private String pincode;
	
	public Customer(String id, String name, String gSTNum, String address, String city, String emailId,
			String phoneNum, String pincode) {
		super();
		this.id = id;
		this.name = name;
		GSTNum = gSTNum;
		this.address = address;
		this.city = city;
		this.emailId = emailId;
		this.phoneNum = phoneNum;
		this.pincode = pincode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGSTNum() {
		return GSTNum;
	}

	public void setGSTNum(String gSTNum) {
		GSTNum = gSTNum;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
