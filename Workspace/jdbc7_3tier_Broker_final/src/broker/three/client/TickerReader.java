package broker.three.client;

import java.net.*;
import java.io.*;

class TickerReader {

    Socket tickerSocket;
    DataInputStream recvStream;
    DataOutputStream sendStream;
    String symbol[];
    float price[];
	String price_st[];

    String hostname;
    int port;

    String reStr = null;
	int header=0;
    
    public TickerReader (String hostname, int port) {
        // hostname�� port�� member�� setting��Ű�� �Ͱ�
        // makeConnection�� ȣ���ϴ� �κ��� �ʿ��մϴ�.
		this.hostname=hostname;
		this.port=port;
    	makeConnection(hostname, port);
    }

    public void makeConnection (String hostname, int port) {
        // Socket�� ����� DataInputStream�� DataOutputStream�� �����
        // ������ �ʿ��մϴ�.
     	try {
    		tickerSocket = new Socket(hostname,port);
    		recvStream = new DataInputStream(tickerSocket.getInputStream());
    		sendStream =  new DataOutputStream(tickerSocket.getOutputStream());
    	} catch(IOException e) {e.printStackTrace();}
  
    
    }

    public String readData () {
        // StreamingData�� ���� ������ �ޱ� ����
        // ù��°�� �ϳ��� ���ڿ��� ������, int type���� Symbol�� ������ 
        // �޽��ϴ�. ���Ŀ� symbol�� price�� �迭�� ������ŭ �������.
        // ������ �������� �����ִ� ������ �о� ���Դϴ�.
        // �װ��� �ϳ��� String ���� ���� return.
        String reStr = "";

    	try {
    		sendStream.writeUTF ("�ڷ��û�մϴ�");
        	if (recvStream == null) {
        	
        	} else {     
            	header = recvStream.readInt();
            	symbol = new String[header];
            	price = new float[header];
				price_st=new String[header];
            	for (int i = 0; i < header; i++) {
                		symbol[i] = recvStream.readUTF();
                		price[i]  = recvStream.readFloat();
					//	price_st[i]=new Float(price[i]).toString();
                }
				
        	} 
        } catch (IOException e) {}

    	//�޾ƿ� �ڷḦ ��Ʈ������ ���� ����
        for (int i = 0; i <symbol.length; i++) {
    		reStr += symbol[i].trim() + " "+new Float(price[i]).toString().trim()+"   ";     
         // reStr += MakeFraction.convertToFraction (price[i]) + "  ";
		 //   reStr += price_st[i] + " ";
	    }
        return reStr;
    }

    public void closePort () {
        try {
            tickerSocket.close();
            recvStream.close();
        } catch (IOException e) {
            System.err.println ("closePort failed");
        }
    }

}