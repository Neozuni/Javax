package io.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest1 {
	public static void main(String[] args) throws IOException{
		String fileName = "src/poem.txt";
		//1.
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		//2.
		String line = null;
		while((line = br.readLine())!= null) {
			System.out.println(line); //3
		}

	}
}











