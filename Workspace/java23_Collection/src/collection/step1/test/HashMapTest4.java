package collection.step1.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * ArrayList 
 * 30,40,50 20,50,100
 * ::
 * Primitive Type Data들은 Powerful하게 사용될 수 없다.
 * 기본형 타입                                   Class Type(Wrapper Class)
 * 
 * byte								Byte
 * short								Short
 * int									Integer
 * long								Long
 * float								Float
 * double							Double
 * char								Character
 * boolean							Boolean
 * 
 * int score = 80;
 * Integer score = new Integer(80);
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("아이유1", new Integer(80));
		map.put("아이유2", 90);
		map.put("아이유3", 50);
		map.put("아이유4", 35);
		map.put("아이유5", 78);
		//1
		
		//키값만 담아서 set에 저장
		System.out.println("============1. keySet() ============");
		Set<String> set=map.keySet();
		
		System.out.println(set);
		
		//2. Set의 기능을 이용해서 학생들의 이름과 점수를 출력
		System.out.println("=========2. iterator() | get(key)=========");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key+" :: "+value);
		}//while
		
		//3. 학생들의 점수만 출력 할수 있나 ??
		System.out.println("=========3. Values() =========");
		Collection<Integer> scores = map.values();
		System.out.println(scores + "  ");
		
		
		//4.
		/*
		 * score를 이용해서 총점과 평균점수를 구해서 출력 하세요
		 * 학생들의 점수중 최고점수를 출력
		 * ::
		 * 알고리즘을 사용 x | map 의 기능을 알아보는 시간
		 * 
		 */
		// Collection<Integer> scores = map.values(); 총점임
		

		int total = 0;
		Iterator<Integer> i=scores.iterator();
		while(i.hasNext()) {
			int score=i.next();
			total+= score;
		}
		System.out.println("총점 :: "+total+" 점");
		System.out.println("평균점수 :: "+total/map.size());
		System.out.println("최고점수 :: "+Collections.max(scores));
	}
}


