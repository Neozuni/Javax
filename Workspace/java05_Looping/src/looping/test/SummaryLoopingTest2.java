package looping.test;

/*
 * 1~10 까지의 총합을 반복문 로직 ..
 */
public class SummaryLoopingTest2 {
	public static void main(String[] args) {
		//로컬변수 선언된 위치로 구분함 (메소드 안)
		//기본값이 없기 때문.로컬변수는 반드시 초기화 하고 사용해야 한다. 그냥 하면 스택에 값없이 생성
		int sum = 0;
		System.out.println("========for 문을 이용한 총합 구하기 ===========");
		for(int i=1; i<=10; i++) {
			//sum=sum+i;
			sum +=i;
						
		}//for
		System.out.println("========while 문을 이용한 총합 구하기 ===========");
		int i=1;
		int sum2 = 0;
		while(i<=10) {
			sum2+=i;
			i++;
		}//while
		System.out.println("1~10까지의 총합 :: "+sum+" "+sum2);
	}//main
}

