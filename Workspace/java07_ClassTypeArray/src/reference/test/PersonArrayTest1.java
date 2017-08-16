package reference.test;

import reference.vo.Person;

public class PersonArrayTest1 {
	public static void main(String[] args) {
		//1. Person 타입의 배열을 생성..사이즈는 3  배열 이름은 p
		Person[ ] p = new Person[3];
		
		//2. for문을 돌려서 각각의 엘러먼트 요소값을 출력
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i]+"  ");
		}
	
		//3. Array 반찬통 주소값도 확인
		System.out.println("\n주소값 :: "+p);
		
		//4. 초기화
		p[0]  =new Person("이효리", 37);
		p[1]  =new Person("이상순", 38);
		p[2]  =new Person("아이유", 26);
		for(Person person : p) {
			System.out.println(person.getName()+" "+person.getAge());
		}
	}
}










