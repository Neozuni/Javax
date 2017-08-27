package test;

import java.util.Scanner;

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
		this.day = day;
	}
	
}//class mydate

public class MyDateTest{
	public static void main(String[] args) {
		MyDate today = new MyDate();
		
		Scanner sc = new Scanner(Sysyem.in);
		System.out.println("오늘 날짜를 입력하세요 ");
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		today.setMonth(month);
		today.setDay(day);
		
		System.out.println("오늘은 " +today.getMonth()+ "월 " +today.getDay()+"일 입니다.");
		
	}//main

}//class
