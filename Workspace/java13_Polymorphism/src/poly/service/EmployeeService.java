package poly.service;
/*
 * Employee의 하위클래스들을 Handling 하는 서비스 클래스
 */

import poly.child.Engineer;
import poly.child.Manager;
import poly.parent.Employee;

public class EmployeeService {
	//1. 객체의 정보를 출력하는 기능을 정의
	//Method Overloading 기법을 적용함.
	public Employee getEmployeeInfo(Employee e) {
		return e;
	}
	/*public Employee getEmployeeInfo(Manager m) {
		return m;
	}
	public Employee getEmployeeInfo(Engineer eg) {
		return eg;
	}*/
	
	
	public void getAllEmployeeInfo(Employee[ ] ea) {
		for(Employee e : ea) 
			System.out.println(e);
		
	}//getAllEmployeeInfo
	/*
	 * instanceof ::
	 * 부모 타입으로 생성된 실질적인 자식객체를 구별할때 쓰는 키워드
	 * 문법
	 * if(부모객체변수 instanceof 자식클래스타입){
	 * 
	 */
	public void changeEmployeeInfo(Employee[ ] ea) {
		//Manager는 총무부로 부서를 변경하고
		//Engineer는 기술을 javascript로 변경
		for(Employee e : ea) {
			//e타입으로 생성된 객체가 Manager라면
			if(e instanceof Manager) {
				Manager m=(Manager)e;
				m.changeDept("총무부");
			//e타입으로 생성된 객체가 Engineer라면
			}else if(e instanceof Engineer) {
				Engineer eg = (Engineer)e;
				eg.changeTech("Javascript");
			}
			
		}//for
	}//changeEmployeeInfo
	
	//1. 테스트 클래스에서 넘겨받은 empId의 값과 일치하는
	//Employee객체를 리턴하는 기능
	public Employee findEmployeeById(Employee[ ] ea,String id) {
		Employee emp = null;
		for(Employee e : ea) {
			if(e.getEmpId().equals(id)) 
				emp = e;//자식은 부모에게 안길수 있다			
		}
		return emp;
	}//findEmployeeById
	
	//2. 테스트 클래스에서 넘겨받은 adderss의 값과 일치하는
	//  객체를 리턴하는 기능
	/*public Employee[ ] findEmployeeByAddr(Employee[ ] ea,String addr) {
		Employee[ ] temp = new Employee[ea.length];
		for(int i=0; i<temp.length; i++) {
			if(ea[i].getAddress().equals(addr)) 
				temp[i] = ea[i];			
		}
		return temp;
	}*/
	
	public Employee[ ] findEmployeeByAddr(Employee[ ] ea,String addr) {
		Employee[ ] temp = new Employee[ea.length];
		
		return temp;
	}
	//3. Employee의 연봉을 리턴하는 기능
	public int getAnnualSalary(Employee e) {
		int annualSalary = 0;
		annualSalary = e.getSalary()*12;
		if(e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary = eg.getSalary()*12 + eg.getBonus();
		}
		return annualSalary;
	}
	
	
	//4. 연간 총 인건비의 총액을 리턴하는 기능
	public int getTotalCoast(Employee ea) {
		int totalCost = 0;
		
		
	}
	
	
}















