package ex04control;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*구구단*");
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(j+"*"+i+"="+ j*i +" ");
			}
			System.out.println();
		}

	}

}
