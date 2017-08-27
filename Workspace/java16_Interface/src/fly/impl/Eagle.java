package fly.impl;

public class Eagle extends Bird{
	public void eat() {
		System.out.println("부리로 쪼아서 먹는다 .");
	}

	@Override
	public void fly() {
		super.fly();
	}
	
}
