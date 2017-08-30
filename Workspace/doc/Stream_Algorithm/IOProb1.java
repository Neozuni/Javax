package io.self.test;
import java.io.*;
import java.util.*;

class IOProb1{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/data/score.txt"));
		String str = br.readLine();
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> inAl = new ArrayList<Integer>();

		do{
			String[] temp = str.split(":");
			al.add(temp[0]);
			inAl.add(Integer.parseInt(temp[1]));
			str = br.readLine();
		}while(str!=null);

		int sum=0;
		int avg=0;
		for(int i=0; i<inAl.size();i++){
			sum +=inAl.get(i);
		}
		avg=sum/inAl.size();
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i)+"의 점수는  "+inAl.get(i)+" 입니다");
		}

		System.out.println("모든 총점의 평균은 "+ sum+ "입니다");
		System.out.println("모두의 평균은 "+ avg+ " 입니다");
	}
	}