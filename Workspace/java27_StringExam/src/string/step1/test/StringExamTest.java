package string.step1.test;

import java.util.StringTokenizer;

/*
 * String Class(char[ ])
 * ::
 * 변하지 않는(Immutable) 문자열 상수를 다루는 클래스
 * 스트링 클레스에서 제공하는 메소드를 이용해서 문자열이
 * 변경될 때마다 계속해서 문자열 객체가 생성됨.
 * 문자열이 생성될때마다 Heap에 객체가 계속 만들어지기 떄문에
 * 문자열 조작, 변경이 빈번할 경우 String을 사용하면
 * 메모리 효율성을 떨어뜨리는 결과를 초래한다.
 * ::
 * StringBuffer 혹은 (StringBuilder) 사용을 권장
 */
public class StringExamTest {
	public static void main(String[] args) {
		System.out.println("======length(), replace(), substring()================");
		String str1= "아이유     ";//5
		String str2= "아이유 ";//1
		String str= "아이유";//0
		System.out.println("1. str객체의 문자열 길이 : "+str.length());
		
		String str3=str.replace('유', '리');
		System.out.println("2. 아이유의 '유'--> '리'로 변경 :: "+str);
		System.out.println("2. 아이유의 '유'--> '리'로 변경 :: "+str3);
		
		//'아이유'만 출력되도록
		//String str4=str.substring(1, 3);
		String str4=str.substring(1);
		System.out.println("3 이유만 출력 :: "+str4);
		
		System.out.println(str); //문자열 상수
		
		System.out.println("=============trim() :: 앞,뒤 공백을 제거 ============");
		
		String s1 = "제임스고슬링";
		String s2 = " 제임스 고슬링";
		String s3 = "제임스 고슬링 ";
		if(s1.equals(s2))
			System.out.println("Same Data1?");
		if(s1.equals(s2.trim()))
			System.out.println("Same Data2");
		if(s2.trim().equals(s3.trim()))
			System.out.println("Same Data3");
		
		System.out.println("=============s1.equals(s2) ============");
		if(s1.equals(s2.replace(" ", "")))
				System.out.println("공백제거 성공!!");
		
		System.out.println("\n==========indexOf(), charAt()====================");
		System.out.println("======s1에서 '고'에 해당하는 index를 리턴받아 출력 :: "+s1.indexOf('고'));		
		System.out.println("\n======s1에서 index 3에 해당하는 char를 리턴받아 출력 :: "+s1.charAt(3));
		
		/*
		 *  이번에는 공백을 기준으로 문자를 나누는 것이 아니라
		 *  , / 이런것들을 기준으로 문자열을 나누는 방법을 알아야한다.
		 */
		System.out.println("\n=============sprit()==============");
		String star = "아이유, 이효리, 김상순, 빅뱅 , 아이유, 태양";
		
		String[ ] starArr=star.split(",");
		for(String s : starArr) {
			System.out.println(s);
		}
		
		System.out.println("\n=============StringTokenizer==============");
		StringTokenizer st = new StringTokenizer(star, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("\n=============Self Test==============");
		String ss = "돌고래 팬더 나무늘보 미어캣 톰슨가젤        코모도";
		/*
		 * sprit() - space를 모두가 인식한다.
		 * StringTokenizser 사용 -space를 아무리 많이 줘도 하나로 인식
		 */
		String[ ] ssArr =ss.split(" ");
		for(String s : ssArr) {
			if(!s.equals(""))
			System.out.println(s);
		}
		System.out.println(" ");
		StringTokenizer st1 = new StringTokenizer(ss);
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println(" ");
		System.out.println("=============startsWith(), endsWith()=======");
		String start = "오늘 점심 메뉴는 뭘로 하실 건가요?";
		System.out.println("startsWith() :: "+start.startsWith("점심"));
		System.out.println("startsWith() :: "+start.startsWith("오늘 점심"));
		System.out.println("endsWith() :: "+start.endsWith("요?"));
		
		System.out.println(" ");
		System.out.println("===========toUpperCase(), toLowerCase()========");
		String lower = "james gosling";
		String upper = "JAMES GOSLING";
		System.out.println("JAMES GOSLING으로 변경 :: "+lower.toUpperCase());
		System.out.println(lower.equalsIgnoreCase(upper));
	}

}
