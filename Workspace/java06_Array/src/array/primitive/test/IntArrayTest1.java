package array.primitive.test;

public class IntArrayTest1 {
/*
 * Array
 * ::
 * 같은 데이터 타입을 가지는 여러개의 다른 값들이 
 * 하나의 변수를 통해서 한방에 처리되는것 
 */
	public static void main(String[] args) {
		//1.배열선언
		int[] i;
		
		//2.배열생성:(new사용 | size명시) heap 에 올라가고 기본값은 '0'이다 
		i = new int[3];
		
		//설정된 값은 모두 0 이므로 0 0 0출력된다 
		System.out.println("1.묵시적 초기화 진행");
		for(int arr=0; arr<3; arr++) {
			System.out.print(i[arr]+" ");
		}
		
		//3.초기화 = 새로운 값을 할당한다는 의미다
		i[0] = 11;
		i[1] = 22;
		i[2] = 33;
		System.out.println("2.명시적 초기화 진행");
		for(int arr=0; arr<3; arr++) {
			System.out.print(i[arr]+" ");
		}
	System.out.println("/n Array객체 :: "+i);
		

	}

}
