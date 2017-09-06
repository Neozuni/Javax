package ch4;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {
		int menu = 0, num =0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) sqare root");
				System.out.println("(3) log");
				System.out.println(" pls choice the menu");
				
				String tmp = sc.nextLine(); // 화면에서 입력받은 내용을 tmp 에 저장
				menu = Integer.parseInt(tmp); // 입력받은 문자열 tmp 을 숫자로 변환
				
				if(menu==0) {
					System.out.println("exit program");
					break;
				}else if (!(1 <=menu && menu <=3)) {
					System.out.println("wrong choice the menu(exit. 0");
					continue;
					
				} //if
				
				for(;;) {
					System.out.println("계산할 값을 입력 하세요 . (계산종료:0 전체종료:99");
					tmp = sc.nextLine();
					num= Integer.parseInt(tmp);
					
					if(num==0)
						break;
					
					if(num==99)
						break outer;
					
					switch (menu) {
					case 1:
						System.out.println("result=" +num*num);
						break;
					case 2:
						System.out.println("result=" +Math.sqrt(num));
						break;
					case 3:
						System.out.println("result ="+Math.log(num));
						break;
					
					}
				}
				
				
			}
	}

}
