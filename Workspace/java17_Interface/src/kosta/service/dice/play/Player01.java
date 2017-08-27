package kosta.service.dice.play;

import kosta.service.dice.DiceA;
/*
 * Player01 은 하나의 주사위만 가지고 놀 수 잇는 코드로 작성
 * diceb&c 를 추가하게 되면
 * 그에 맞물려서 setter / gatter 가 동시에 증가함으로
 * 재사용성을 떨어뜨리는 요인이 된다 . (유지보수성이 낮다 )
 * 
 * 해결책 ::
 * 
 */
public class Player01 {
	private DiceA diceA = new DiceA();
	private int totalValue;
	public Player01() {
		System.out.println("::"+getClass().getName()+"( )생성자 호출...");
	}
	
	//getter() | setter()  도 필드갯수에 따라 지속 추가해야함 
	public DiceA getDiceA() {
		return diceA;
	}
	public void setDiceA(DiceA diceA) {
		this.diceA = diceA;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	//count 만큼 주사위를 굴려서 나오는 랜덤한 숫자를 합하는 기능.
	public void playDice(int count) {
		System.out.println("::"+getClass().getName()+".playDice() is calling....");
		
		for(int i=0; i<count; i++) {
			diceA.selectedNumber();//
			System.out.println("::["+diceA.getClass().getName()+" ]의 선택된 수 :: "+diceA.getValue());
			totalValue += diceA.getValue();
		}//for
		System.out.println("::"+getClass().getName()+".playDice() was called...");
	}
	
	
	
}//class










