import java.io.*;
import java.util.*;

class IOProbScore1{
	public static void main(String[] args)throws Exception{
		BufferedReader br = 
				new BufferedReader(new FileReader("src/data/score.txt"));
		String str = br.readLine();
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> inAl = new ArrayList<Integer>();
		
		do{
			String[ ] temp=str.split(":");
			al.add(temp[0]); //Ƽ�Ĵ�
			inAl.add(Integer.parseInt(temp[1])); //100
			str = br.readLine();
		}while(str !=null);
		
		int sum = 0;
		double avg = 0;
		for(int i=0; i<inAl.size(); i++){
			sum += inAl.get(i);
		}
		avg = sum/inAl.size();
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i)+ " �� ������ "+ inAl.get(i)+" �Դϴ�.");
		}
		
		System.out.println("��� ������ ������ "+ sum +" ���Դϴ�.");
		System.out.println("����� �������  "+ avg +" ���Դϴ�.");
		
	}
}
























