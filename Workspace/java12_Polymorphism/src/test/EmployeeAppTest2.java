package test;

import util.MyDate;
import vo.child.Engineer;
import vo.child.Manager;
import vo.child.Secretary;
import vo.parent.Employee;

public class EmployeeAppTest2 {
	public static void main(String[] args) {
		//1. Employee 클래스를 생성...e...인자값 4
		Employee e = new Employee("111-111", "아이유", new MyDate(1980,1,3), 45000.0);
		Employee e1 = new Employee("777-777");
		
		//2. Manager 클래스를 생성...m...인자값 5
/*		Manager m = new Manager("222-222", "이상순", new MyDate(1979,12,3), 55000.0,"관리인");
		
		System.out.println(e.getDetails());
		System.out.println(e1.getDetails());
		System.out.println(m.getDetails());*/
		
//		m.getDetails("기획부");
//		m.getDetails(Employee.DEFAULT_SALARY);
		
		Employee man = new Manager("111-111", "아이유", new MyDate(1980,12,3), 45000.0,"관리인");
		Employee eng = new Engineer("222-222", "이상순", new MyDate(1979,12,3), 55000.0,"관리인");
		Employee sec = new Secretary("222-222", "이상순", new MyDate(1979,12,3), 55000.0,"관리인");
		
		System.out.println(man.getDetails());
		System.out.println(eng.getDetails());
		System.out.println(sec.getDetails());
		
	}
}












