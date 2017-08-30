package io.file3.self.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//src/data/score.txt 를 참조
//문제2.docx 를 참조 
public class IOProb1{
	public static void main(String[] args)throws Exception{
		//구현하세요  
		String fileName = "src/score.txt";
		InputStreamReader is = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
		BufferedReader br = new BufferedReader(is);
		OutputStreamWriter sw = new OutputStreamWriter(new FileOutputStream(fileName, true));

		
		//FileInputStream fis = new FileInputStream(fileName);
		//DataInputStream dis = new DataInputStream(fis);
		
		String line = null;
		while((line = br.readLine())!= null) {
			System.out.println(line); //3
		
		}//while
		


	}//
}