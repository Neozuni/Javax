package cjava05_Looping;

public class BasicLoopingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===For Looping ===");
		for(int i=0; i<10; i++) {
			System.out.println(i+"neo");
		}
		
		System.out.println("=== while looping ===");
		int i=10;
		while(i>0) {
			System.out.println(i+"hello");
			i--;
		}//wh
		
		System.out.println("=== fo~while looping ===");
		int j=0;
		do {
			System.out.println(j+"alwawys pring ...");
			j++;
		}while(j<10);
		
		
	}//main

}
