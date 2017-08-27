package com.kosta.vo;

public class Manager extends Person{
	private String dept;

	public Manager(String name, String ssn, int age, int salary, String dept) {
		super(name, ssn, age, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [dept=" + dept + "]";
	}






}