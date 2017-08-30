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
			al.add(temp[0]); //티파니
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
			System.out.println(al.get(i)+ " 의 점수는 "+ inAl.get(i)+" 입니다.");
		}
		
		System.out.println("모든 점수의 총점은 "+ sum +" 점입니다.");
		System.out.println("모두의 평균점은  "+ avg +" 점입니다.");
		
	}
}
























