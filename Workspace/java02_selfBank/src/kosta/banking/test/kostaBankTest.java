package kosta.banking.test;

import kosta.banking.*;

public class kostaBankTest {

	public static void main(String[] args) {
		Customer J = new Customer("James","Gosing",3359);//고객생성
		// 제임스가 통장을 하나 개설한다 메모리에 올림 기
		
		
		J.setAccount(new Account(10000));//J의 개설된 계좌에 1만입금
		
		//제임스가 개설한 통장을 리턴받는 // 어떤통장을 쓰느냐는 어떤 통장을 리턴받느냐 ...
		//제임스가 개설한 통장의 기능을 사용할수있다 
		J.getAccount().dePosit(3000);
		
		J.getAccount().dePosit(5000);
		J.getAccount().withDraw(2000);
		
		System.out.println(J.getAccount().getBalance());
		

	}

}

/*
1.James Gosling 이라는 고객을 생성하세요
2.JG가 잔액 1만원이든 통장을 개설
3.개설한 통장을 리턴 받아서 
4.3000원 입금 5000입금 2000출금
5.최종 잔액 확인 16000
*/