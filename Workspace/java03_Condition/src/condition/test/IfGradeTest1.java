package condition.test;

/*
 * step1 코드의 문제점
 * grade 에 대한 값이 소스코드에 하드코딩 되어있다 즉 프로그램 기능이 아니다 
 * 
 * step1 코드의 해결책
 * 컴파일 시점에 값을 입력 받으면 고정된 값만을 사용할수 밖에 없다 .
 * 실행 시점에 그대그때 마다 변하는 값을 입력 받을수 있어야 한다 ... 변수를 통해서 
 * 그리고 입력된 값이 로컬변수에 할당되도록 해야한다.
 * 
 */

public class IfGradeTest1 {

	public static void main(String[] args) {
		
		int grade = 89; // 로컬변수 (메소드 블락 안에서 선언 )  
		
		if(grade>=90 && grade>=100) 
			System.out.println("A Grade ..");
			
		else if(grade>=80 && grade <90) 
				System.out.println("B Grade ..");
			
		else if(grade>=70 && grade <80) 
				System.out.println("C Grade ...");
		else 
				System.out.println("Pool ...");
						

}
}

