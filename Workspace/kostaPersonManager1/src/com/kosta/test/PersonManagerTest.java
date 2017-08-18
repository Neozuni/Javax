package com.kosta.test;

import com.kosta.service.PersonManagerService;
import com.kosta.vo.Manager;
import com.kosta.vo.Person;
import com.kosta.vo.Student;
import com.kosta.vo.Teacher;

public class PersonManagerTest {
	
	public static void main(String[] args) {
		
		Person[] items = new Person[10];
		
		Person[] stu = { 
				new Student("박성수", 0103133, "서울시", 1510616, 25),
				new Student("주성수", 0103133, "서울시", 1510616, 25),
				new Student("기성수", 303133, "서울시", 1510616, 33),
				new Student("박성수", 4103133, "부산시", 330616, 29),
				new Student("박성수", 5103133, "서울시", 410616, 30),
		};
		
		Teacher[] t = {
				new Teacher("하자바", 01033, "서울", 30, 7000),
				new Teacher("김성수", 01033, "서울", 30, 6000),
				new Teacher("하자바", 543033, "서울", 30, 5000),
				new Teacher("하자바", 3333, "대전", 30, 4000),
				new Teacher("하자바", 23033, "서대구", 20, 8000),
				new Teacher("하자바", 01033, "부산", 20,9000)};
		       
		
		
		
		
		Manager[] m ={ 
				new Manager("정연우", 010333, "부산", 44332, "총무부"),
				new Manager("주성우", 010333, "인천", 44332, "인사부"),
			
		};
		
		PersonManagerService service= new PersonManagerService();
		
		service.delMember(303133);
				
		
		
		
	}

}
