package condition.self.test;

public class BankSelfTest {

	public static void main(String[] args) {
		Account acc = new Account(10000);
		Account acc1 = new Account();
		acc1.setBalance(15000);
		
		Account acc2 = new Account(1000,2000);
		
		acc.dePosit(2000);
		acc.dePosit(1500);
		acc.dePosit(100);
		//System.out.println("잔액확인1 ::"+acc.getBalance()+"");
		
		acc.withDraw(8000);
		acc.withDraw(7000);
		//System.out.println("잔액확인2 ::"+acc.getBalance()+"");
/*
 *1.입금하려는 금액이 1000원 이상일때만 입금을 허용
 *  그렇지 않다면 "입금액은 1000원 이상이어야 함!!"
 *  
 * 2.출금하려는 금액은 임금액이 잔액보다 크면 안되도록 함	
 * 	그렇지 않다면 "~~~~" 출		
 */

	}

}

class Account {
	
	double balance;

	
	public Account() {
		
	}
	
	//왜이런구문이 실행되었는지 ? 
	public Account(double balance) {
		this.balance = balance;
	}
	//왜이런구문이 실행되었는지 ? 
	public Account(double balance, double de) {
			this.balance = balance;
			this.balance  += de;
			
	}
	
	// 입금 
	public void dePosit(double amount) {
		if (amount >= 1000) {
			balance += amount; // balance = balance + amount
			System.out.println("입금 되었습니다. 입금 요청 하신 금액은 " + amount + " 현재 잔액은 "+balance+"원 입니다.");
			
		}
		
		else  {
			System.out.println("입금 불가 !! 요청 하신 금액은 " +amount+ " 입금 가능한 최소 금액은 1000원 입니다.");
			//System.out.println("현재 통장의 잔액은 " +balance+ "원 입니다.");
		}
	}
	//출금 
	public void withDraw(double amount) { //위의 amont 변수와 다른 변수 즉 로컬변수 
		if (amount < balance) {
			balance -= amount;
			System.out.println(amount + "원 출금되었습니다 현재 잔액은 "+balance+ "입니다 " );
				}
		else {
			System.out.println("요청하신 금액 " +amount+ " 출금 불가 !! 잔고 부족합니다. 현재 잔고" +balance+ "원 입니다.");
		}
	}
	
	//잔액확인 
	public double getBalance() {
		return balance; // 
	
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
