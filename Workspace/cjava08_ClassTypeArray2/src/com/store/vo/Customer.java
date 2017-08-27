package com.store.vo;

public class Customer {
	private int ssn;
	private String custName;
	private String address;
	private Product[] products;
	public Customer(int ssn, String custName, String address) {
		super();
		this.ssn = ssn;
		this.custName = custName;
		this.address = address;
		
	}
	
	public void setProduct(Product[] products) {
		this.products = products;
		
	}
	
	public void changeAddress(String address) {
		this.address = address;
		
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Product[] getProducts() {
		return products;
	}

}
