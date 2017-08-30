package object.step4;
/*
 * ======= Serializable =======
 * person 클래스의 객체를 스트림을 통해서 목적지로 전달 하려고 할때
 * 전달되는 정체는 객체의 필드값이 된다.
 * 클래스의 메소드는 직렬화의 대상에서 제외된다 .
 * ::
 * person 클래스의 값이 스트림을 통과하려면
 * 해당클래스는 Serializable 이라는 인터페이스를 구현 받음으로서 
 * 직렬화가 가능해진다 .
 * ::
 * Person의 클래스의 값이 직렬화된다는 것은
 * 필드값이 바이트로 변환되어서 출력되는 것을 의미한다.
 * ::
 * transient
 * 스트림을 통과하는 필드의 값중에서 보안상 전달되면 안되는 값이 포함되어 있을수 있다.
 * password가 해당되는 값인데 ,,, 값을 안보낼려는 의도인데 
 * password자체가 전달 안되는 것이 아니라 기본값으로  
 */
import java.io.Serializable;

public class Person implements Serializable{ // 직렬화 
	private String name;
	private int age;
	private transient String password;
	private String address;
	public Person(String name, int age, String password, String address) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}

	
	
	
}
