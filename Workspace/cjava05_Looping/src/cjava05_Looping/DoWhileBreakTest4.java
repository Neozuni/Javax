package cjava05_Looping;

import java.util.Scanner;

public class DoWhileBreakTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input to msg");
		System.out.println("If y want to exit press to q ");
		
		Scanner sc = new Scanner(System.in);
		String i;
		
		do {
			System.out.println(">>>");
			i = sc.nextLine();
			System.out.println(i);
			
		}while(!i.equals("q"));
		System.out.println("");
		System.out.println("Exit");
		
	}

}
