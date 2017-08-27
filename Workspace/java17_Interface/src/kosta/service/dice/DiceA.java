package kosta.service.dice;

import java.util.Random;

public class DiceA {
	private int value;

	public DiceA() {
		System.out.println("::"+getClass().getName()+"( )생성자 호출..");
	}
	//getter() | setter()
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void selectedNumber() {
		value = new Random().nextInt(6)+1; //1~6사이의 정수가
	}
}//class









