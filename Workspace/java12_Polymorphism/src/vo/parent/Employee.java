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

