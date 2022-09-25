package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Invoice {
	private String id;
	private String invoiceDate;
	private String orderId;
	private String custId;
	private ArrayList<HashMap<String, Double>> productsWithGST;
	private String typeGST;
	private Double totalInvoiceValue;
	private String status;
	public Invoice(String id, String invoiceDate, String orderId, String custId,
			ArrayList<HashMap<String, Double>> productsWithGST, String typeGST, Double totalInvoiceValue,
			String status) {
		super();
		this.id = id;
		this.invoiceDate = invoiceDate;
		this.orderId = orderId;
		this.custId = custId;
		this.productsWithGST = productsWithGST;
		this.typeGST = typeGST;
		this.totalInvoiceValue = totalInvoiceValue;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public ArrayList<HashMap<String, Double>> getProductsWithGST() {
		return productsWithGST;
	}
	public void setProductsWithGST(ArrayList<HashMap<String, Double>> productsWithGST) {
		this.productsWithGST = productsWithGST;
	}
	public String getTypeGST() {
		return typeGST;
	}
	public void setTypeGST(String typeGST) {
		this.typeGST = typeGST;
	}
	public Double getTotalInvoiceValue() {
		return totalInvoiceValue;
	}
	public void setTotalInvoiceValue(Double totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}
