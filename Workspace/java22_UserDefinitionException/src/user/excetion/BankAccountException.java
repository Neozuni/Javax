package user.excetion;
class InvalidAmountException{
	
}

class AmountInputException{
	
}
class Account{
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		/*
		 * 입금액은 반드시 1000원 이상이어야 한다.
		 * 그렇지 않으면 AmountInputException을 발생시킴
		 * 
		 * 현재 잔액에 amount를 추가하고 그 결과로 잔액은 증가		 * 
		 * 메세지 출력...잔액을 출력
		 */
	}
	
	public void withdraw(int amount) {
		/*
		 * 잔액보다 출금하려는 금액이 많으면 InvalidAmountException을 발생
		 * 그렇지 않다면
		 * 잔액에서 출금액이 빠지고
		 * 메세지 출력...잔액도 출력
		 */
	}
}
public class BankAccountException {
	public static void main(String[] args) {
		Account acc = new Account(10000);
		
		/*
		 * 1. 20000원 입금
		 * 2. 800원 입금(에러)
		 * 
		 * 3. 23000원 출금
		 * 4. 7000원 출금
		 * 5. 2000원 출금(에러)
		 * 
		 * 6. 최종잔액을 출금
		 * 
		 * 
		 */
	}
}


















