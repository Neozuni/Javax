package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf","1234");
		
		Scanner s = new Scanner (System.in);
		
		while(true) {
			System.out.println(" pls input y r id .");
			System.out.println("id: ");
			String id = s.nextLine().trim();
			System.out.println();
			
			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는존재하지 않습니다." + "다시입력해주세요 .");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
				}else { 
					System.out.println("아이디와 비밀번호가 일치합니다 . ");
					break;
				}
				
			}
					
			
		}
			
		

	}

}
