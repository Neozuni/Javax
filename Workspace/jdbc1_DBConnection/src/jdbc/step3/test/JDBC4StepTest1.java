package jdbc.step3.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.OracleInfo;

/*
 * Primary key : unique + not null
 create table member(
 	id varchar2(20) primary key, 
 	name varchar2(30) not null,  
 	pass varchar2(30) not null,
 	tel varchar2(30) not null );
 	
 1) 컬럼명 추가 : alter table member add(address varchar2(10));
 2) 컬럼의 속성변경 : alter table member modify(address varchar2(50));
 3) 컬럼의 이름을 변경 : alter table member rename column pass to password;
 4) 컬럼명을 삭제 : alter table member drop column tel;
 */
public class JDBC4StepTest1 {
	
	
	JDBC4StepTest1()throws ClassNotFoundException, SQLException{
		Class.forName(OracleInfo.DRIVER);
		System.out.println("1.Driver Loading.....Success!!");
		
		Connection conn = DriverManager.getConnection(OracleInfo.URL, OracleInfo.USER, OracleInfo.PASS);
		System.out.println("2. DBConnection.....success!!!");
		
		System.out.println("3. ======= Preparedstatment use ======= ");
		String sql = "insert into member values(?,?,?,?)"; // ??? 처리 하고 컴파일 후에 바인딩 한다 .. 
		PreparedStatement ps = conn.prepareStatement(sql);
		System.out.println("3. Preparedstatment .....success!!!");
		
		ps.setString(1,"kosta");
		ps.setString(2,"iu");
		ps.setString(3,"1234");
		ps.setString(4,"seoul");
		
		//System.out.println(ps.executeUpdate()+" row Insert ok !!"); //한번 사용후 계속 실행하면 무결성 오류 발생함 
		
		//위에는 모두 열어서 사용함 연순서 반대로 닫아줌 
		ps.close();
		conn.close();
		
	}//constructor
	
	public static void main(String[] args) throws Exception {
		new JDBC4StepTest1();
		

	}//main

}//class
