package ex04control;
import java.util.*;


public class Ifex1 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		
		int a = 80;
		String grade = "";
		
		if( a>=90) {
			grade = "A Grade ";
			
		} else if( a>=80){
			grade = "B Grade ";
			
		} else if( a>=70){
			grade = "C Grade ";
			
		} else if( a>=60){
			grade = "D Grade ";
			
		} else {
			grade = "F Grade";
			}
		
		System.out.println("Your grade is ? " + grade);
					
		}//if
	}//main

