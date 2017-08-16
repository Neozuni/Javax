package kosta.banking;

public class Customer {
	String firstname;
	String lastname;
	int ssn;
	Account	account; // 통장개설을 위한 어카운트 해
	
	//Customer	(FN , LN , SSH) ?? 
	
	//생성시 어카운트는 뺀다 세터로 넣기위해 
	public Customer(String firstname, String lastname, int ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssn = ssn;
		
	}
	//세터로 어카운트 생
	public void setAccount(Account acc) {
		account = acc;
		
		
	}

	public Account getAccount() {
		return this.account;
		
	}


}


