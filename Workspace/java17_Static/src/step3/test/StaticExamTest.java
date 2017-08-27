package step3.test;

public class StaticExamTest {

	static int i ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("main method static block ..." +i);
		System.out.println("main method static block ..." +StaticExamTest.i);
	}//main
	
	//static block 
	static { 
		++i;
		System.out.println("static initailization block ... "+i);
	}

}
