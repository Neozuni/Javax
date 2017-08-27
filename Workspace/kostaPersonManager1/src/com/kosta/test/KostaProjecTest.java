package com.kosta.test;

import com.kosta.service.KostaService;
import com.kosta.vo.Manager;
import com.kosta.vo.Teacher;
import com.kosta.vo.Student;
import com.kosta.vo.Person;

public class KostaProjecTest {
	
	public static void main(String[] args) {
		
		Person p = new Person();

		//학생13명
		Person stu1=new Student("장동건","850921-1041522", 35, 30, 75);
		Person stu2=new Student("김태희","930111-2043523", 35, 30, 95);
		Person stu3=new Student("설현","880214-2041325", 26, 30, 90);
		Person stu4=new Student("카이","980513-1041228", 27, 30, 90);
		Person stu5=new Student("이국주","880314-2041528", 28, 30, 90);
		Person stu6=new Student("이홍기","880413-2043527", 28, 30, 90);
		Person stu7=new Student("김범수","780512-2044526", 35, 30, 90);
		Person stu8=new Student("권상우","880311-1045523", 25, 30, 60);
		Person stu9=new Student("성시경","780715-1046524", 35, 30, 60);
		Person stu10=new Student("이성경","780715-2046524", 26, 30, 60);
		Person stu11=new Student("주성수","780715-1046524", 25, 30, 69);
		Person stu12=new Student("차승원","980715-1046524", 27, 30, 60);
		Person stu13=new Student("김성령","880715-2046524", 23, 30, 70);

		//선생님 4명
		Person t1=new Teacher("박선생","550727-2030213", 45, 500, 10);
		Person t2=new Teacher("김선생","750615-1030114", 35, 400, 13);
		Person t3=new Teacher("이선생","650524-2033315", 45, 600, 25);
		Person t4=new Teacher("선선생","750413-2032316", 53, 350, 25);

		//매니져2명
		Person m1= new Manager("정대리", "800815-104141", 35, 250, "총무부");
		Person m2= new Manager("이대리", "800815-104142", 35, 200, "인사부");


		KostaService service = new KostaService();

		System.out.println("Method(1)멤버 추가");
		System.out.println("=========멤버 추가 결과 확인===========");
		service.addMember(stu1);
		service.addMember(stu2);
		service.addMember(stu3);
		service.addMember(stu4);
		service.addMember(stu5);
		service.addMember(stu6);
		service.addMember(stu7);
		service.addMember(stu8);
		service.addMember(stu9);
		service.addMember(stu10);
		service.addMember(stu11);
		service.addMember(stu12);
		service.addMember(stu13);
		service.addMember(t1);
		service.addMember(t2);
		service.addMember(t3);
		service.addMember(t4);
		service.addMember(m1);
		service.addMember(m2);
		for(int i=0;i<service.getPeople().length;i++){

			System.out.println(service.getPeople()[i]);
		}

		System.out.println();
		System.out.println("Method(2)멤버 삭제");
		//학생의 경우 총 수업일수 100일중 80일 미만을 제명시킴!! 
		System.out.println("=========멤버 삭제 결과 확인===========");
		service.expelMember(stu3);
		
		
		System.out.println();
		System.out.println("Method(3)멤버 수당인상");
		System.out.println("=========멤버 수당 인상 결과 확인===========");
		service.updateMember(stu1);

		
		System.out.println();	
		System.out.println("Method(4) 멤버 급여 검색");
		System.out.println("=========검색 결과 확인===========");
		service.findMember(t1);
		
		
		System.out.println();
		System.out.println("Method(5)30대 이상 멤버 찾기");
		System.out.println("=========멤버 검색 결과 확인===========");
		service.findMember(service.getPeople());

		
		System.out.println();
		System.out.println("Method(6)총급여액 및 재단 잔액확인");
		System.out.println("=========결과 확인===========");
		service.printSalaryNBalance(service.getPeople());







	}
}
