package com.store.test;

import com.store.service.OutletStoreService;
import com.store.util.MyDate;
import com.store.vo.Customer;
import com.store.vo.Product;

/*
 * Scanner 객체로 실행시점에서 값을 일일히 입력받을수 없기 때문에
 * 일단 Product, Customer 객체를 생성하고 
 * 특정 Customer가 Product들을 주입받는 상황을 여기서 만들어 놓고
 * 실행되도록 한다.
 */
public class OutletStoreServiceTest {
	public static void main(String[] args) {
		//1. 고객을 2명을 생성...Store 에서 물건을 구입하는 고객...
		Customer[ ] custs = {
				new Customer(111, "이효리", "애월읍"),
				new Customer(222, "이상순", "애월읍")
		};
		
		//2. 상품들을 생성...
		Product[ ] pros1 = {
				new Product(123, "CJ", "알뜰비누", 1200, new MyDate(2016, 4, 5)),
				new Product(900, "동원", "고추참치", 3300, new MyDate(2017, 7, 12)),
				new Product(778, "동원", "장조림", 4500, new MyDate(2017, 8, 5)),
				new Product(345, "CJ", "좋아요샴푸", 9000, new MyDate(2017, 1, 5)),
				new Product(777, "대우", "공기방울 세탁기", 700000, new MyDate(2017, 1, 15))
		};
		Product[ ] pros2 = {
				new Product(1888, "맥심", "아메리카노", 7000, new MyDate(2017, 4, 5)),
				new Product(674, "청정원", "고추장", 12000, new MyDate(2017, 6, 8))
				
		};
		
		//3. Service 객체 생성
		OutletStoreService service = new OutletStoreService();
		service.printAllProductName(custs[0], pros1);// 어떤 고객이 구입한 상품 출
		service.printAllCustomer(custs);//모든 고객 정보 출력
		service.getAllProduct(custs[0], pros1);//10만원 이상의 상품 출력
		
		int max=service.getMaxPriceProduct(custs[0], pros1);//특정고객의 물건중 최고가 
		System.out.println(custs[0].getCustName()+" 님께서 구입한 상품중 최고가 금액은 "+max+"원입니다.");
		
		

	}
}

