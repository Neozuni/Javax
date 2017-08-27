package step2.test;
/*
 * 4.5
 * 변수는 선언된 위치로 다르게 정의 된다.
 * field, static v 는 클래스 바로밑, 메소드 바깥에서 선언됨(기본값이 있다 .. ) 초기화 안하고 바로 사용해도됨
 * 
 * local v 는 메소드 안에서 선언 
 * (기본값이 없다. 초기화 안하고 사용하면 컴파일시 에러)
 * 
 */
public class StaticExamTest {
	int i = 10 ; // field, member variable
	static int j =20; // class V, static V, 전역변수 
	
	public void test() {
		System.out.println("member V : " +i);
		System.out.println("static  V : " +j);
	}
	/*
	 * 메모리 올라가 있지 않은 i를 사용할 수없다  
	 * j 는 이미 메모리에 올라가 있으니깐 사용할 수 있다.
	 * static 은 static 끼리 통한다 
	 * 즉 메모리에 올라가있는 애들끼리 서로 사용할 수 있다 .
	 */
	
	public static void test2() {
		//System.out.println("member V : " +i);
		System.out.println("static  V : " +j);
		StaticExamTest exam = new StaticExamTest();
		System.out.println("member V : " +exam.i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0; // local v, 지역 v , Temporary v, automatically v
		test2();
		/*StaticExamTest test = new StaticExamTest();
		test.test();*/
		
		this.i = 10;

	}

}
