package basicJava;

public class PrinfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		char b = 'a';
		float c = 12.346f;
		String d = "이승재";
		//%d는 지시자 값의 출력
		//printf는 줄바꿈을 하지 않으므로 %n으로 줄바꿈
		System.out.printf("a=%d입니다.%n",a);
		System.out.printf("b=%c=%d%n",b,(int)b);
		System.out.printf("c=%6.2f%n",c);
		System.out.printf("d=%s입니다.",d);
	}

}
