package jdbc.step2.test;
/*
 * member라는 테이블을 생성
 * CREATE TABLE member(
 * 			id varchar2(20),
 * 			name varchar2(20),
 * 			age number(3));
 * ::
 * 오라클에서 문자에 해당하는 데이타 타입은
 * 1)varchar2
 * 2)char
 * varchar2는 가변길이 문자열(String)로 최대 크기는 400바이트
 * 
 * char는 고정길이 문자열
 * ::
 * DML(명시적 commit 필요)  | DDL(auto commit)
 * 
 * INSERT INTO member VALUES( 'O', 'O', 0);
 * DELETE FROM member;
 * DELETE FROM member WHERE id='111' ;
 * UPDATE member SET age=40 WHERE id='222';
 * 
 * --------------------------------------------
 * SELECT * FROM member;
 * SELECT name, age FROM member;
 * SELECT name, age FROM member WHERE id='777';
 * 
 * -------------------------------------------------------
 * 
 * CREATE TABLE member( id varchar2(20));---auto commit
 * DROP TABLE test PURGE; 
 * -------------------------------------------------------
 * 
 * 1. TEST 라는 테이블을 생성
 *    ssn number(5)
 *    name varchar2(30)
 *    address varchar2(50)
 * 2. data를 입력 (3줄)
 * 3. 특정한 데이타 하나를 삭제
 * 4. 두 개의 데이타중 하나의 주소와 이름을 동시에 수정
 * 5. select로 표시함
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC4StepTest1 {
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	public static final String URL ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static final String USER = "hr";
	public static final String PASS = "hr";
	
	JDBC4StepTest1()throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....Success!!");
		
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("DBConnection.....success!!!");
		
		/*
		 * Query문을 수행(executeQuery() | executeUpdate())
		 * - Statement를 생성
		 * - sql문을 작성-> 실행
		 */
		
		Statement st=conn.createStatement();
		System.out.println("Statement Creating.....");
		
		/*String query1 = "INSERT INTO member VALUES('kosta','아이유','244' )";
		int i=st.executeUpdate(query1);
		System.out.println(i);*/
		
		/*String query2 = "DELETE FROM member WHERE age=24";
		System.out.println(st.executeUpdate(query2)+" ROW DELETE!!");
		*/
		
		String query3 = "SELECT * FROM member";
		ResultSet rs=st.executeQuery(query3);
		System.out.println("================================");
		while(rs.next()) {
			System.out.println(rs.getString("id")+"\t|"
						     + rs.getString("name")+"\t|"
						     + rs.getInt("age"));
		}
		System.out.println("===============================");
	}
	public static void main(String[] args) throws Exception{
		new JDBC4StepTest1();
	}
}









