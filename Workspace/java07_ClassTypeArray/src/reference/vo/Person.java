package reference.vo;
/*
 * ::
 * vo = value object 
 * 디비 테이블의 하나의 row 를 instance 화 시킨 클래스
 * 디비 테이블의 컬럼은 vo클래스 에서의 field 로 매핑 된다.
 * 
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display(){
		System.out.println("Name : " + name + "\nAge : " + age);
	}
	

}
