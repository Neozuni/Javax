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
	 * Method Overloading
	 * ::
	 * 1. 하나의 클래스에서만 발생하는 성질
	 * 2. 메소드 이름은 반드시 같아야 한다.
	 * 3. 메소드 인자값은 반드시 달라야 한다.
	 * 4. 메소드 리턴타입은 상관없다!!
	 */
	@Override
	public String getDetails() {
		return super.getDetails()+"\t"+dept;
	}
	
	/*public void getDetails(String dept) {
		System.out.println("당신의 부서는 "+dept+" 입니다.");
	}
	public void getDetails(double salary) {
		System.out.println("당신의 급여는 "+salary+" 입니다.");
	}*/
	
	//1. Method Overloading 기법을 적용하지 않은 예
	/*public String getBaseDepartment(String dept) {
		return dept;
	}
	
	public void printDefaultSalary(double salary) {
		System.out.println("당신의 급여는 "+salary+" 입니다.");
	}
	public void printDefaultName(String name) {
		System.out.println("당신의 이름은 "+name+" 입니다.");
	}*/
	
//	//2. Method Overloading 기법을 적용한 예
//	public String getDefaultInfo(String dept) {
//		return dept;
//	}
//	public double getDefaultInfo1(double salary) {
//		return Employee.DEFAULT_SALARY;
//	}
//	public void getDefaultInfo(String name,String dept) {
//		System.out.println("당신의 이름은 "+Employee.DEFAULT_NAME+"부서: "+dept);
//	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}
}





















