package ex04control;

public class WhileEx2 {

	public static void main(String[] args) { //달력모양으로 숫자 출력하기
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=31) {
			if(i%7 == 0) {
			System.out.println(i);
		}else {
			System.out.print(i+"\t");
		}
		i++;
		}
		System.out.println()	;
					
	}//main
}//class


