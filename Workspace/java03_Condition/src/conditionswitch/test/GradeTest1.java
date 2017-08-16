package conditionswitch.test;

public class GradeTest1 { 

	public static void main(String[] args) {
		int grade = 89;
		switch(grade) { //스위치문을 사용하는 이유는 예 안드로이드 홈에서 어플을 실행시 즉 선택이 가능한메뉴 
			case 95:
			case 90;
			case 85;
				System.out.println("A Grade");
				break;
			
			case 80;
			case 75;
				System.out.println("B Grade");
				break;
			
			case 60;
			
				System.out.println("C Grade");
				break;
			default:
				System.out.println("Nuts");
		}//switch
		

	}

}
