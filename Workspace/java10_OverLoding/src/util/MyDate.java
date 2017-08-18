package util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	@Override //메소드를 재정의 하는 오버라이드 기법
	public String toString() {
		return year+ "-" +month+ "-" +day;
	}
	
}
