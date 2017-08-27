package com.store.service;

import com.store.vo.Customer;
import com.store.vo.Product;

public class OuletStoreService {
	public void printAllProductName(Customer c, Product[] pros) {
		System.out.println("1) ===== "+c.getCustName()+" 님이 구입하신 상품입니다. ===");
		for(Product p : pros)
			System.out.println(p.getModel()+" ");
			//System.out.println(" ");
		
	}
	
	public void printAllProductName2(Customer c,Product[] pros) {
		System.out.println("1) ===== "+c.getCustName()+" 님이 구입하신 상품 및 가격 입니다. ===");
		for(Product p : pros) 
			System.out.print(p.getModel()+"\t");
			System.out.println(" ");
		
		for(Product p1 : pros) 
			System.out.print(p1.getPrice()+"\t\t");
			System.out.println(" ");
		
	}
	
	public void printAllCustomer(Customer[] custs) {
		System.out.println("\n2)=== below is all of custmers infomation ===");
		for(Customer c : custs)
			System.out.println(c.getSsn()+","+c.getCustName()+","+c.getAddress());
	}//all customer
	
	public int getMaxPriceProduct(Customer c, Product[] pros) {
		int maxPrice = pros[0].getPrice();
		System.out.println("\n\n4)========= 고객님이 구입한 상품중 최고가 상품입니다 ====");
		for(Product p:pros)
			maxPrice = p.getPrice();
		return maxPrice;
		
	}
	
/*	
	public Product[] getAllProduct(Customer c, Product[] pros) {
		System.out.println("\n 3) next items is over 10man product");
		System.out.println(c.getCustName()+ " 님께서 구입한 물건 입니다.");
		for(Product p : pros) {
			if(p.getPrice()>=100000)
				System.out.println(p.getPrice()+" "+p.getModel());
		}*/
		
	}


