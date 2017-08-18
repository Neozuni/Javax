package poly.arg.step2;
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
	Product[ ] items = new Product[10];
	int index = 0;
	
	public void buyProduct(Product p) {
		//items에 상품을 담는다.
		if(money<p.price) {
			System.out.println("상품가가 넘 높아요");
			return;
		}
		money-=p.price;
		bonusPoint+= p.bonusPoint;
		items[index++] = p;
		System.out.println(p+" 를(을) 구입하셨습니다.");
	}
	
	public void refund(Product p) {
		//환불하고자 하는 pNumber와 같다면 해당 p를 제거
		for(int i=0; i<items.length; i++) {
			if(p.getpNumber()==items[i].getpNumber()) {
				//i번쨰에 해당하는 상품을 뒤에 상품이 계속 덮어쓴다
				for(int j=i; j<items.length-1; j++) 
					items[j] = items[j+1];
				break;
			}//if
		}//for
		
		//제거됬는지 확인하는 로직
		for(int k=0; k<items.length; k++) {
			System.out.println(items[k]);
		}
		
		money += p.price;
		bonusPoint -= p.bonusPoint;
		System.out.println(p+" 을(를) 환불처리 하셨습니다. ");
	}
	
	public void summary() {
		/*
		 * for 문을 돌면서 구입한 물건의 총합과 총목록을 출력
		 */
		int sum = 0;
		String itemList = "";
		for(Product p : items) {
			if(p==null) break;
			sum += p.price;
			itemList += p+" ";
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





















