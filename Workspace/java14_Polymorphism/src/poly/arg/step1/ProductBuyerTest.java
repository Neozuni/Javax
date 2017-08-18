package poly.arg.step1;
public class ProductBuyerTest {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();
		
		buyer.buyTV(tv);
		buyer.buyComputer(com);
		System.out.println("현재 남은 금액은 " +buyer.money);
		System.out.println("현재 적립된 포인트는 " +buyer.bonusPoint);
		
	}

}


class Product{
	int price;
	int bonusPoint;
	//상품이 만들어질떄 그때 가격도 함께 정해짐 . (생성자에 가격이 들어간 이유 ??)
	// 이때 보너스도 함께 지정됨. (상품가의 10%가 보너스가됨 )
	Product(int price){ // 생성자
		this.price = price;
		bonusPoint = (int)(price/10); // (int)는 형변환 ~ 0.1 보다 10이 더욱사용이 좋다
						
	}
}// product


// 자식생성 서브클래스 
class TV extends Product{ // tv는 생성시 생성자가 없으면 줄감
	TV(){
		super(150);
	}
	@Override
		public String toString() {
		return "TV";
	}
	
}

//자식생성 서브클래스 
class Computer extends Product{ // tv는 생성시 생성자가 없으면 줄감
	Computer(){
		super(100);
	}
	@Override
		public String toString() {
		return "Computer";
	}
	
}

// Service class
class ProductBuyer{
	int money = 1000; // 일천만원 보유금액을 설정함 
	int bonusPoint = 0; // 현재 포인트는 0 구입한 물건이 현재 없다 .
	
	public void buyTV(TV tv) { // 기능생성 
		/*
		 * 가진돈보다 물건의 가격이 작거나 같을때만 살수 있다.
		 * 상품의 가격만큼 돈은 빠지고 /
		 * 상품가의 10% 만큼 보너스 포인트는 올라가고
		 * 최종적으로 구입한 물건의 정보를 출력 
		 */
		if(money<tv.price) {
			System.out.println(" 잔액이 부족해서 구입이 불가능 합니다. ");
			return; // buyTV()호출하기 전으로 되돌린다.
			
		}
		// 상품 사는 로직을 전개 
		money -=tv.price;
		bonusPoint +=tv.bonusPoint;
		System.out.println(tv+ "를 구입 하셨습니다. " );
}
	
	public void buyComputer(Computer com) { // 기능생성 
		/*
		 * 가진돈보다 물건의 가격이 작거나 같을때만 살수 있다.
		 * 상품의 가격만큼 돈은 빠지고 /
		 * 상품가의 10% 만큼 보너스 포인트는 올라가고
		 * 최종적으로 구입한 물건의 정보를 출력 
		 */
		if(money<com.price) {
			System.out.println(" 잔액이 부족해서 구입이 불가능 합니다. ");
			return; // buyTV()호출하기 전으로 되돌린다.
			
		}
		// 상품 사는 로직을 전개 
		money -=com.price;
		bonusPoint +=com.bonusPoint;
		System.out.println(com+ "를 구입 하셨습니다. " );

	}
}

/* 
 * 문제점
 * ::
 * 1. buyTV(TV), byComputer(com)
 *   buyProduct(TV), buyProduct(Computer) - overloading 적용
 *    	buyProduct(Product p){ // Polymorism argument
 *    	if(p instanceof TV)
 *    	if(p instanceof computer)
 */
 
