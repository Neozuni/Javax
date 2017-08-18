package vo.child;

import util.MyDate;
import vo.parent.Employee;

public class Secretary extends Employee {
	private boolean isBoss;

	public Secretary(String ssn, String name, MyDate birthDate, double salary, boolean isBoss) {
		super(ssn, name, birthDate, salary);
		this.isBoss = isBoss;
	}
	
	
}
