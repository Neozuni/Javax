package chatting.client.step2;
/*
 * 키보드로 입력받은 데이타를 읽어서
 * 서버로 보냄 
 * +
 * 다시 서버가 보낸 데이타를 읽어서
 * 자신의 콘솔창으로 출력
 * ::
 * 입력 2개 / 출력 1개
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	Socket s;
	BufferedReader br1 , br2;
	PrintWriter pw;
	
	public void net() throws Exception{
		/*
		 * 1.소켓생성
		 * 2.스트림생성
		 * 3.읽어들여서보내고
		 * 4.다시 받아서 콘솔로 출력
		 * 
		 */
		
		Socket s = new Socket("192.168.0.102",60000);
		
		br1 = new BufferedReader(new InputStreamReader(System. in));
		pw = new PrintWriter(s.getOutputStream(),true);
		br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		
		String line = null;
		while((line = br1.readLine())!=null) {
			pw.println(line);
			//blocking
			
			String line2 = br2.readLine();
			System.out.println("시스템에서 보내온 메세지 "+line2);
		}
	}
	
	public static void main(String[] args) throws Exception {
		ChattClient chattClient = new ChattClient();
		chattClient.net();
	}

}
