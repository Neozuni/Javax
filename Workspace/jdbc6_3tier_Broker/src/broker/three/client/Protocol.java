package broker.three.client;
/*
 * 클라이언트측 통신을 담당하는 대표주자
 * ::
 * 2tier에서 Database 자리에 그대로 들어있어야 한다.
 * 즉 이전에 Database의 메소드 선언부가 그대로 있어야 한다.
 * (Broker의 소스코드 수정을 하지 않기 위해서)
 * ::
 * 역할
 * 1. 소켓을 생성해서 서버와의 연결
 * 2. 소켓으로부터 스트림 뽑아내고 Command를 던지고 / 받아야 한다.
 * 3. 메소드 안에서의 구현
 *    1) 도시락 싼다.(Data Pack || setter)
 *    2) 서버쪽으로 던진다.
 *    -------------------------
 *    3) 다시 Jury가 던진 도시락 받는다
 *    4) 도시락 까본다(Data UnPack || getter)
 *    
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Thread.State;
import java.lang.reflect.Array;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.InvalidTransactionException;
import broker.three.exception.RecordNotFoundException;
import broker.three.shares.Command;
import broker.three.vo.CustomerRec;
import broker.three.vo.StockRec;

public class Protocol {
	//필드 선언
	private Socket s;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Command cmd;
	
	private static final int MIDDLE_PORT = 60000;
	
	public Protocol(String serverIp) throws Exception{
		s = new Socket(serverIp, MIDDLE_PORT);
		System.out.println("client socket creating....");
		
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	/////////////// 공통적인 기능 ////////////////////////////////
	public void writeCommand(Command cmd) {
		try {
			oos.writeObject(cmd);
			System.out.println("client writeCommand()....end");
		}catch(IOException e) {
			System.out.println("protocol : writeCommand().."+e);
		}
	}
	
	public int getResponse() { //readCommand() + getResult()-->Status Code
		try {
			cmd=(Command)ois.readObject();	
			System.out.println("client readCommand.....end");
		}catch(Exception e) {	
			System.out.println("client getResponse()....."+e);
		}
		int status = cmd.getResults().getStatus();
		return status;
	}
	/////////////// Database와 동일한 메소드가 선언 ///////////////
	public void buyShares(String ssn, String symbol, int quantity) 
			throws RecordNotFoundException{
		//1. 도시락 싼다
		cmd = new Command(Command.BUYSHARES);
		String[ ] str = { ssn,symbol,String.valueOf(quantity)};
		cmd.setArgs(str);
		
		//2. 도시락 던진다.
		writeCommand(cmd);
		
		//3. 다시 Jury가 보낸 도시락 받는다.
		getResponse();
	}	
	public void sellShares(String ssn, String symbol, int quantity) 
			throws RecordNotFoundException, InvalidTransactionException{
		cmd = new Command(Command.BUYSHARES);
		String[ ] str = { ssn,symbol,String.valueOf(quantity)};
		cmd.setArgs(str);
		writeCommand(cmd);
		int status=getResponse();
		if(status==-1) throw new RecordNotFoundException("팔려는 주식이 없어여...sellShares");
		else if(status==-3) throw new InvalidTransactionException("팔려는 주식이 넘 많아여...sellShares");
	}
	/*
	 * 반환값이 있는 메소드는 Jury 쪽에서 Result에 객체를 덩어리로 
	 * 넣었다는 것을 생각한 상태에서 도시락을 까봐야 한다.
	 */
	public ArrayList<StockRec> getAllStocks() {
		ArrayList<StockRec> list = new ArrayList<StockRec>();
		cmd = new Command(Command.GETALLSTOCK);
		writeCommand(cmd);
		getResponse();
		list=(ArrayList)cmd.getResults().get(0); // 0 은  덩어리 주소 
		return null;
	}	
	public float getStckPrice(String symbol) {
		cmd = new Command(Command.GETSTOCKPRICE);
		String[] str = {symbol};
		cmd.setArgs(str);
		writeCommand(cmd);
		getResponse(); // 서버가 던진 도시락을 일단 받았다
		float price = (float)cmd.getResults().get(0);
		return price;
		
	}	
	public ArrayList<CustomerRec> getAllCustomers(){
		ArrayList<CustomerRec> list = new ArrayList<CustomerRec>();
		cmd = new Command(Command.GETALLCUSTOMERS);
		writeCommand(cmd);
		getResponse();
		list=(ArrayList)cmd.getResults().get(0); // 0 은  덩어리 주소 
		return list;
	}
	
	public CustomerRec getCustomer(String ssn) {
		CustomerRec cr = null;
		cmd = new Command(Command.GETCUSTOMER);
		String[] str = {ssn};
		cmd.setArgs(str);
		writeCommand(cmd);;
		getResponse();
		cr = (CustomerRec)cmd.getResults().get(0);
		return cr;
	}
	
	public void addCustomer(CustomerRec cr)throws DuplicateSSNException{
		cmd = new Command(Command.ADDCUSTOMER);
		
		String[ ] str = {cr.getSsn(), cr.getName(), cr.getAddress()};
		cmd.setArgs(str);
		
		writeCommand(cmd);
		
		int status=getResponse();
		if(status==-2) throw new DuplicateSSNException("이미 그런 사람 있어여..addCustomer");
	}
	public void deleteCustomer(String ssn)
								throws RecordNotFoundException{
		cmd = new Command(Command.DELETECUSTOMER);
		String[ ] str = {ssn};
		cmd.setArgs(str);
		
		writeCommand(cmd);
		
		int status=getResponse();
		if(status==-1) throw new RecordNotFoundException("삭제할 사람 없어여...deleteCustomer");
	}
	public void updateCustomer(CustomerRec cr)
								throws RecordNotFoundException{
		cmd = new Command(Command.UPDATECUSTOMER);
		
		String[ ] str = {cr.getSsn(), cr.getName(), cr.getAddress()};
		cmd.setArgs(str);
		
		writeCommand(cmd);
		
		int status=getResponse();
		if(status==-1) throw new RecordNotFoundException("수정할 사람 없어여...updateCustomer");
	}	
}
