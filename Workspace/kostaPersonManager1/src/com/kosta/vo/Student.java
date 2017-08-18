package com.kosta.vo;

public class Student extends Person {
	int stuNum;
	int age;
	public Student(String name, int phone, String address, int stuNum, int age) {
		super(name, phone, address);
		this.stuNum = stuNum;
		this.age = age;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [stuNum=" + stuNum + ", age=" + age + "]";
	}
	
	
	
	

}
