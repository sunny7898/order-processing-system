package com.company.model;

public class Order {
	private String id;
	private String orderDate;
	private String custId;
	private String shippingAddress;
	private String totalOrderValue;
	private String shippingCost;
	private String shippingAgency;
	private String status;
	public Order(String id, String orderDate, String custId, String shippingAddress, String totalOrderValue,
			String shippingCost, String shippingAgency, String status) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.custId = custId;
		this.shippingAddress = shippingAddress;
		this.totalOrderValue = totalOrderValue;
		this.shippingCost = shippingCost;
		this.shippingAgency = shippingAgency;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getTotalOrderValue() {
		return totalOrderValue;
	}
	public void setTotalOrderValue(String totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}
	public String getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}
	public String getShippingAgency() {
		return shippingAgency;
	}
	public void setShippingAgency(String shippingAgency) {
		this.shippingAgency = shippingAgency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
