package looping.self.test;

public class BreakDiceTest {
	public static void main(String[] args) {
		
		while(true){
			int dice = (int)(Math.random()*6)+1;
			
			if(dice==6) {
				break;
				
			}
			System.out.println(dice);	
			/*
			 * 무작위로 주사의를 돌렸을때, 
			 * 6이라는 숫자를 만나면 반복문을 빠져나오도록 로직을 작성
			 * 이때 무작위로 나오는 숫자들은 다 출력이 되도록...
			 */
		}//while
		//System.out.println("프로그램을 종료합니다!!");
	}
}
















