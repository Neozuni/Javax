package step4.test;
/*
 * 6 ::
 * 
 */
class Car{
	int serialNumber = 0; //필드 
	static int counter;
	
	 Car() {
		counter++;
		serialNumber = counter;
		
	}
	
}
public class StaticExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("=== non - static V ===");
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println("=== non - static V ===");
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);

		System.out.println("=== static V ===");
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		System.out.println("현재까지 생산된 총 차량의 수 ::  "+Car.counter);

	}

}
