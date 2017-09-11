package broker.three.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.InvalidTransactionException;
import broker.three.exception.RecordNotFoundException;
import broker.three.shares.Command;
import broker.three.shares.Result;
import broker.three.vo.CustomerRec;
import broker.three.vo.StockRec;

public class JuryThread extends Thread{
	private Socket s;
	private Database db;
	private Command cmd;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	
	public JuryThread(Socket s, Database db){
		try {
			this.s = s;
			this.db = db;
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			System.out.println("JuryThread creating....call...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//생성자
	
	public void run() {
		System.out.println("jury running.....");
		while(true) {
			try {
				//도시락 받는다.
				cmd = (Command)ois.readObject();
				System.out.println("cmd....jury reading...");
			}catch(Exception e) {
				e.printStackTrace();
			}
				//열어본다.(Data Unpack | getter)
				int commValue = cmd.getCommandValue();//10~90
				String[ ] args = cmd.getArgs();
				Result r = cmd.getResults();
				
				//
				switch(commValue) {//정수,스트링 | 실수형은 안된다.
					case Command.BUYSHARES :
						try {
							db.buyShares(args[0], args[1], Integer.parseInt(args[2]));
							r.setStatus(0);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case Command.SELLSHARES:
						try {
							db.sellShares(args[0], args[1], Integer.parseInt(args[2]));
							r.setStatus(0);
						}catch(RecordNotFoundException e) {
							r.setStatus(-1);
						}catch(InvalidTransactionException e) {
							r.setStatus(-3);
						}catch(Exception e) {
							
						}
						break;
					case Command.GETALLSTOCK:
						try {
							ArrayList<StockRec> list=db.getAllStocks();
							r.setStatus(0);
							r.add(list);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case Command.GETSTOCKPRICE:
						try {
							float price=db.getStockPrice(args[0]);
							r.setStatus(0);
							r.add(price);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case Command.GETALLCUSTOMERS:
						try {
							ArrayList<CustomerRec> list=db.getAllCustomers();
							r.setStatus(0);
							r.add(list);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case Command.GETCUSTOMER:
						try {
							CustomerRec cr=db.getCustomer(args[0]);
							r.setStatus(0);
							r.add(cr);
						}catch(Exception e) {
							e.printStackTrace();
						}
					break;
					case Command.ADDCUSTOMER:
						try {
							db.addCustomer(new CustomerRec(args[0], args[1], args[2]));
							r.setStatus(0);							
						}catch(DuplicateSSNException e) {
							r.setStatus(-2);
						}catch(Exception e) {
							e.printStackTrace();
						}
					break;
					case Command.DELETECUSTOMER:
						try {
							db.deleteCustomer(args[0]);
							r.setStatus(0);
						}catch(RecordNotFoundException e) {
							r.setStatus(-1);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case Command.UPDATECUSTOMER:
						try {
							db.updateCustomer(new CustomerRec(args[0], args[1], args[2]));
							r.setStatus(0);
						}catch(RecordNotFoundException e) {
							r.setStatus(-1);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
				}//switch
				
				//4. 다시 클라이언트 쪽으로 날린다.
				try {
					oos.writeObject(cmd);
				}catch(IOException e) {
					e.printStackTrace();
				}			
		}//while
	}//run
}//class
























