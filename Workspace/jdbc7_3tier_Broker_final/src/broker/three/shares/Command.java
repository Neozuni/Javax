package broker.three.shares;

import java.io.Serializable;

public class Command implements Serializable{ //im ser 일렬로 
	//비지니스 로직을 상수로 매핑 ... 약속 
	public static final int BUYSHARES =10 ;
	public static final int SELLSHARES =20 ;
	public static final int GETALLSTOCK =30 ;
	public static final int GETSTOCKPRICE =40 ;
	public static final int GETALLCUSTOMERS =50 ;
	public static final int GETCUSTOMER =60 ;
	public static final int ADDCUSTOMER =70 ;
	public static final int DELETECUSTOMER =80 ;
	public static final int UPDATECUSTOMER =90 ;

	private int commandValue;
	private String[] args;
	private Result results;
	
	
	
	public Command(int commandValue) { // 밥은 그냥넣어보자 ..
		this.commandValue = commandValue;
		results = new Result();
	}
	
	//data pack ... 도시락을 싼다  setter : 추후 재사용 성을 떨어 트리기는 함 .. 
	
	public void setCommandValue(int commandValue) {
		this.commandValue = commandValue;
	}
	public void setArgs(String[] args) {
		this.args = args;
	}
	public void setResults(Result results) {
		this.results = results;
	}
	
	//data unpack ... 도시락 뚜껑 연다 .. getter : 
	
	public int getCommandValue() {
		return commandValue;
	}
	public String[] getArgs() {
		return args;
	}
	public Result getResults() {
		return results;
	}
	

		
	}
