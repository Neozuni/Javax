package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		System.out.println("숫자를 하나 입력하세요 . >");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신 수자는 0입니다");
			
		}//if
		
		if(input!=0) 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.",input);
		
	}

}
