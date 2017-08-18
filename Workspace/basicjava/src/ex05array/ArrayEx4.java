package ex05array;
import java.io.*;
/*
 * 실습 다차원 배열을 이용하여 여러명에 대해서 성적 처리하는 예제를 작성하자. 아래 예제의 경우 java ArrayEx4 학생수 과목명1 과목명2 과목명 n 과 
 * 같이 실행해야한다
 */
public class ArrayEx4 { // 입출력을 위하여 

	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		BufferReader br = new BufferReader(
				new InputStreamReader(System.in));
		int human = Integer.parseInt(ar[0]);//사람수 구하기
		String[] name = new String[human];
		String[] subject = new String[ar.length-1];// 과목명초기화 
		
		//점수와 총점 처리 배열
		int[][] jumsu = new int [human][ar.length];
		float[]	avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		for(int=0; i<ar.legth-1; i++) {
			subject[i] = ar[i+1];////과목명 가져오기
			
		}//for
		
		
		

	}

}
