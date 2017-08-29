package io.file.test;
/*
 * src/poem.txt 파일의 내용을 읽어서
 * (poem.txt 파일이 반드시 이미 존재해야만 한다.)
 * 
 * src/result.txt 파일로 출력
 * (result.txt 파일이 존재하지 않더라도 출력스트림은 해당 폴더에 파일을 하나 생성하고 그곳으로 뿌린다)
 * ::
 * 1. 스트림 생성
 *  출력용 스트림생성
 *  (Filewriter | PrintWriter)
 *  
 * 2. 읽어들인다
 * 3. 파일로 뿌린다.
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingTest22{
	public static void main(String[] args)throws IOException{
		String inputFile = "src/pome.txt";
		String outputFile = "src/result.txt";
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		PrintWriter pw = new PrintWriter(new FileWriter(outputFile));
		System.out.println("result 파일이 생성되었습니다. ..");
		System.out.println("파일을 열엇 출력 내용을 확인하세요 ");
		
		String line = null;
		while(((line = br.readLine())!=null)) {
			System.out.println(line);
			pw.println();
			
		}
		
	}
}