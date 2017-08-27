package collection.step1.test;

import java.util.ArrayList;
import java.util.List;
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("이효리");
		list.add("김상순");
		list.add("아이유");
		//Collection에서는  toString()이 오버라이딩
		//데이타 출력으로 
		System.out.println(list);
		System.out.println("1. list에 들어있는 데이타의 갯수::"+list.size());
		
		//1. 두번째 데이타를 삭제
		list.remove(1);
		System.out.println("remove() :: "+list);
		
		//2. 마지막 데이타를 효리로 수정
		list.set(2, "효리");
		System.out.println("set() :: "+list);
		
		//3. list안에 데이타가 하나라도 있다면 모든 데이타를 삭제
		if(!list.isEmpty()) 
			list.clear();
		
		System.out.println("clear() :"+list);
		
		//4. 첫번째 저장된 이름을 리턴받아서
		// 첫번째 이름을 출력
		list.add("KOSTA");
		String firstName=list.get(0);//Casting이 필요없다
		System.out.println("첫번째 이름 get() :: "+firstName);		

	}
}
/*
 * get() | add()| boolean remove(Object), remove(index) | set() 
 * isEmpty() | size()
 * 자체적으로 toString()이 데이타 출력으로 오버라이딩되어 있다.
 */












