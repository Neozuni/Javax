package condition.test;

import java.util.Scanner;

/*
 * step2 의 문제점 
 * :: 값을 입력받는 방법이 불편함 콘솔창으로 입력 받는것이 효율적이다 
 * 
 * step2 의 해결책
 * :: scanner 객체를 이용한
 * 
 */
public class IfGradeTest3 {

	public static void main(String[] args) { //jvm 이 가장 먼저 찾는 메소드 메인 String[] = 배열 스트링이 여러개일때 꺽쇠
		// args 실행시점에값을 받을수 있다 
		// args 는 스트링이기 때문에 string 값을 int 로 변환하는 기능을 이용해야한다 api
		// int 클래스에서 찾아라 interger.pareseInt 
		// 실행 방법을 변경해서 입력후 결과를 보는 방법 아래 ..
		
		Scanner sc = new Scanner(System.in);// 스캐너객체를 생성해서 in 을 쓰면 인풋스트림이 리턴되서 사용가능하다 
		System.out.println("당신의 이름과 점수를 입력해 ...\n"); // 두개를 동시에 입력 받는다 
		
		String name=sc.nextLine(); //이름을 읽어들이는 구문 = nextline
		int grade=sc.nextInt();// 점수를 읽어들이는 구문 = nextInt
				
		//int grade = Integer.parseInt(args[0]); 
		
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

