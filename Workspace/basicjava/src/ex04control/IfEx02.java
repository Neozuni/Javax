package ex04control;
import java.io.*;

public class IfEx02 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		char a = 0;
		char b = 0;
		char c = 0;
		int d = 0;
		
		System.out.println("Password ? ");
		a = (char)System.in.read();
		b = (char)System.in.read();
		c = (char)System.in.read();
		
		System.in.read();System.in.read();
		System.out.println("Pls input the keyword 1~3 >> ");
		d = System.in.read() - '0';
		System.in.read();System.in.read();
		
		if(d==1) {
			a +=1;
			b +=1;
			c +=1;
			
		}
		else if (d==2) {
			a +=2;
			b +=2;
			c +=2;
			
		}
		else if (d==3) {
			a +=3;
			b +=3;
			c +=3;
			
		}
		else {
			System.out.println("Error of keyword!! ");
			System.exit(0);
		}
		System.out.println("Changed password is "+a+b+c);
		System.out.println();
		System.out.print("Pls input in de-password >> ");
		
		d = System.in.read() - 48;
		
		if(d !=1 && d !=2 && d !=3) {
			System.out.println("overflow on de-password");
			System.exit(0);
		}//if
		
		a -= d;
		b -= d;
		c -= d;
		System.out.println("Sening password is ..." +a+b+c);
					
		
		}//main
	}//class


