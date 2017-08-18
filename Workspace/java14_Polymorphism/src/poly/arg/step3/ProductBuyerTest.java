package poly.arg.step3;

import java.util.Vector;

public class ProductBuyerTest {
	public static void main(String[] args) {
	/*	TV tv = new TV();
		Computer com = new Computer();*/
		Product tv = new TV();
		Product com = new Computer();
		Product audio1 = new Audio();
		Product audio2 = new Audio();
		
		ProductBuyer buyer = new ProductBuyer();
		
		tv.setpNumber(111);
		com.setpNumber(222);
		audio1.setpNumber(333);
		audio2.setpNumber(444);
		
		//상품을 4개 구입한다.
		buyer.buyProduct(tv);
		buyer.buyProduct(com);
		buyer.buyProduct(audio1);
		buyer.buyProduct(audio2);
		
		buyer.summary();
		System.out.println(" 현재 잔액 : "+buyer.money+" 만원");
		System.out.println(" 현재 포인트 : "+buyer.bonusPoint+" 점");
		
		buyer.refund(audio1);
		System.out.println(" 현재 잔액 : "+buyer.money+" 만원");
		System.out.println(" 현재 포인트 : "+buyer.bonusPoint+" 점");
		
	}
}
//super class
class Product{
	int price;
	int bonusPoint;
	int pNumber;//상품을 구분하는 유니크한 값
	
	//상품이 만들어질때 그때 가격도 함께 정해짐.
	//이때 보너스도 함께 지정됨.(상품가의 10%)
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10);
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	
	
}//Product

//Sub Class
class TV extends Product{
	TV(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}//TV

//Sub Class
class Computer extends Product{
	Computer(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}//Computer

class Audio extends Product{
	Audio(){
		super(80);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

//Service Class
class ProductBuyer{
	int money = 1000; //일천만원을 가지고 있음.
	int bonusPoint = 0; //현재 포인트는 0(구입한 물건이 현재 없다)
	//구입한 상품들을 저장하는 일종의 보관서
	Vector<Product> items = new Vector<Product>();
	int index = 0;
	
	public void buyProduct(Product p) {
		//items에 상품을 담는다.
		if(money<p.price) {
			System.out.println("상품가가 넘 높아요");
			return;
		}
		money-=p.price;
		bonusPoint+= p.bonusPoint;
		items.add(p);
		System.out.println(p+" 를(을) 구입하셨습니다.");
	}
	
	public void refund(Product p) {
		
		if(items.remove(p)) {
		System.out.println("=========================");
		money += p.price;
		bonusPoint -= p.bonusPoint;
		System.out.println(p+" 을(를) 환불처리 하셨습니다. ");
		} else {
			System.out.println(p+ "에 해당하는 물건이 없어서 환불이 불가능 합니다. ");
		}
		
	}
	
	public void summary() { // vertor 안에 내용을 출력 
		/*
		 * for 문을 돌면서 구입한 물건의 총합과 총목록을 출력
		 */
		int sum = 0;
		String itemList = "";
		if(items.isEmpty()) {//
			System.out.println("구입하신 물건이 없습니다... ");
			return;
		}
		
		for(int i=0; i<items.size(); i++) {
			Product pro = items.get(i);
			
			sum += pro.price;
			itemList += pro +" ";
		}//for
		
		System.out.println("구입한 상품의 총 금액 : "+sum+" 만원입니다.");
		System.out.println("구입한 상품의 총 목록 : "+itemList+" 입니다.");
	}	
}
/* 
 * 문제점 
 * ::
 * 1. buyTV(tv), buyComputer(com)
 *   |
 *    buyProduct(tv), buyProduct(com) - Overloading 적용
 *     |
 *     buyProduct(Product p){ //Polymorphic argument
 *     	if(p instanceof TV)
 *      if(p instanceof Computer)
 */





















