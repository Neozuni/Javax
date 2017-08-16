package array.primitive.test1;
/*
 * array는 resizing 안되지만
 * size 다른 array의 데이터는 복사해 올수 있다
 * ::
 * 1,2,3,99,88,77,66,55,44,33 
 * System.arraycopy() --> 배열의 내용을 복사할수 있다
 * for이용해서 target를 출력 하면 데이타의 내용이 복제된것이 나와야 한다.
 * 
 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
 * 
 */ 
public class ArrayCopyTest2 {

	public static void main(String[] args) {
		int[ ] target = {1,2,3,4,5,6,7,8,9,10};
		int[ ] source = {99,88,77,66,55,44,33};
		
		System.arraycopy(source, 0, target, 3, source.length);
		
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]+" ");
		}
		

	}

}
