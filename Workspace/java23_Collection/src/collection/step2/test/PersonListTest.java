package collection.step2.test;

import java.util.ArrayList;
import java.util.List;

import collection.step2.vo.Person;

public class PersonListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("아이유", 24, "여의도"));
		list.add(new Person("아삼유", 14, "강남"));
		list.add(new Person("아사유", 34, "종로"));
		list.add(new Person("아오유", 44, "분당"));
		list.add(new Person("아육유", 54, "여의도"));
		
		//1. list에 저장된 사람의 수는
		System.out.println("===1. 사람수는 ? ::"+list.size());
		
		//2. 첫번째 저장된 사람을 찾아서 그 사람의 주소를 출력
		System.out.println("===2. 첫번째 사람의 주소 :: "
					+list.get(0).getAddress());
		
		//3. 모든 사람의 나이의 합
		int total = 0;
		for(Person p : list) {
			total += p.getAge();
		}
		System.out.println("===3. 나이의 합 :: "+total);
		
		//4. 평균연령
		System.out.println("===4. 평균연령 :: "+total/list.size());
		
		//5. 동일한주소(여의도)에 사는 사람이 몇명인지를 구하고
		// 해당 주소에 사는 사람의 정보를 출력
		int count = 0;
		for(Person p : list) {
			if(p.getAddress().equals("여의도")) {
				 count++;
				 System.out.println(p);
			}//
		}//
		
		System.out.println("여의도에 거주하는 사람은 "+count+" 명입니다");
	}
}



