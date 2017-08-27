package com.kosta.vo;


public class Student extends Person{
	private int totalAttendDay;

	public Student(String name, String ssn, int age, int salary, int totalAttendDay) {
		super(name, ssn, age, salary);
		this.totalAttendDay = totalAttendDay;
	}

	public int getTotalAttendDay() {
		return totalAttendDay;
	}

	public void setTotalAttendDay(int totalAttendDay) {
		this.totalAttendDay = totalAttendDay;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [totalAttendDay=" + totalAttendDay + "]";
	}


}