package com.store.vo;

import com.store.util.MyDate;

/*
 * 상점에 입고되는 상품에 대한 정보를 담고 있는 vo클래스
 * ::
 * maker : String
 * model : String
 * serialNo : int
 * price : int
 * startDate : MyDate
 * 
 */
public class Product {
	private int serialNo;
	private String maker;
	private String model;
	private int price;
	private MyDate startDate;
	
	public Product(int serialNo, String maker, String model, int price, MyDate startDate) {
		super();
		this.serialNo = serialNo;
		this.maker = maker;
		this.model = model;
		this.price = price;
		this.startDate = startDate;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public String getMaker() {
		return maker;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public MyDate getStartDate() {
		return startDate;
	}

}













