package org.edu.test;

import java.util.ArrayList;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.service.EducationService;
import org.edu.util.MyDate;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationServiceTest {
	public static void main(String[] args) {
		EducationService service = new EducationService(10);
		
		Person s1 = new Student(111, "아이유", "도봉동", new MyDate(1993, 1, 1), "st11");
		Person s2 = new Student(222, "이효리", "도봉동", new MyDate(1993, 2, 2), "st22");
		Person s3 = new Student(333, "김상순", "여의도", new MyDate(1990, 1, 11), "st33");
		Person e1 = new Employee(444, "클라라", "삼평동", new MyDate(1980,3,3), "기획부");
		Person t1 = new Teacher(555, "이재용", "신사동",  new MyDate(1969,5,3), "디자인");
		Person t2 = new Teacher(666, "이정재", "혜화동",  new MyDate(1978,6,3), "수학");
		
		System.out.println("==============addPerson()==================");
		try{
			service.addPerson(111,s1);
			service.addPerson(222,s2);
			service.addPerson(333,s3);
			service.addPerson(444,e1);
			service.addPerson(555,t1);
			service.addPerson(666,t2);
			service.addPerson(111,s1);
		}catch(DuplicateSSNException e){
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("==============deletePerson()==================");
		try {
			service.deletePerson(333);
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
			
			/*
		System.out.println("==============finePerson()==================");
			System.out.println(service.findPerson(111));
			
			System.out.println("==============finePerson()2==================");
			ArrayList<Person> returnList=service.findPerson("도봉동");
			System.out.println(returnList);
		System.out.println("==============updatePerson()==================");
		try {
			service.updatePerson(new Employee(444, "클라라", "삼평동22", new MyDate(1980,3,3), "재무부"));
			service.getPersons();
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}*/
	}
}















