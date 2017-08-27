package collection.step2.vo;

public class Customer {
	private int custID;
	private String name;
	private int age;
	public Customer(int custID, String name, int age) {
		super();
		this.custID = custID;
		this.name = name;
		this.age = age;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
