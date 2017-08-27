package org.edu.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationService {
	private HashMap<Integer, Person> map;
	
	public EducationService(int size){
		map = new HashMap<Integer, Person>();
	}
	
	public void addPerson(int ssn,Person per)throws DuplicateSSNException{
		if(map.containsKey(ssn)) {
			System.out.println(ssn+" 번호를 가진 이가 이미 존재");
			throw new DuplicateSSNException("addPerson() call....");
		}else {
			map.put(ssn, per);
			System.out.println(per.getName()+" 님이 등록...");
		}
	}
	
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		Person p=map.remove(ssn);
		if(p==null) throw new RecordNotFoundException("삭제할 대상 없음");
		else System.out.println(ssn+" 님이 탈퇴!!");
	}
	
	
	
	public ArrayList<Person> findPerson(String address){
		ArrayList<Person> temp = new ArrayList<Person>();
		Collection<Person> c = map.values();
		for(Person p : c) {
			if(p.getAddress().equals(address))
				temp.add(p);
		}
		return temp;
	}
	
	public void updatePerson(Person person)
			throws RecordNotFoundException{//인자값??
		if(map.containsKey(person.getSsn()))
			map.put(person.getSsn(), person);
		else
			throw new RecordNotFoundException();
	}	
	
	public void printAllPersonInfo() {
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			int ssn = it.next();
			System.out.println("key :"+ssn+" \nPersonInfo ::"+
			map.get(ssn));
		}
	}
	
}


























