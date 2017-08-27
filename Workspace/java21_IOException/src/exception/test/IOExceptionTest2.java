package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExceptionTest2 {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		String fileName = "/Users/zunix/Documents/a.rtf";
			FileReader fr = new FileReader(fileName);
			fr.read();
			System.out.println("파일을 읽어들였습니다..");
			
		}

	}

/*
 * 				IOException
 *                   |
 *          FileNotFoundException
 */






