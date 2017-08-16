package capsulation.test;

import java.util.Scanner;

/*
 * Encapsulation pattern
 * ::
 * 1. filed앞 --> private
 *    (같은 클래스 내에서만 접근을 허용하는 Access Modifier)
 * 2. setXxx() | getXxx() --> public
 *    (어디서든지 접근을 허용하는 Access Modifier )
 * 3. setXxx() { 첫라인에서 즉, 필드에 값이 할당되기 직전에
 *    제어문을 사용해서 타당한 값만 필드에 할당
 */
class MyDate{
	private int month;
	private int day;
	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		/*
		 * 1,3,5,7,8,10,12월 일땐 1~31
		 * 4,6,9,11 : 1~30
		 * 2 : 1~28
		 * ::
		 * switch
		 */
		this.day = day;
	}	
}
public class MyDateTest {
	public static void main(String[] args) {
		//1. MyDate 객체를 생성...today라는 이름으로
		MyDate today = new MyDate();
		
		//2. Scanner를 이용해서 month, day값을 받아온다
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘의 날짜를 입력 하세요...\n");
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		//3. 호출...
		today.setMonth(month);//calling
		today.setDay(day);
		
		//4. 받아온 날짜를 최종적으로 출력
		System.out.println("오늘은 "+today.getMonth()+"월 "+today.getDay()+"일 입니다..");

	}
}















