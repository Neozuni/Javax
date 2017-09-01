package chatting.server.step2;
/*
 * 클라이언트가 보낸 메세지를 받아서
 * 다시 클라이언트측으로 메시지를 뿌리는 로직
 * ::
 * 입력 - 소켓으로부터 리턴받아서 생성
 * 출력 - 소켓으로부터 리턴받아서 생성
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	
		// TODO Auto-generated method stub
		ServerSocket server;
		Socket s;
		BufferedReader br;
		PrintWriter pw;
		
		public void net() throws Exception{
			/* 
			 * 1. 서버 소켓 생성
			 * 2. 소켓 리턴 받은
			 * 3. 스트림 생성
			 * 4. 클라이언트가 보낸 메세지 받아서
			 * 5. 다시 클라이 언트로 보냄 
			 */
			server = new ServerSocket(5500);
			System.out.println(" neo server ready ... ");
			
			s=server.accept(); // return
			System.out.println(s.getInetAddress()+" 님이 접속 하였습니다. ");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			System.out.println("3. 스트림 생성 ...");
			
			String line = null;
			while ((line = br.readLine())!=null) {
				pw.println(line);
			}
			br.close();
			pw.close();
			
		}//net
		
		public static void main(String[] args) throws Exception {
			ChattServer chattServer = new ChattServer();
			chattServer.net();
			

	}//main

}//class
