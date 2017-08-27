package looping.test;

public class DoubleForTest3 {
	public static void main(String[] args) {
		for(int i=1; i<=2; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j+"\t");
			}
			System.out.println(i+"  ");
		}
	}
}
