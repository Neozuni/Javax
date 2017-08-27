package poly.test;

import poly.child.Engineer;
import poly.child.Manager;
import poly.parent.Employee;
import poly.service.EmployeeService;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. 객체생성...m = 
		//Employee e = new Employee("e123", "아이유", "방배동", 450);
		Manager m = new Manager("m777", "이상순", "제주", 500, "관리부");
		Engineer eg1 = new Engineer("eg112", "효리1", "신사동", 400, "Jquery", 230);
		Engineer eg2 = new Engineer("eg999", "효리2", "제주", 500, "Driver", 50);
		
		//2. Service Class 객체 생성
		EmployeeService service = new EmployeeService();
		
		//3. 객체들의 모든 정보를 출력하는 기능..
		System.out.println("=======1. Print Informarion ::getEmployeeInfo() ========= ");
		Employee emp=service.getEmployeeInfo(e);
		System.out.println(emp);
		System.out.println(service.getEmployeeInfo(m));
		System.out.println(service.getEmployeeInfo(eg1));
		System.out.println("***************************************");
		System.out.println("=======2. Print All Informarion ::getAllEmployeeInfo() ========= ");
		Employee[ ] arr = {e, m, eg1, eg2};
		service.getAllEmployeeInfo(arr);
		System.out.println("***************************************");
		System.out.println("=======3. Print Change Informarion ::changeEmployeeInfo() ========= ");
		service.changeEmployeeInfo(arr);
		
		System.out.println("***************************************");
		service.getAllEmployeeInfo(arr);
		System.out.println("\n=======3. Find Employee By Id ::findEmployeeById() ========= ");
		Employee returnEmp=service.findEmployeeById(arr, "eg999");
		System.out.println(returnEmp);
		System.out.println("***************************************");
		
		Employee[ ] returnEmp1=service.findEmployeeByAddr(arr, "제주");
		for(Employee e1 : returnEmp1) {
			if(e1==null) continue;
			System.out.println(e1);
		}
	}
}












