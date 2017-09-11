package broker.three.server;
/*
 *  ������ ����� �ϱ����� ���� start class�̴�.
 *  ServerSocket�� ������ �־ Ŭ���̾�Ʈ�� ������
 *  ���ѷ����� ���鼭 ������ �� �־�� �Ѵ�.
 *  ProtocolHandler�� ������� ����
 *  �����ʾ�����....
 *  �������� 2���� ����
 *  1) ���ѷ��� ���鼭 �����·� �������� ������ ��ٸ���.
 *     : ProtocolHandler
 *  2) ����� Ŭ���̾�Ʈ�� �������� ���񽺸� ���
 *     (Ưȭ�� �۾��� �����ϴ� �۾� ������)
 *     : JuryThread
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolHandler extends Thread{
	// �ʵ�
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




















