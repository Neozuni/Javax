package basicJava;
import java.io.*;

public class InputEx2 {

	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("Number1 = ");
		num1 = System.in.read() - 48;
		System.in.read();System.in.read();
		
		System.out.print("Number2 = ");
		num2 = System.in.read() - '0';
		System.out.println("Number " + (num1 > num2 ? num1 : num2) +" more larage..");
		
	}//main
}//class


