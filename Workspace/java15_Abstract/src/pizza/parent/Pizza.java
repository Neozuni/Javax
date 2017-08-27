package pizza.parent;
/*
 * Pizza로서의 공통적인 것들은 field와 mathod로 정의하고
 * 다양한 될수있는 특징적인 기능을 추상적인 template로 선언
 */
abstract public class Pizza {
	private int price;
	private String storeName;
	
	public Pizza(int price, String storeName) {
		this.price = price;
		this.storeName = storeName;
	}
	//public Pizza() {	}
	
	//피자를 만들어내는 기능들...
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 만든다.");
	}
	
	public void bake() {
		System.out.println("180도에서 구워낸다.");
	}
	//abstract method
	public abstract void topping();
	
	public void cut() {
		System.out.println("8등분으로 잘라낸다.");
	}
	public void boxing() {
		System.out.println("종이상자에 담는다.");
	}
	
	//순차적인 기능을 한번에 다루는 기능을 추가
	public void makePizza() {
		dough();
		topping();
		bake();
		cut();
		boxing();
	}
	@Override
	public String toString() {
		return storeName+", "+price+" 원";
	}
}













