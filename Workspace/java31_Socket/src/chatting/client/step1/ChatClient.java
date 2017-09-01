package chatting.client.step1;
/*
 *  =========Socket 통신을 위한 클라이언트 측 로직 =============
 *  서버측으로 데이타를 보내는 Side
 *  서버측으로 데이타를 보내기 위해서는
 *  1)서버의 주소(id address) 2)port(서버와 동일한 포트)
 *  
 *  < 클라이언트 측 핵심 로직 >
 *  1. 소켓 생성
 *  (소켓을 생성하는 것 만으로 서버와 연결이 이루어진다)
 *  Socket s = new Socket("server ip", port);
 *  ===========================================
 *  "키보드로 입력받은 데이터를 읽어서
 *  서버로 읽은 데이터를 뿌린다 " 
 * ::
 * 입력스트림 (내부 장치 연결 스트림)
 * 출력스트림 (외부 장치 연결 스트림)
 * 
 *  2. 스트림 생성
 *    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *    PrintWriter pw = new PrintWriter(s.getOutputStream()); 
 *  
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	
	public void net() throws Exception{
		//1. 127.0.0.1
		Socket s = new Socket("192.168.0.106",5500);
		System.out.println("Socket Client.....Creating...");
		
		//2. 스트림 생성
		br = new BufferedReader(new InputStreamReader(System. in));
		pw = new PrintWriter(s.getOutputStream(),true);
		
		//3. 읽어들인 데이터를 서버로 뿌림 
		String line = null;
		while((line = br.readLine())!=null) {
			pw.println(line);
		}
		br.close();
		pw.close();
	
	}
	public static void main(String[] args) throws Exception{
		ChatClient chattClient =new ChatClient();
		chattClient.net();
	}
}









