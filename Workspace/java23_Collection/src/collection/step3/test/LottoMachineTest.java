package collection.step3.test;
/*
 * Lotto Number를 생성
 * ::
 * 6개의 번호
 * 1~45번 중에서 임의의 번호가 뽑혀진다.
 * 이중에서 동일한 번호는 없어야 한다.
 * 번호는 순서대로 정렬되어져야 한다.
 * ::
 * TreeSet
 * 33,6,2,17,7,42
 * 2,6,7,17,33,42
 */

import java.util.TreeSet;

class LottoMachineService{
	public TreeSet<Integer> createLottoNumber(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(set.size()<6) {
			int number = (int)(Math.random()*45)+1;
			set.add(number);
		}
		return set;
	}
}
public class LottoMachineTest {
	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		TreeSet<Integer> set=service.createLottoNumber();
		System.out.println("당신이 추첨한 Lotto Number :: "+set);
	}
}








