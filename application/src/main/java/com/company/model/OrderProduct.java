package com.company.model;

import java.util.ArrayList;

public class OrderProduct {
	private String orderId;
	private ArrayList<String> products;
	public OrderProduct(String orderId, ArrayList<String> products) {
		super();
		this.orderId = orderId;
		this.products = products;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public ArrayList<String> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<String> products) {
		this.products = products;
	}
}
