package step1.test;
/*
 * 1.2 ::
 * static 한 맴버는 객체생성 과정없이 바로 사용 가능하다 
 *  ::
 *  아래의 맴버 선언 방법은 잘못된 케이스 이다.
 *  static 으로 멤버들을 선언하면 메모리 영역에서 heap가 아닌 class area에 잡히기 때문에
 *  gc의 대상이 아니다 . 그러므로 메모리 효율성이 현저히 떨어지는 원인이 되며 성능에 치명적인 문제점을 가져온다 
 *  반드시 static 으로 지정해야 하는 것들은 다양한 객체들이 서로 공유해서 써야하는 것 
 *  대표적으로 상수값 , math클래스에서 보여지는 연산과 관련된 작업들 , counter 기능 
 */

class Member{
	static String name = "고길똥";
	static int age = 50;
	public static void member() {
		System.out.println("우 / 유 / 빛 / 깔 "+name);
	}
}

public class StaticExamTest {

	public static void main(String[] args) {
		System.out.println(Member.name+" 씨의 나이는 "+Member.age+" 세 입니다.");
		
////m 이라는 이름으로 member 객체를 생성한 후 m으로 맴버에 접근
//		Member m = new Member();
//		System.out.println(m.name+" 씨의 나이는 "+m.age+" 세 입니다.");
	}

}
