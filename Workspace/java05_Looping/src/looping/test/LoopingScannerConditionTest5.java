package looping.test;

import java.util.Scanner;

public class LoopingScannerConditionTest5 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			
			int menuNo=sc.nextInt();
			switch(menuNo) {
			case 1:
				System.out.println("예금액");
				balance +=sc.nextInt();
				break;
			case 2:
				System.out.println("출금액");
				balance -=sc.nextInt();
				break;
			case 3:
				System.out.println("잔액");
				System.out.println(balance+" 원");
				break;
			case 4:
				run = false;
				break;
				}//switch
				System.out.println("감사합니다");
		}//while
		

	}//main

}//class
