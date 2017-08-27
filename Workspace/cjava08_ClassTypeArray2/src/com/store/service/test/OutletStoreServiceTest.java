package com.store.service.test;

import com.store.service.OuletStoreService;
import com.store.util.MyDate;
import com.store.vo.Customer;
import com.store.vo.Product;

public class OutletStoreServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] custs = {
				new Customer(111,"neo", "seoul"),
				new Customer(222, "zuni", "daegu"),
				new Customer(333,"naco","incheon")
		};

		Product[] pros1 = {
				new Product(900, "동원", "고추참치", 3300, new MyDate(2017, 7, 12)),
				new Product(778, "동원", "장조림", 4500, new MyDate(2017, 8, 5)),
				new Product(345, "CJ", "좋아요샴푸", 9000, new MyDate(2017, 1, 5)),
				new Product(777, "대우", "공기방울세탁기", 700000, new MyDate(2017, 1, 15))
		};
		
		Product[ ] pros2 = {
				new Product(999, "maxin", "americano", 4000, new MyDate(2014, 4, 5)),
				new Product(333, "nongshim", "fishchips", 2400, new MyDate(2015, 4, 5)),
				new Product(777, "nongshim", "shinramen", 3000, new MyDate(2016, 4, 5)),
				new Product(333, "odduki", "rice", 1000, new MyDate(2017, 3, 5)),
				new Product(674, "goods", "foos", 50000, new MyDate(2017, 2, 8))
				
		};
		
		OuletStoreService service = new OuletStoreService();
		service.printAllProductName(custs[2],pros2);// 특정 고객이 구입한 상품을 출력
		service.printAllProductName2(custs[1],pros2);// 모든 고객의 정보를 출력
		service.printAllCustomer(custs);// 10만원 이상 상품의 출력 
		
		int max = service.getMaxPriceProduct(custs[0], pros1);
		System.out.println(custs[0].getCustName()+ "님께서 구입한 상품중 최고가 금액은 " + max+ "원 입니다.");
		
		

	}

}
