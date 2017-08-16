package reference.service;

import reference.vo.ProductVO;

/*
 * ProductStore 에서 다양한 상품들을 다루는 기능만을 모아놓은 서비스 클래스
 * 해당 클래스에서 다루는 상품의 기능들 ..
 * 1) 모든 상품들의 이름을 출력하는 기능 :: 
 * 2) 모든 상품의 총금액을 리턴하는 기능 ::
 * 3) 모든 상품의 평균금액을 리턴하는 기능 ::
 * 4) 평균가 이상의 상품들을 리턴하는 기능 ::
 * 5) 특정한 제조사의 상품 정보를 출력하는 기능 ::
 * ::
 * ProductVO 클래스와 has a relation 관계
 * 인자값으로 hasing 한다 ...
 * 
 */
public class ProductStoreService {
	// 1) 모든 상품들의 이름을 출력하는 기능 ::
	public void printAllProduct(ProductVO[] pros) {
		for(ProductVO v: pros)
			System.out.println(v.getModel());
	}//printAllProduct
	
	// 2) 모든 상품의 총금액을 리턴하는 기능 ::	
		public int getTotalPrice(ProductVO[ ] pros) {
			int total = 0;
			for(ProductVO v : pros)
				total +=v.getPrice();
			return total;
						
		}//getTotalPrice
		
		
		//3)
		public int getAvgPrice(ProductVO[ ] pros) {
			return getTotalPrice(pros)/pros.length;
		}//getAvgPrice
		
		//4)
		public ProductVO[ ] getProductsOverAvg(ProductVO[ ] pros) {
			ProductVO[ ] temp = new ProductVO[pros.length];
			for(int i=0; i<temp.length; i++) {
				if(pros[i].getPrice()>=getAvgPrice(pros)) 
					temp[i] = pros[i];
				
			}
			return temp;
		}
		//5
		public void printProductByMaker(String maker,ProductVO[ ] pros) {
			for(ProductVO v : pros) {
				if(v.getMaker().equals(maker)) 
					System.out.println(v.getMaker()+" "+v.getModel());
				
			}//for
		}//printProductByMaker	
	}
