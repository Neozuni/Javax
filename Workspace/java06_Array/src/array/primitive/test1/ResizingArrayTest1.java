package array.primitive.test1;

public class ResizingArrayTest1 {
/*
 * array 특징
 * ::
 * 1.class datatype 이 주어져 있지 않다
 * langth를 반드시 알고 있자
 * 
 * 2.resizing 를 할수없다
 * 만약에 사이즈를 새로 잡으면 새로운 배열이 생성된다.
 * 이전에 3칸짜리 배열은 gc의 대상이 된다 .
 */
	public static void main(String[] args) {
		//1.3칸 짜리 배열을 생성  i 
		int[] i = new int[3];
		System.out.println("3칸 짜리 배열 i ;; " +i);
		
		//2.resizing 
		i = new int[7];
		System.out.println("3칸 짜리 배열 i ;; " +i);
		

	}

}
