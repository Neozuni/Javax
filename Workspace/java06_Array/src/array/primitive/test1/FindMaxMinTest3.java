package array.primitive.test1;
/*
 * 최대값 최소값을 구하는 기술을 생각해봅시다..
 */
public class FindMaxMinTest3 {

	public static void main(String[] args) {
		int[ ] score = {79,88,91,31,100,55,95};
		
		//for문을 사용해서 이중에서 가장 큰 값을 찾아서 출력 
		
		/*
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max<score[i])
				max = score[i]; 
				
			}
		*/
		
		//향상된 for문 
		// 뭐가 어디서 도는? index 개념이 없다 
		
		
		int(int i : score){
			if(max<score[i])
				max = score[i]; 
		}
		for(int i=1; i<score.length; i++) {
			if(min>score[i])
				min = score[i]; 
						
			}
		
				
		System.out.println("최대값 :: "+max);
		System.out.println("최소값 :: " +min);

	}

}
