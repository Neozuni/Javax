package basicJava;
import java.io.*;

public class InutEx3 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		String name; String nai;
		String addr; String tel;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("name = ");
		name = br.readLine();
		System.out.print("age = ");
		nai=br.readLine();
		System.out.print("address = ");
		addr = br.readLine();
		System.out.print("telephone number = ");
		tel = br.readLine();
		System.out.println();
		System.out.println(name + " customer");
		System.out.println(nai + " ages");
		System.out.println("u living in "+addr);
		System.out.println(tel + "  i'll call back to you");
		
	}

}
