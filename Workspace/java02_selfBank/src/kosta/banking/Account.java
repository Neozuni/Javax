package kosta.banking;

public class Account {
	double balance;

	
	//왜이런구문이 실행되었는지 ? 
	public Account(double balance) {
		this.balance = balance;
	}
	
	// 입금 
	public void dePosit(double amount) {
		balance += amount; // balance = balance + amount
	}
	//출금 
	public void withDraw(double amount) { //위의 amont 변수와 다른 변수 즉 로컬변수 
		balance -= amount;
	}
	
	//잔액확
	public double getBalance() {
		return balance; // 
	
	}
	

}
