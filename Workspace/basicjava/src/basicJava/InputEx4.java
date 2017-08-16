package basicJava;
import java.io.*;

public class InputEx4 {

	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		int kor; int eng;
		int mat; int hap;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Korean = ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("English = ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("Math = ");
		mat = Integer.parseInt(br.readLine());
		hap = kor+eng+mat;
		System.out.println();
		System.out.println("Total sum = " +hap);
		

	}

}
