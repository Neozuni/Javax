package pizza.child;
import pizza.parent.*;
/* 
 * 피자의 abstract metho는 반드시 자식 클래스에서 구현해줘야 한다
 * 부모 abstract
 * 자식 완전한 메소드로 정의 {}
 */

public class PotatoPizza extends Pizza {

	
	
	public PotatoPizza(int price, String storeName) {
		super(price, storeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void topping() {
		// TODO Auto-generated method stub
		System.out.println("Potato Topping Pizza ....");
		
	}
	
	/*public class CheesePizza extends Pizza {

		
		
		public CheesePizza(int price, String storeName) {
			super(price, storeName);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void topping() {
			// TODO Auto-generated method stub
			System.out.println("Cheese Topping Pizza ....");
			
		}
		
		
		public class PinePizza extends Pizza {

			
			
			public PinePizza(int price, String storeName) {
				super(price, storeName);
				// TODO Auto-generated constructor stub
			}

			@Override
			public void topping() {
				// TODO Auto-generated method stub
				System.out.println("Pine Topping Pizza ....");
				
			}
*/
		
	}

	
