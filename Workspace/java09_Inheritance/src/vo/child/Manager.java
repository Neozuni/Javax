package vo.child;
import util.MyDate;
/*
 * Sub Class
 * ::
 * Engineer - String tech
 * Secretary - isBoss boolean
 */
import vo.parent.Employee;
/*
 * super::
 * 상위클래스를 지칭하는 키워드
 * super();
 * super.name;
 * super.getDetails();
 */
public class Manager extends Employee{
	private String dept;
	//생성자 추가..
	public Manager(String ssn, String name, MyDate birthDate, double salary,
			String dept){
		/*this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;*/
		super(ssn,name,birthDate,salary);
		//super();//부모의 기본 생성자
		this.dept = dept;
		
	}
	/*	
	 * Method Overriding
	 * ::
	 * 1step 부모가 물려진 것을 그대로 발려받았다.
	 * 2step 받은걸 고쳤다
	 */
	@Override
	public String getDetails() {
		return super.getDetails()+"\t"+dept;
	}
}

