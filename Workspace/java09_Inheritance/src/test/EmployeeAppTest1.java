package test;
import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

public class EmployeeAppTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Employee클래스를 생성.. e 인자값 4
		Employee e = new Employee("111-111", "아이", new MyDate(1880,1,3), 45000.0);
		// 2.Manager 클래스를 생성 .. m 
		Manager m = new Manager("222-222", "어른", new MyDate(1980,1,3), 55000.0,"관리인");
		// 3.e의정보를 출력 ...getDetail() 
		System.out.println(e.getDetails());
		// 4.m의 정보를 출력 ...getDetail() 
		// 문제점이 2가지 발생 ... 해결
		System.out.println(m.getDetails());
		

	}//main

}//class
