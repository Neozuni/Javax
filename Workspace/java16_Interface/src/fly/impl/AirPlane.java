package fly.impl;

import fly.Flyer;

//sub class... 반드시 오버라딩의 책임이 있다.
public class AirPlane implements Flyer{
		
	@Override
	public String fly() {
		return "SuperMa이 난다.";
	}
	@Override
	public void take_off() {
		System.out.println("SuperMa이 이륙한다.");		
	}
	@Override
	public void land() {
		System.out.println("SuperMa이 착륙한다.");	
	}
	//SuperMa만의 기능...
	public String stopBullet() {
		return "망또로 총알을 막다";
	}
}
