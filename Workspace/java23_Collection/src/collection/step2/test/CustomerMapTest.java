package collection.step2.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import collection.step2.vo.Customer;

public class CustomerMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Customer> map = new HashMap<Integer, Customer>();
		
		map.put(111, new Customer(111, "hr",35));
		map.put(222, new Customer(112, "ss",36));
		map.put(333, new Customer(113, "iy",27));
		
		System.out.println(map.get(222)); // 키를 알때는 가능 
		/*
		 * id 값이 111인 객체를 찾아서 그 사람의 이름을 출력 
		 */
		
/*		//방법1
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int id = it.next();
			map.get(id);
			Customer custom = map.get(id);
			if (custom.getCustID() == 111)
				System.out.println("아이디가 111 인 사람 이름은 " +custom);
			
		}//while
		
		//방법2
		Collection<Customer> collection=map.values();
		for(Customer c : collection) {
			if(c.getCustID()==111)
				System.out.println(c.getName());
		}//if
		
		//	방법3 
		Set<Entry<Integer, Customer>> s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Entry) i.next();
			Customer custom=(Customer) e.getValue();
			if(custom.getCustID()==111)
			System.out.println("id가 111인 사람은 "+custom.getName());
		}
*/		
		//3.고객들 나이의 총합을 구해라
		int custAllAge = 0;
		Collection<Customer> coll=map.values();
		for(Customer c : coll) {
			custAllAge+= c.getAge();
		}
		System.out.println("평균연령 : "+custAllAge/map.size());
			
	}
}
