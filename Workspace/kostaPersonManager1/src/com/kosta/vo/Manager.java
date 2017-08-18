package com.kosta.vo;

public class Manager extends Person {
	int empNum;
	String dept;
	public Manager(String name, int phone, String address, int empNum, String dept) {
		super(name, phone, address);
		this.empNum = empNum;
		this.dept = dept;
	}
	
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpNum() {
		return empNum;
	}


	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return super.toString()+"Manager [empNum=" + empNum + ", dept=" + dept + "]";
	}
	
	

}
