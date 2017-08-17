package array.primitive.test;

public class IdolFanAgeTest3 {

	public static void main(String[] args) {
		int[] idol = {10,20,30,40,50};
		
		//1.idol 두번째 칸의 연령대를 60으로 변경
		idol[1] = 60;
				
		//2.for문을 이용해서 idol전체 연령대를 출력
		for(int i=0; i<idol.length; i++) {
			System.out.println(idol[i]+" ");
		}
		System.out.println(" ");
		
		//3.30대를 초과하는 팬 연령층을 출력
		for(int i=0; i<idol.length; i++) {
			if (idol[i]>30)
				System.out.println(idol[i]+" ");
		}//for
		
		//4.idol 평균 연령대를 출력 
		int total=0;
		for(int i=0; i<idol.length; i++) {
			total+=idol[i];
		}//for
		System.out.println("\n평균 연력대 :: "+total/idol.length);
		
		
	}

}
