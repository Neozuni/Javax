package test;

import util.MyDate;
import vo.child.Manager;
import vo.parent.Employee;

public class EmployeeAppTest1 {
	public static void main(String[] args) {
		//polimophism 방식으로 객체를 생성
		//부모타입으로 자식 객체를 생성
		
		Employee e1 = 
				new Manager("111-111", "james", new MyDate(1999,8,8), 45000.0, "IT");
		
		/*
		 * Virtual Method Invocation  원리가 적용됨 (자식의 메소드가 결과적으로 실행되었다 ) 
		 * :: 
		 * compile time type - 부모 메소드가 호출됨 .
		 * runtime type - 자식의 메소드가 호출된 .
		 * ::
		 * 상속관계의 있는 클래스에서 부모타입으로 자식객체를 생성시에 오버라이딩 되어있는
		 * 메소드에서 발생한다 .
		 *  
		 * 
		 */
		
		System.out.println(e1.getDetails()); // 부모 manager 의 getdetail() 메소드 호출 ... 
		
		// e1.dept="교육부"; // 왜에러가 날까 ? 
		// object casting 을 사용한다.
		/* dept가 employee에 없는 필디이기 때문 ...
		 * 메모리에 올라가 있지 않은것은 아니다 .
		 * Manager.로 불러서 찾아야 한다.
		 * ::
		 * object casting 
		 * 
		 */
		
		Manager m = (Manager)e1;
		m.changeDept("기획부");
		System.out.println(e1.getDetails());
		
	}
	
}

/* 폴리 몰피즘 적인 식으로 객체를 생성시에
 * ::
 * 1) virtual method invocation
 * 2) object casting 
 */










