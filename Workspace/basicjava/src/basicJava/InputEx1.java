package basicJava;
import java.io.*;

public class InputEx1 {
	public static void main(String[] ar)throws IOException{
		//input char
		System.out.print("input char = ");
		int i = System.in.read();
		System.out.println("ASCII Value="+i);
		
		//input char
		System.out.print("input char 2 = ");
		int j = (char)System.in.read();
		System.out.println("ASCII Value="+j);
		
}
}
