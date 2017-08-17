package array.primitive.test1;
/*
 * 최대값 최소값을 구하는 기술을 생각해봅시다..
 */
public class FindMaxMinTest3 {

	public static void main(String[] args) {
		int[ ] score = {79,88,91,31,100,55,95,99};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max<score[i])
				max = score[i];
		}//max
		
		for(int j=1; j<score.length; j++) {
			if(min>score[j])
				min = score[j];
		}//min

		//향상된 for문 
		// 뭐가 어디서 도는? index 개념이 없다 
		
		
//		for(int i : score){
//			if(max<i) 
//				max = i; 
//		}
//		
//		
//		for(int i : score){
//			if(min>i)
//				min = i; 
//		}
				
		System.out.println("최대값 :: "+max);
		System.out.println("최소값 :: "+min);

	}

}
