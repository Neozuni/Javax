package broker.three.shares;

import java.io.Serializable;

public class Command implements Serializable{
	//비지니스로직을 상수로 매핑...약속
	public static final int BUYSHARES = 10;
	public static final int SELLSHARES = 20;
	public static final int GETALLSTOCK = 30;
	public static final int GETSTOCKPRICE = 40;
	public static final int GETALLCUSTOMERS = 50;
	public static final int GETCUSTOMER = 60;
	public static final int ADDCUSTOMER = 70;
	public static final int DELETECUSTOMER = 80;
	public static final int UPDATECUSTOMER = 90;
	
	private int commandValue;
	private String[ ] args;
	private Result results;
	
	
	public Command(int commandValue) {
		this.commandValue = commandValue;
		results = new Result();
	}
	
	//data pack...도시락 싼다
	public void setCommandValue(int commandValue) {
		this.commandValue = commandValue;
	}
	public void setArgs(String[] args) {
		this.args = args;
	}
	public void setResults(Result results) {
		this.results = results;
	}
	
	//data upack...도시락 열어본다
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







