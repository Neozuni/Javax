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
		super(ssn,name,birthDate,salary);
		this.dept = dept;
	}
	
	
	/*
	Method overriding
	1 step 부모가물려진 것을 그대로 물려 받았다
	2 step 받은걸 고쳤 다 
	*/ 
	 
	@Override
	public String getDetails() {
		return super.getDetails() + "\t" +dept; 
	}
	
}
