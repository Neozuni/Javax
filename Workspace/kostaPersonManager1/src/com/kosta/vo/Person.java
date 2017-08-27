package com.kosta.vo;

public class Person{
	private String name;
	private String ssn;
	private int age;
	private int salary;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String ssn, int age, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", ssn=" + ssn + ", age=" + age + ", salary=" + salary + "]";
	}

}
