package exception.test;

public class RuntimeExceptionTest4 {
	public static void main(String[] args) {
		System.out.println("========NullPointerException========");
		String str  = new String("KOSTA");
		str = null;
		try {
			System.out.println("str 문자열의 길이 :: "+str.length());
			System.out.println("str 주소값 :: "+str);//Overriding
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("잡았다1");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}/*catch(NullPointerException e) {
			System.out.println("잡았다2");
		}*/
	}
}
/*
 * catch는 여러번 가능하다.
 * 여러개 중에서 하나가 잡혔으면 나머지는 수행안된다.
 * e.printStackTrace() | e.getMessage()
*/











