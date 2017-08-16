package ex04control;
import java.io.*;

public class ForEx1 {//원하는 단 입력 받아서 출력 하기

	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		int dan = 0;
		System.out.println("99단 ");
		System.out.println("단수 = ");
		dan = System.in.read()-48;
		for(int i=0; i<=9; i++) {
			System.out.println(dan + "*" + i +"=" + (dan*i<10 ?"":"")+(dan*i));
		}
		
		

	}

}
