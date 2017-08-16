package reference.test;

import reference.service.ProductStoreService;
import reference.vo.ProductVO;

public class ProductServiceTest4 {
	public static void main(String[] args) {
	ProductVO[ ] pros = {
			new ProductVO(111, "공기방울 세탁기", "대우", 450000),
			new ProductVO(222, "평면티비", "삼성", 2350000),
			new ProductVO(333, "청정 에어콘", "대우", 800000),
			new ProductVO(444, "드봉샴푸", "CJ", 9000)
	};
	ProductStoreService service = new ProductStoreService();
	System.out.println("============ All Product Model Print =================");
	service.printAllProduct(pros);
	
	System.out.println("\n============ All Product Total Price =================");
	System.out.println(service.getTotalPrice(pros)+" 원");
	
	System.out.println("\n============ More Average Price Products=================");
	ProductVO[ ] retProducts=service.getProductsOverAvg(pros);
		for(ProductVO v : retProducts) {
			if(v==null) continue;
			System.out.println(v.getMaker()+" "+v.getModel()+" "+v.getPrice());
		}	
	
	System.out.println("\n============ printProductByMaker=================");
	service.printProductByMaker("대우", pros);
	}
}

