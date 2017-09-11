package broker.three.server;
/*
 *  서버측 통신을 하기위한 가장 start class이다.
 *  ServerSocket을 가지고 있어서 클라이언트의 접속을
 *  무한루핑을 돌면서 맞이할 수 있어야 한다.
 *  ProtocolHandler는 쓰레드로 정의
 *  리스너쓰레드....
 *  쓰레드의 2가지 유형
 *  1) 무한루핑 돌면서 대기상태로 누군가의 접속을 기다린다.
 *     : ProtocolHandler
 *  2) 연결된 클라이언트와 직접적인 서비스를 담당
 *     (특화된 작업을 전담하는 작업 쓰레드)
 *     : JuryThread
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolHandler extends Thread{
	// 필드
	ServerSocket server;
	Socket s;
	JuryThread jury;
	Database db;
	public static final int MIDDLE_PORT = 60000;
	
	public ProtocolHandler(String serverIp){
		try {
			server = new ServerSocket(MIDDLE_PORT);
			db = new Database(serverIp);//!!!			
		}catch(Exception e) {
			e.printStackTrace();
		}		
		System.out.println("start protocol Handler....server port.... "+MIDDLE_PORT);
	}	
	public void run() {
		while(true) {
			try {				
				s = server.accept();
				jury = new JuryThread(s,db);
				
				jury.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ProtocolHandler handler = new ProtocolHandler("127.0.0.1");
		handler.start();
	}
}




















