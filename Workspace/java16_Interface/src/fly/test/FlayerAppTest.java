package fly.test;
import fly.Flyer;
import fly.impl.AirPlane;
import fly.impl.Bird;
import fly.impl.Eagle;
import fly.impl.SuperMan;

public class FlayerAppTest {

	public static void main(String[] args) {
		//Flyer f = new Flyer() { //  interface 인데 new 를 사용할수 있는 이유 ? 는 어나미머스 클래스가 플라이어 앞에서 실행되기 때문 
			// 어나미머스는 이름이 없다 ...즉 부를 필요없다 왜냐하면 한번만 쓰고 말아서  

		Flyer f1 = new Bird();
		Flyer f2 = new SuperMan();
		Flyer f3 = new AirPlane();
		Bird f4 = new Eagle();
		
		// Virtual Method Invocation
		f1.fly();
		f2.fly();
		f3.fly();
		System.out.println(f4.fly());
		
		if(f1 instanceof Bird) {
			Bird b = (Bird)f1;
			System.out.println(b.layEggs("참새"));
			System.out.println(Flyer.color);
		}
	

}//main
}//class
	
