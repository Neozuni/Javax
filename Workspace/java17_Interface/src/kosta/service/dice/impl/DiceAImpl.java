package kosta.service.dice.impl;

import java.util.Random;

import kosta.service.dice.Dice;

public class DiceAImpl implements Dice{
	private int value;	
	
	public DiceAImpl() {
		System.out.println("::"+getClass().getName()+"( ) 생성자 calling..");
	}
	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6)+1; //1~6사이의 정수가		
	}
	@Override
	public int getValue() {
		return value;
	}

}
