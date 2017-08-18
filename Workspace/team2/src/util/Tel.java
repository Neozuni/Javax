
package util;

public class Tel {
	private String no1;
	private int no2;
	private int no3;
	
	public Tel(String no1, int no2, int no3) {
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
	}
	
	
	@Override //메소드를 재정의 하는 오버라이드 기법
	public String toString() {
		return no1+ "-" +no2+ "-" +no3;
	}
	
}
