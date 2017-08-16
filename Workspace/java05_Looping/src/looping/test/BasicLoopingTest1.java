package looping.test;

public class BasicLoopingTest1 {

	public static void main(String[] args) {
		//for
		System.out.println("=== for loopping===");
		for(int i=0; i<10; i++) {
			System.out.println(i+"neo");
		}
		
				//while
		System.out.println("=== while looping===");
		int i=10;
		while(i>0) {
		System.out.println(i+"hello");
				i--;
			}
		//do~while: 반드시 한번은 실행된다
		System.out.println("=== do~while looping===");
		int j=0;
		do {
			System.out.println(j+"Always Print...");
			j++;
				
		}while(j<10);
							
			}
}