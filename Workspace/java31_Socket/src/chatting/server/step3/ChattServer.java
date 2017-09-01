package chatting.server.step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//Process
public class ChattServer {
	private ServerSocket server;
	private ArrayList<ServerThread> list;
	private Socket s;
	
	
	public ChattServer() {
		list = new ArrayList<ServerThread>();
		System.out.println("1.Process 생성....ArrayList 저장소도 한께 생성..");
	}
	public void addThread(ServerThread st) {
		list.add(st);
	}
	public void removeThread(ServerThread st) {
		list.remove(st);
	}
	public void broadcast(String message) {
		for(ServerThread st : list) 
			st.sendMessage(message);
		
	}
	public void net()throws Exception{
		//통신 알고리즘...
		server = new ServerSocket(60000);
		System.out.println("Server Ready,,,,,,,");
		/*
		 * 1.무한루핑 돌리면서 클라이언트의 접속을 맞아들인다.
		 * 2.소켓을 리턴받자마자 | Thread를 생성하고 인자값으로 주입
		 * 3.start()
		 */
			while(true) {//wating for.....
				s = server.accept();
				ServerThread st = new ServerThread(s,this);
				this.addThread(st);
				st.start();
			}
	}
	public static void main(String[] args)throws Exception {
		ChattServer chattServer = new ChattServer();
		chattServer.net();

	}
}
class ServerThread extends Thread{
	private Socket s;
	private BufferedReader br;
	private PrintWriter pw;
	ChattServer chattServer;
	
	ServerThread(Socket s,ChattServer chattServer){
		System.out.println("2. Thread Creating...");
		try {
			this.s = s;
			this.chattServer = chattServer;
			
			System.out.println(s.getInetAddress()+" 님이 접속하셨습니다..");
			chattServer.broadcast(s.getInetAddress()+" 님이 들어오셨습니다.");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
		}catch(Exception e) {
			
		}
	}
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	
	public void run() {
		try {
			String line = null;
			while((line = br.readLine())!= null) {
				chattServer.broadcast(line);
			}//while
		}catch(Exception e) {			
			chattServer.broadcast(s.getInetAddress()+" 님이 나가셨습니다..");
			System.out.println(s.getInetAddress()+" 님이 나가셨습니다..");
			chattServer.removeThread(this);
		}
	}
}








