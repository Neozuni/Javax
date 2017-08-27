package ch11;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4)); // list1에서 1~4자리의 숫자를 복사한다
		print(list1, list2);
		
		Collections.sort(list1); //list 1&2 를 정렬한다
		Collections.sort(list2); //Collections.sort(List 1)
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2)); // contains 지정된 객체에 포함되어 있는지 확인 
				
		list2.add("b");
		list2.add("c");
		list2.add(3,"a"); // 3칸에 a 삽입 
		print(list1, list2);
		
		list2.set(3, "aa");
		print(list1, list2);
		
		System.out.println("list1.reatainAll(list2) : " +list1.retainAll(list2) ); // list1 에서 list2에 있는 내용빼고 모두 삭제 
		print(list1,list2);
		
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)));
			list2.remove(i);
		}
		print(list1, list2);
		
}//main
	
	static void print (ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
	}
	
}//class
