package jason_StackExample;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		String value = "";
		// ------------------------------------- while ------------------------------------- //
		while(true) {
			System.out.println("==============================");
			System.out.println("-1. push()");
			System.out.println("-2. pop()");
			System.out.println("-3. peek()");
			System.out.println("-4. Display Stack contents");
			System.out.println("-Q. Exit Programme..");
			System.out.println("==============================");
			
			System.out.print("\nSelect Menu : ");
			input = sc.nextLine();
			
			if(input.equalsIgnoreCase("Q")) break;
			
			else {
				switch (Integer.parseInt(input)) {
					// ----------------------------- push() -------------------------------- //
					case 1:{
						System.out.print("\nEnter Value : ");
						// push()
                        
						System.out.println("\n-Value [" + value + "] is pushed !");
						break;
					}
					// ----------------------------- pop() -------------------------------- //
					case 2:{
						// pop()
						
						break;
					}
					// ----------------------------- peek() -------------------------------- //
					case 3:{
						// peek()
						
						break;
					}
					// ----------------------------- display() ----------------------------- //
					case 4:{
						// while + pop --> ?
                        
						break;
					}

				} // switch
			} // else
		} // while
	} // main

}
