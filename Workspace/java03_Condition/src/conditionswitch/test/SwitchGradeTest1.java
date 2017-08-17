package conditionswitch.test;

public class SwitchGradeTest1 {
	public static void main(String[] args) {
		int grade = 89;
		//byte, short, int, char, String 데이타 타입 가능
		//실수형은 불가능하다.
		switch(grade) {
			case 95:
			case 90:
			case 85:
				System.out.println("A Grade....");
				break;
			case 80:
			case 75:
				System.out.println("B Grade....");
				break;
			case 60:
				System.out.println("C Grade....");
				break;
			default:
				System.out.println("Nuts");
		}//switch
	}//main
}//class








