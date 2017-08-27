package step5.test;
/*
 *  싱글톤 패턴::
 *  하나의 클래스타입으로 오직 하나의 객체만을 생성하도록 하는 패턴
 *  1. 일단 객체하나를 생성한다.
 *  	private static 으로 지정해서 생성
 *  2.다른곳에서는 그 클래스 타입으로 객체를 생성하지 못하도록 막아둔다
 *   private 을 생성자 앞에 붙인다.
 *   3.만들어 놓은 객체를 여기저기서 빌어다 사용할수 있도록 열어둔다
 *   public static   
 */
class SunCompany{ // java instructor 을 배출하는 회사 
	private String companyName;
	// 1. sun 
	private static SunCompany sun = new SunCompany();
	
	//2. 
	private SunCompany() {
		companyName = "sun microsystems";
		System.out.println("Company name ::  "+companyName);
		
		//3만들어 놓은 것을 다른곳에서 쓸것
		public static SunCompany getCompany() {
			return sun;
		}
		
	}
}
public class SingletoneTest {

	public static void main(String[] args) {
		//SunCompany sun2 = new SunCompany();
		SunCompany com1 = new SunCompany.getCompany();
		SunCompany com2 = new SunCompany.getCompany();
		SunCompany com3 = new SunCompany.getCompany();
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}

}
