package ex05array;

public class ArrayEx1 {//배열의 기초예

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		char[] ch;//배열선언
		ch = new char[4]; //배열 초기화
		//배열 값의 할당
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		//배열내용 출력
		for(int i=0; i<ch.length; i++) {
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		for(char temp : ch) 
				System.out.println("temp : "+temp);
			
		
		}

	}


