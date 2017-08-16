package kosta.cons.test;

import kosta.cons.Car;
import kosta.cons.Engine;

public class CarAppTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Avante", 'W', 25000000.0F);
		Car car3 = new Car("Rexton", 'B', 36000000.0F, new Engine("kosta", 200));
		
  		
		System.out.println(car1.getDetails());
		System.out.println(car2.getDetails()+" "+car2.getEngine().getEngineInfo());
		System.out.println(car3.getDetails()+" "+car3.getEngine().getEngineInfo());
		
	} 
}




 

