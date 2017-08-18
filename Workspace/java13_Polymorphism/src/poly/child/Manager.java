package poly.child;

import poly.parent.*;

public class Manager extends Employee {
	private String dept;

	public Manager(String empID, String name, String address, int salary, String dept) {
		super(empID, name, address, salary);
		this.dept = dept;
	}
	
	public void changeDept(String Dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+" Manager [dept="+dept+"]";
		
	}

	

	
	
	
	
}
