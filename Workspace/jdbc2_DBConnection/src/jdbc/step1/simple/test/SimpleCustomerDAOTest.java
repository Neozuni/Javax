package jdbc.step1.simple.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.OracleInfo;

/*
 * CREATE TABLE customer(
   name varchar2(20) primary key,
   age number(3),
   height number(3),
   weight number(3),
   gender char(5));
 */
public class SimpleCustomerDAOTest {
		
	/////////// 공통적인 메소드 ///////////////////////////
	private Connection connection() throws SQLException{
		Connection conn=DriverManager.getConnection(OracleInfo.URL, "hr", "hr");
		System.out.println("DataBase Connection.........");
		return conn;
	}
	
	private void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps != null) ps.close();
		if(conn !=null) conn.close();
	}
	
	//OverLoading
	private void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException{
		if(rs != null) rs.close();
		closeAll(ps, conn);		
	}
	
	//Business Logic..................
	//1.  Customer를 디비에 추가하는 로직
	public void insertCustomer(String name, int age, int height, int weight, String gender)
				throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		
		//1........고정적
		conn=connection();
		
		//2........가변적
		String query = "INSERT INTO customer VALUES(?,?,?,?,?)";
		ps = conn.prepareStatement(query);
		
		//3........가변적
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setInt(3, height);
		ps.setInt(4, weight);
		ps.setString(5, gender);
		
		//4........가변적
		System.out.println(ps.executeUpdate()+" row INSERT OK!!");
		
		//5........고정적
		closeAll(ps, conn);		
	}
	
	//2. Customer를 디비에  삭제하는 로직
	public void deleteCustomer(String name)throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		conn = connection();
		
		String query = "DELETE FROM customer WHERE name=?";
		ps = conn.prepareStatement(query);
		
		ps.setString(1, name);
		System.out.println(ps.executeUpdate()+" row DWELETE OK!!");
		
		closeAll(ps, conn);
	}
	
	//Customer의 정보를 수정하는 로직
	//pk가 아닌 나머지 모든 컬럼들을 overwrite하는 개념으로 인식
	public void updateCustomer(String name, int age, int height, int weight, String gender) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		
		conn = connection();
		String query =
				"UPDATE customer SET age=?, height=?, weight=?, gender=? WHERE name=?";
		ps = conn.prepareStatement(query);
		
		ps.setInt(1, age);
		ps.setInt(2, height);
		ps.setInt(3, weight);
		ps.setString(4, gender);
		ps.setString(5, name);
		
		System.out.println(ps.executeUpdate()+" row UPDATE OK!!");
		
		closeAll(ps, conn);
		
	}
	
	public void printAllCustomer()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = connection();
		String query ="SELECT * FROM customer";
		ps = conn.prepareStatement(query);
		
		rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"
							  +rs.getInt(2)+"\t"
							  +rs.getString(5));
		}
		
	}
	public void printCustomer(String name)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = connection();
		
		String query = "SELECT * FROM customer WHERE name=?";
		ps = conn.prepareStatement(query);
		ps.setString(1, name);
		
		rs = ps.executeQuery();
		
		if(rs.next()) 
			System.out.println(name+"\t"+rs.getInt(2)+"\t"+rs.getString(5));
		
		closeAll(rs, ps, conn);
		
	}
	public static void main(String[] args) {
		System.out.println("========== JDBC Simple DAO Test==========");
		SimpleCustomerDAOTest dao   =  new SimpleCustomerDAOTest();
		try {
			dao.printCustomer("juliet");
		}catch (SQLException e) {
		}
		
		/*try {
			dao.insertCustomer("Juliet", 26, 165, 54, "F");
		}catch(SQLException e) {
			System.out.println("그런 사람 이미 있어요");
		}*/
		
		/*try {
			dao.deleteCustomer("Gosling");
		}catch(SQLException e) {
			//System.out.println("삭제할 대상이 없어요..");
		}*/
		/*try {
			dao.updateCustomer("Juliet1", 26, 165, 57, "F");
		}catch(SQLException e) {
			
		}*/
	}//main
	
	static {
		try {
			System.out.println("Driver Loading Start.....");
			Class.forName(OracleInfo.DRIVER);
			System.out.println("Driver Loading Success.....");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Fail.....");
		}
	}
}












