package com.store.vo;

/*
 * 상품을 구입하는 고객에 대한 정보를 담는 vo 클래스 
 * ::
 * ssn : int
 * name : String
 * address : String
 * 생성자로 주입
 * -------
 * product : Product
 * 세터로 주입
 */

/*
 * ssn.custname.add는 생성자 주입
 * product[] 은 setter 로 주입
 * address 는 setter주입을 하나더 추가
 * 모든 필드에 대한 getter을 정의 한다 
 * 
 */


public class Customer {
	private int ssn;
	private String custName;
	private String address;
	
	private Product[] products;
	
	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.custName = name;
		this.address = address;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void changeAddress(String address) {
		this.address = address;
	}

	public int getSsn() {
		return ssn;
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}

	public Product[] getProducts() {
		return products;
	}
	
	
	
	
	
	
		
	
	

}
