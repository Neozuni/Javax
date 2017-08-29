package io.file.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 문자데이타를 읽고 출력하는데 있어서
 * Byte계열 스트림 | Charater 계열 스트림
 */
public class FileStreamTest4 {
	public static void main(String[] args)throws IOException{
		String fileName = "src/hello.txt";
		String fileName2 = "src/hello2.txt";
		
		FileInputStream fis = new FileInputStream(fileName); // 파일을 물고 있는 기
		DataInputStream dis = new DataInputStream(fis); // 보조 
		
		FileOutputStream fos = new FileOutputStream(fileName2);
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		
		
		System.out.println("===========Byte Input 기본 Stream ===========");
		
		//byte단위로 읽어들일때 파일의 끝은 -1로 표시한다
		int data = 0;
		while((data = dis.read())!=-1) { // read 로 읽어서  
			dos.writeInt((char)data); // write 로 뿌린다 
		}//
		
		
	/*	FileReader fr = new FileReader(fileName);
		System.out.println("===========Character Input 기본 Stream ===========");
		while((data = fr.read())!=-1) {
			//System.out.println(data);
			System.out.println((char)data);
		}*/
	}
}









