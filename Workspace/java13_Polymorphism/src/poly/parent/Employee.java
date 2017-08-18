package poly.parent;
//super class
// vo class를 작성할때 " 작성해주세요"

public class Employee {
	private String empID;
	private String name;
	private String address;
	private int salary;
	public Employee(String empID, String name, String address, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
	}
	
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public String getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
