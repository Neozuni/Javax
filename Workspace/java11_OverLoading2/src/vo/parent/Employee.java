package vo.parent;
/*
 * 생성자 오버로딩 
 * :: 
 * overloading 의 룰 
 * ::
 * 1.하나의 클래스에서만 적용됨
 * 2.생성자 이름은 같다
 * 3.인자값이 달라야 한다. (순서, 갯수, 타입 중 하나라도 달라야 한다)
 * 즉 하는 일은 같지만 처리하는 데이터를 달리할떄 !! 쓰이는 기법 .
 * 아래 Employee 참조 
 *  
 */
import util.MyDate;
/* 
 * 문제점 ::
 * this() 를 사용해서 또다른 생성자를 호출했다.
 * 이때 인자값으로 개발자가 직접 기본값을 입력했다.
 * 
 * 해결책 :
 * 상수값을 사용한다.
 * 상수값: 변하지 않는 값 
 * 만약에 변경을 하면 컴파일시 에러를 발생
 * 1) 상수값을 지정할 때는 final이라는 키워드를 타입 앞에 붙여준다.
 * 2) final은 "내가 마지막 변수야"
 * ex) int default_salary = 10000.0
 * 3)주로 상수값은 메모리에 미리 올려놓고 사용하는 대표적인 변수 .
 * ex) static final int default_salary = 10000.0;
 * 
 * 4)상수값의 이름은 반드시 모두다 대문자로 지정해야 한다.
 * ex) static final int DEFAULT_SALARY = 10000.0;
 * 
 */

public class Employee {
	private String ssn;
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public static final String DEFAULT_NAME = "guest";
	public static final double DEFAULT_SALARY = 5000.0;
	
	
		
	public Employee(String ssn, String name, MyDate birthDate, double salary) { //명시적 생성 정확한 값으로 ~
		//super(); 부모의 기본 생성자는 무조건 호출
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}//con
	

	
	public Employee (String ssn) {
		this(ssn,DEFAULT_NAME,new MyDate(1900,1,1),DEFAULT_SALARY);
	}
	
	
	public Employee(String ssn, String name) { //명시적 생성 정확한 값으로 ~
		//super(); 부모의 기본 생성자는 무조건 호출
		this.ssn = ssn;
		this.name = name;
	}
	
	public Employee (String ssn, String name,double salary) {
		this(ssn,name,new MyDate(1900,1,1),10000.0);
	}
	 
	
	public String getDetails() {
		return ssn +"\t"+birthDate+ "\t" +salary;
	}
	
	
}//class

