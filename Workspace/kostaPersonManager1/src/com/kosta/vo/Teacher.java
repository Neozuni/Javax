package com.kosta.vo;

public class Teacher extends Person{
	private int teachPeriod;

	public Teacher(String name, String ssn, int age, int salary, int teachPeriod) {
		super(name, ssn, age, salary);
		this.teachPeriod = teachPeriod;
	}

	public int getTeachPeriod() {
		return teachPeriod;
	}

	public void setTeachPeriod(int teachPeriod) {
		this.teachPeriod = teachPeriod;
	}

	@Override
	public String toString() {
		return super.toString()+"Teacher [teachPeriod=" + teachPeriod + "]";
	}






}