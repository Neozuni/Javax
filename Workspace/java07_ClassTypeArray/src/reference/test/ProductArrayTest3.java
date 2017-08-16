package reference.test;
import reference.vo.ProductVO;

public class ProductArrayTest3 {
	public static void main(String[] args) {
		//1. ProductVO 타입의 배열 생성...사이즈 4..pros
		ProductVO[ ] pros = {
				new ProductVO(111, "공기방울 세탁기", "대우", 450000),
				new ProductVO(222, "평면티비", "삼성", 2350000),
				new ProductVO(333, "청정 에어콘", "대우", 800000),
				new ProductVO(444, "드봉샴푸", "CJ", 9000)
				
		};//array
		
		//1. 향상된 for문을 사용해서 각 제품들의 이름만 출력
		System.out.println("======= Model =======");
		for(ProductVO vo:pros) {
			System.out.println(vo.getModel());
			
			
		}//for
		 
		
		//2. 가격이 100만원 이상인 제품만 출력
		System.out.println("======= Over 100 =======");
		for(ProductVO vo: pros) {
			if(vo.getPrice()>=1000000)
				System.out.println(vo.getSerialNum()+vo.getModel()+vo.getPrice());
			
		}
		
		
		//3. 제조사가 대우인 상품이 있다면 해당 상품의 이름과 일련번호를 출력
		System.out.println("======= Over 100만 =======");
		for(ProductVO vo : pros) {
			if(vo.getMaker().equals("대우")) {
				System.out.println(vo.getModel()+vo.getSerialNum());
			}
		}
		

	}//main

}//class









