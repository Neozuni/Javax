package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExceptionTest1 {
	public static void main(String[] args) {
		String fileName = "/Users/zunix/Documents/a.rtf";
		try {
			FileReader fr = new FileReader(fileName);
			
			fr.read();
			System.out.println("파일을 읽어들였습니다..");
		}/*catch(FileNotFoundException e) {
			
		}*/catch(IOException e) {
			
		}

	}
}
/*
 * 				IOException
 *                   |
 *          FileNotFoundException
 */






