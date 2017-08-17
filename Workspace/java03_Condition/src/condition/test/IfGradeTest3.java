package condition.test;

import java.util.Scanner;

/*
 * step3
 * ::
 * 키보드로 입력받은 데이타를 콘솔로 출력할 수 있도록 한다.
 */
public class IfGradeTest3 {
	public static void main(String[] args) {
		//String값을 int로 변환하는 기능을 이용해야 한다.
		//Integer 클래스 에서 찾아봅시다.
		
		//int grade = Integer.parseInt(args[0]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름과 점수를 입력하세요....\n");
		
		String name = sc.nextLine();
		int grade=sc.nextInt();
		
		System.out.println(name+" :: ");
		if(grade>=90 && grade<=100) 
			System.out.println("A Grade....");
		else if(grade>= 80 && grade<90) 
			System.out.println("B Grade....");
		else if(grade>=70 && grade <80) 
			System.out.println("C Grade....");
		else 
			System.out.println("Try Again!!");		
	}
}





