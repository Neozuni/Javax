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
		
	public Employee(String ssn, String name, MyDate birthDate, double salary) { //명시적 생성 정확한 값으로 ~
		//super(); 부모의 기본 생성자는 무조건 호출
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}//con
	
	/*
	 * 생성자 앞의 this의 용도::
	 * 하나의 클래스에서 다른 생성자를 호출하는데 사용됨.
	 * 
	 */
	
	public Employee (String ssn) {
		this(ssn,"guest",new MyDate(1900,1,1),10000.0);
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

/*
 * this 키워드
 * 1.필드 앞에 사용되는 this 
 * :로컬 변수와 필드의 이름이 같은때 이를 구분하기 위해서 필드 앞에 this를 붙이며
 * 이클래스 자기자신의 의미
 * this.ssn = ssn
 * 
 * 2.생성자 앞의 this
 * -생성자 overloading 에서 필수적이다.
 * -같은 클래스 안에있는 또다른 생성자를 호출할때 사용
		this(ssn,"guest",new MyDate(1900,1,1),10000.0);
 * 3.this 키워드는 반드시 super 아래에서 사용되어야 한다.
 * -부모객체가먼저 메모리에 올라가야자식객체가 그 후에 올라갈 수 있음을 반증한다.
 * 
 */
