package com.kosta.vo;

public class Teacher extends Person {
	
	int carPeriod;

	
	int salary;


	public Teacher(String name, int phone, String address, int carPeriod, int salary) {
		super(name, phone, address);
		this.carPeriod = carPeriod;
		this.salary = salary;
	}


	public int getCarPeriod() {
		return carPeriod;
	}


	public void setCarPeriod(int carPeriod) {
		this.carPeriod = carPeriod;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+"Teacher [carPeriod=" + carPeriod + ", salary=" + salary + "]";
	}
	
	
	
	

}
