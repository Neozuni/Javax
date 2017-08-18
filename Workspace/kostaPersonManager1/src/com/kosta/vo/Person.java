package com.kosta.vo;

public class Person {
	String name;
	int phone;
	String address;
	int pNumber;
	
	public Person(String name, int phone, String address, int pNumber) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.pNumber = pNumber;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	

}
