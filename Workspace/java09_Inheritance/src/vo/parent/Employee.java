package vo.parent;

import util.MyDate;

public class Employee {
	private String ssn;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public String getDetails() {
		return ssn + "\t" +birthDate +"\t"+ salary ;
		
		
	}

	public Employee(String ssn, String name, MyDate birthDate, double salary) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	
}
