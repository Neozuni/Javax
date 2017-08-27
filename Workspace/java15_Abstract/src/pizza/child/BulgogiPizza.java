package pizza.child;

import pizza.parent.Pizza;
/*
 * Pizza의 abstract method는 반드시 자식 클래스에서 구현해줘야 한다.
 * 부모 : abstract
 * 자식 : 완전한 메소드로 정의 { }
 */
public class BulgogiPizza extends Pizza{
	
	
	public BulgogiPizza(int price, String storeName) {
		super(price, storeName);		
	}

	@Override
	public void topping() {//void topping() ;
		System.out.println("Bulgogi Topping Pizza.....");	
	}

}











