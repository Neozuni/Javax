package ex04control;
import java.io.*;

public class SwitchEx {

	public static void main(String[] ar)throws IOException{
		int kor;
		int eng;
		int mat;
		float avg;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("korea = ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("eng = ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("math = ");
		mat = Integer.parseInt(br.readLine());
		
		avg = (kor+eng+mat)/3.f;
		
		switch((int)(avg/10)) {
			case 10:
			case 9:
				System.out.println("u r grade is AAAA");break;					
			case 8:
				System.out.println("u r grade is BBBB");break;
			case 7:
				System.out.println("u r grade is CCCC");break;
			case 6:
				System.out.println("u r grade is DDDD");break;
				default:
					System.out.println("u r grade is FFFF");break;
		}
	

	}

}
