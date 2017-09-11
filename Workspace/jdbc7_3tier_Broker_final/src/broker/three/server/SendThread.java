package broker.three.server;

import java.io.*;
import java.net.*;
import java.sql.*;


public class SendThread extends Thread {

	Socket talkToMe;
    DataOutputStream sendStream;
    DataInputStream recvStream;
    boolean success = true;
    StreamingData streamer;
    
 
    public SendThread (Socket s, StreamingData parent){
    
		talkToMe = s;
        streamer = parent;

        try {
        
			sendStream = new DataOutputStream(talkToMe.getOutputStream());
            recvStream = new DataInputStream(talkToMe.getInputStream());
        
		} catch (IOException e) { 
        
			System.err.println("Error in SendThread creating Input or Output Stream" + e);
            success = false;
        
		}

		if (success) {
        
			this.start();
        
		} else {
			return;
        }

    }


/**
	*Ŭ���̾�Ʈ ��û�� �����͸� ������ �κ�.
     *1)���� DB���� ������� �ֽ��� ������ �����ش�.
	*2)StreamingData���� �ۼ��� �ֽ��� �̸��� ������ �����Ѵ�.
*/
    public void sendData () {
        
        try {

             sendStream.writeInt (streamer.stockName.length);
		
          
            for (int k = 0; k < streamer.stockName.length; k++ ) {
                sendStream.writeUTF(streamer.stockName[k]);
                sendStream.writeFloat(streamer.stockPrice[k]);
		   }

        } catch (IOException e) {

                System.err.println ("Appears client closed connection,");
                System.err.println ("terminating this thread...");
				try{
				 sendStream.close();
				 recvStream.close();
				 talkToMe.close();
				 
				 }catch(IOException e1){}
               
                
        }

    }



    public void run() {
       try {
	
        while (true) {
        
			
            
				String result = recvStream.readUTF();
                InetAddress inet = talkToMe.getInetAddress();

                System.out.println(inet.toString() + " : " + inet.getHostName());
                System.out.println(result);
            

           
            sendData ();

          
            this.yield(); 

         }
	 } catch (IOException e) {

                System.err.println ("Error reading the UTF string from client" + e);
				try{
				 sendStream.close();
				 recvStream.close();
				 talkToMe.close();
				 }catch(IOException e2){}

      }
  }
} 
