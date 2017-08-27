package com.kosta.service;


import com.kosta.vo.Manager;
import com.kosta.vo.Person;
import com.kosta.vo.Student;
import com.kosta.vo.Teacher;

public class KostaService {

	int account=100000;

	private Person[] people = new Person[20];

	int index=0;


	//메소드1
	public void addMember(Person p){
		getPeople()[index]=p;
		index++;	
	}


	//메소드2
	public void expelMember(Person p){
		for(int i=0;i<getPeople().length;i++){
			if(p.getSsn()==getPeople()[i].getSsn()){
				if(p instanceof Student){
					Student stu=(Student)p;
					if(stu.getTotalAttendDay()<80){

						for(int j=i;j<getPeople().length-1;j++)
							getPeople()[j]=getPeople()[j+1];
						break;


					}else{
						System.out.println("퇴교 조건에 미충족됩니다.");
						return;
					}
				}else{
					for(int j=i;j<getPeople().length-1;j++)
						getPeople()[j]=getPeople()[j+1];
					break;

				}
			}

		}	

		for(int k=0;k<getPeople().length;k++){
			System.out.println(getPeople()[k]);
		}




	}

	//메소드3
	public void updateMember(Person p){
		int newSalary=0;
		if(p instanceof Student){
			newSalary=p.getSalary()*2;
			p.setSalary(newSalary);
		}else if(p instanceof Teacher){
			newSalary=p.getSalary()*4;
			p.setSalary(newSalary);
		}else if(p instanceof Manager){
			newSalary=p.getSalary()*3;
			p.setSalary(newSalary);
		}

		System.out.println(p.getName()+"님의 월급은 "+newSalary+"로 증가되었습니다");
	}

	//메소드4
	public void findMember(Person p){

		System.out.println(p.getName()+"님의 월급은"+p.getSalary()+"입니다");

	}

	//메소드5
	public void findMember(Person[] p){
		for(int i=0;i<getPeople().length;i++){
			if (getPeople()[i]==null) break;
			if(getPeople()[i].getAge()>30){
				System.out.println(getPeople()[i].getName());

			}
		}


	}

	//메소드6
	public void printSalaryNBalance(Person[] p){
		int sum=0;

		for(int i=0;i<getPeople().length;i++){
			if(getPeople()[i]==null) break;
			sum+=getPeople()[i].getSalary();

		}
		System.out.println("총 지출급여액은 "+sum+"만원입니다.");
		int balance=account-sum;
		System.out.println("재단의 남은 통장 잔액은"+balance+"만원 입니다");

	}


	public Person[] getPeople() {
		return people;
	}


	public void setPeople(Person[] people) {
		this.people = people;
	}














}

