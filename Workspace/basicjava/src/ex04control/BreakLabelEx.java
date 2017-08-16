package ex04control;

public class BreakLabelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One: for(int i=0; i<10; i++) {
			Two: for(int j=0; j<3; j++) {
				if(j==10) break One;
				System.out.println(j+"x"+i+"");
				
			}// 2for
				System.out.println();
		}//1for

	}

}
