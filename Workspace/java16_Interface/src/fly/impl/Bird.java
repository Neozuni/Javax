package fly.impl;

import fly.Flyer;

//sub class... 반드시 오버라딩의 책임이 있다.
public final class Bird implements Flyer{
	private String kind;
	
	@Override
	public String fly() {
		return  "새가 난다.";
	}
	@Override
	public void take_off() {
		System.out.println("새가 이륙한다.");		
	}
	@Override
	public void land() {
		System.out.println("새가 착륙한다.");	
	}
	//Bird만의 기능...
	/*
	 * final :: 내가 마지막이야 !! 
	 * 메소드 앞 - " 내가 마지막 메소드야 " : 오버라이딩 금지 ~
	 * 변수앞 - "내가 마지막 변수야 " : 상수를 의미 
	 * 클래스 앞 - "내가 마지막 클래스야 " : 상속 금지 
	 */
	public final String layEggs(String kind) {
		this.kind = kind;
		return kind+ " 알을 까다";
	}
}

