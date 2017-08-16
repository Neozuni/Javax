package reference.test;

import reference.vo.Person;

public class PersonArrayTest2 {
	public static void main(String[] args) {
		//선언 + 생성 + 초기 화를 한번에   
		Person[ ] people = {
				new Person("이효리", 37),
				new Person("이상순", 39),
				new Person("아이유", 27)
				
		}; // array
		
		//향상된 for문을 이용해서 객체들의 내용을 콘솔로 출력 
		//for (int i : persons) {
		
		for(int i=0; i < people.length; i++){
			people[i].display();
		}//for
		
	}//class
}//class
	











