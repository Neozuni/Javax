package ex04control;
import java.io.*;

public class DoWhileEx { //사용자 입력메뉴 제한하기 !!
	public static void main(String[] ar)throws IOException {
		// TODO Auto-generated method stub
		int menu = 0;
		do {
			System.out.println("1.Join");
			System.out.println("2.Search");
			System.out.println("3.Out");
			System.out.println("0.exit");
			System.out.println("choose a menu: ");
			menu = System.in.read()-48;
			System.in.read();System.in.read();
		}while(menu!=1 && menu!=2 && menu!=3 && menu!=0);
			System.out.println("choose the menu is "+menu);
			
					
		}//main

	}//class

