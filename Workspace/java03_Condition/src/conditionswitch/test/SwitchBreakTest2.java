package conditionswitch.test;

public class SwitchBreakTest2 {

	public static void main(String[] args) {
		// time :: 8~11
		int dice = (int)(Math.random()*6)+1;	
		int time = (int)(Math.random()*4)+8;	
		System.out.println("[현재시각 :: " + time + "시!!]");
		System.out.println("[주사위를 굴립니다." + dice);
		
		switch(time){
			case 8:
				System.out.println("출근합니다...");
			case 9:
				System.out.println("잡니다....");
			case 10:
				System.out.println("간식 먹습다...");
			case 11:
				System.out.println("퇴근 합니다...");
		}

	}

}
