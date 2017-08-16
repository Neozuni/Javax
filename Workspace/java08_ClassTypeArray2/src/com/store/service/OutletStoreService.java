package com.store.service;

import com.store.vo.Customer;
import com.store.vo.Product;

/*
 * 해당 Store에서 고객들이 상품들을 다루는 기능들만을 모아놓은 서비스 클래스
 */
public class OutletStoreService {
	//1. 어떤 고객이 구입한 모든 상품들을 이름을 콘솔창으로 출력하는 기능
	public void printAllProductName(Customer c, Product[ ] pros) {
		System.out.println("1) ==========="+c.getCustName()+" 님이 구입하신 상품들입니다==========");
		for(Product p : pros) 
			System.out.print(p.getModel()+" ");		
		System.out.println(" ");
		
	}
	
	//2. 현재 Store에 물건을 구입하기 위한 모든 고객의 정보를 콘솔로 출력
	//ssn, name, address
	public void printAllCustomer(Customer[ ] custs) {
		System.out.println("\n2) =========고객들의 정보입니다..===========");
		for(Customer c : custs) 
			System.out.println(c.getSsn()+", "+c.getCustName()+", "+c.getAddress());
		
	}
	
	//3. 특정 고객이 구입한 모든 상품을 리턴받아서 
	// 그 중에서 1만원이 넘는 상품들의 정보만 출력.
	public Product[ ] getAllProduct(Customer c, Product[ ] pros) {
		System.out.println("\n3) 다음은 10만원 이상의 고가 상품들 입니다. ");
		System.out.println(c.getCustName()+" 님께서 구입한 물건입니다");
		for(Product p : pros) {
			if(p.getPrice()>=100000) 
				System.out.print(p.getPrice()+" "+p.getModel());
			
		}
		return pros;
	}
	
	
	//4. 특정고객이 구입한 물건중 가장 고가의 상품의 금액을 리턴하는 기능
	public int getMaxPriceProduct(Customer c, Product[ ] pros) {
		int maxPrice = pros[0].getPrice();
		System.out.println("\n\n4)========= 고객님이 구입한 상품중 최고가 상품입니다 ====");
		for(Product p : pros) 
			maxPrice = p.getPrice();
		
		return maxPrice;
	}
	
	
}
