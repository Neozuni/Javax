package exception.test;

import java.io.IOException;

public class IOExceptionTest3 {
	public static void main(String[] args) throws IOException{
		System.out.println("==========IOException============");
		byte[ ] data = new byte[100];
		//키보드로 데이타를 읽어들임
		System.out.println("키보드로 입력부탁드립니다..\n");
		/*try {
			System.in.read(data);
		}catch(IOException e) {
			System.out.println("read()를 사용하는 순간 예외가 발생+예외를 여기서 처리함");
		}*/
		System.out.println(new String(data));
	}
}
