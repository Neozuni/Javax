package looping.test;

import java.util.Scanner;

public class DoWhileQBreakTest4 {

	public static void main(String[] args) {
		System.out.println("메세지를 콘솔창으로 입력하세요 ...");
		System.out.println("만약에 종료를 원하면 q 를 누르세요");//루핑문 빠지겠다
		
		Scanner sc = new Scanner(System.in);
		String inputString="";
		do {
			System.out.println(">");
			inputString=sc.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));//string 일때 이퀄 사용 
			System.out.println("");
			System.out.println("종료합니다. ..");
				

	}

}
