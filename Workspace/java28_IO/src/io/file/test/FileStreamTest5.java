package io.file.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 문자데이타를 읽고 출력하는데 있어서
 * Byte계열 스트림 | Charater 계열 스트림
 */
public class FileStreamTest5 {
	public static void main(String[] args)throws IOException{
		String fileName = "src/hello.txt";
		
		FileInputStream fis = new FileInputStream(fileName);
		System.out.println("===========Byte Input 기본 Stream ===========");
		
		//byte단위로 읽어들일때 파일의 끝은 -1로 표시한다
		int data = 0;
		while((data = fis.read())!=-1) {
			//System.out.println(data);
			//System.out.println((char)data);
		}//
		
		
		FileReader fr = new FileReader(fileName);
		System.out.println("===========Character Input 기본 Stream ===========");
		while((data = fr.read())!=-1) {
			//System.out.println(data);
			System.out.println((char)data);
		}
	}
}









