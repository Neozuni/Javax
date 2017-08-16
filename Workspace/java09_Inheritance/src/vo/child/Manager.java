package vo.child;
/*
 * Sub calss
 * ::
 * engineer - string tech
 * secretary - is boss boolean
 */
import vo.parent.Employee;

public class Manager extends Employee {
	private String dept;
	//생성자추가 
	public Manager(String ssn, String name, MyDate birthDate,double salary, String dept) {
//		this.ssn = ssn;
//		this.name = name;
//		this.birthDate = birthDate;
//		this.salary = salary;
		this.dept = dept;
				
	}
	
}
