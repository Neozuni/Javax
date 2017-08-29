package io.file.test;
/*
 * PrintWriter를 Node계용
 * 이때 프로그램이 어떻게 달라지는지 직접 확인하시기 바랍니다.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingTest3 {
	public static void main(String[] args) throws IOException{
		String inputFile = "src/poem.txt";
		String outputFile = "src/result.txt";
		//1.
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		PrintWriter pw = new PrintWriter(outputFile);
		System.out.println("result.txt 파일이 생성되었습니다...");
		System.out.println("파일을 열어서 출력된 내용을 확인하세요...");
		
		//2.
		String line = null;
		while((line = br.readLine())!= null) {
			//System.out.println(line); //3
			pw.println(line);
		}//
		pw.close();
		
	}
}











