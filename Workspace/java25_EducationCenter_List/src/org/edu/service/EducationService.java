package org.edu.service;

import java.util.ArrayList;

import org.edu.exception.DuplicateSSNException;
import org.edu.exception.RecordNotFoundException;
import org.edu.vo.Employee;
import org.edu.vo.Person;
import org.edu.vo.Student;
import org.edu.vo.Teacher;

public class EducationService {
	private ArrayList<Person> list;
	
	public EducationService(int size){
		list = new ArrayList<Person>();
	}
	
	public void addPerson(Person per)throws DuplicateSSNException{
		boolean found = false; //추가할 사람이 발견되지 않음
		for(Person p : list) {
			if(p.getSsn()==per.getSsn()) { //이미 사람이 있다
				found = true;
				throw new DuplicateSSNException(per.getName()+" :: 그런 사람 이미 있어요..");
			}
		}//for
		
		if(found==false) list.add(per);
		System.out.println(per.getName()+" 님이 회원으로 등록되었습니다..");

	}
	
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		boolean found = false;
		for(Person p : list) {
			if(ssn==p.getSsn()) {
				found = true;
				System.out.println(p.getName()+" 님이 탈퇴하셨습니다");
				list.remove(p);
				break; //				
			}
		}//
		
		if(found==false) throw new RecordNotFoundException("삭제할 대상이 없어요");
		
	}
	/*
	 * ssn을 조건으로 주어 특정한 사람을 찾아서 리턴하는 로직
	 */
	public Person findPerson(int ssn){
		Person person = null;	
		for(Person p : list) {
			if(ssn==p.getSsn())
				person = p;
		}
		return person;
	}
	
	public ArrayList<Person> findPerson(String address){
		ArrayList<Person> temp = new ArrayList<Person>();
		
		for(Person p : list) {
			if(address.equals(p.getAddress()))
				temp.add(p);			
		}
		System.out.println(address+" 에 사는 사람은 "+temp.size()+" 명입니다.");
		return temp;
	}
	/*
	 * 수정할 사람이 없다면 RecordNotFoubndException을 터뜨린다.
	 * ssn은 수정의 대상이 아니다.
	 */
	public void updatePerson(Person person)
			throws RecordNotFoundException{//인자값??
		boolean found = false;
		
		for(Person p : list) {
			if(person.getSsn()==p.getSsn()) {
				
				p.setAddress(person.getAddress());
				if(p instanceof Employee) {
					Employee e1=(Employee)p;
					e1.setDept(((Employee)person).getDept());
				}
				if(p instanceof Student) {
					Student s1=(Student)p;
					s1.setStuId(s1.getStuId());
				}
				if(p instanceof Teacher) {
					Teacher t1=(Teacher)p;
					t1.setSubject(t1.getSubject());
				}
			}//if
		}//for
	}	
	public void getPersons(){
		
	}
}


























