package collection.step2.test;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		set.add("james");
		set.add( "gosling");
		set.add("mike");
		set.add("team");
		System.out.println(set);
		
		TreeSet set2 = new TreeSet();
		set2.add(new Integer(10));
		set2.add(new Integer(100));
		set2.add(new Integer(10));
		set2.add(50);
		set2.add(11);
		System.out.println(set2);
		
	}

}
