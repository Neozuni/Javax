package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1. 드라이버 로딩
 *    : 디비서버 정보를 가지고 있는 드라이버 클래스를
 *      해당 클라이언트측 메모리에 로딩시킨다
 *      이 과정 없이는 다음 단계의 디비연결이 이뤄지지 않는다.
 * 2. 디비 연결
 *    : jdbc4 단계중에서 가장 중요한 과정
 *      디비에 연결이 성공되면, Connection 객체가 리턴    
 */
public class DBConnectionTest {
	public DBConnectionTest(){
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded driver,,,,,");
			
			//2.
			String url = "jdbc:oracle:thin:@192.168.36.130:1521:xe";
			String user = "hr";
			String password = "hr";
			Connection conn=DriverManager.getConnection(url, user, password);
			System.out.println("Success connect to DB ,,,,,");
			
		}catch(ClassNotFoundException e) {
			System.out.println("DB Loading fail,,,,,");
		}catch(SQLException e) {
			System.out.println("DB connecti fail,,,,,");
		}
	}
	public static void main(String[] args) {
		new DBConnectionTest1();
	}
}










