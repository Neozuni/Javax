package com.kosta.service;
import com.kosta.vo.Person;

public class PersonManagerService {
	
	/*public void addMember(Person[] p){
		
	}
	*/
	public void delMember(Person p){
		
		for(int i=0; i<items.length; i++) {
			if(p.getstuNum() == items[i].getstuNum()) {
				
				for(int j=i; j<items.length-1; j++) 
					items[j] = items[j+1];
				break;
			}//if
		}//for
		
		for(int k=0; k<items.length; k++) {
			System.out.println(items[k]);
		}
				
		System.out.println(p+" 학생이 삭제 되었습니다.");
	
	}

		
	
	/*}
	public void findMember(Person p){
		
	}
	
	public void findMember(Person[] p){
		
		
	}
	public void updateMember(Person[] p){
		
	}
*/	
	
	
	
	
	

}
