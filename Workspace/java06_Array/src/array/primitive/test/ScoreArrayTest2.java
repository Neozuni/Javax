package array.primitive.test;

public class ScoreArrayTest2 {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] score = {90,50,46,88,79};
		
		//1.for문을 이용해서 점수의 총합을 구하세요
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			
		}
		System.out.println("total score:: "+sum);
		//2.총점을 이용해서 평균점수를 출력
		avg = sum/score.length;//score.length배열의 사이즈를 구함 
		System.out.println("평균은 :: "+avg);
		
		// !!! 이거 다시 이해 해야함 
		//3.평균 이하점수 들을 출력하고, 평균 이하점수를 받은  
		//사람의인원수도 함께 출력
		int count = 0; 
		for(int i=0; i<score.length; i++) {
			if(score[i]<=avg) {
				count++;
				System.out.println(score[i]);
			}//if
		}//for
		System.out.println("평균점수 이하점을 받은 인원수:: " +count);
		//System.out.println(+count);
	}

}
