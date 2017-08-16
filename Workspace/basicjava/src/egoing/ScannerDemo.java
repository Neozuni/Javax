package egoing;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()){ 
			System.out.println(sc.nextInt()*2);
		}
		sc.close();
	}//main

}//class
