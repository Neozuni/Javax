package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.OracleInfo;
import jdbc.exception.DuplicateIdException;
import jdbc.exception.RecordNotFoundException;
import jdbc.vo.Member;
/*
 * CRUD 로직에서 
 * 데이타를 비디에 넣고/빼고/수정하기 전에 반드시 먼저 점검해야 하는
 * 사안이 있다.
 * PK(기본키)에 해당하는 데이타가 있는지의 여부를 반드시 사전에 알아야 한다.
 * -----------------------------------------------------------
 * addXxx() : 디비에 추가하고자 하는 데이타 존재하면 - DuplicateIdException
 * deleteXxx() : 디비에 삭제하고자 하는 데이타 없으면 - RecordNotFoundException
 * updateXxx() : 디비에  수정하고자 하는 데이타 없으면 - RecordNotFoundException
 */
public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();
	
	private MemberDAO() {
		System.out.println("SingleTone Pattern...Creating DAO");
	}
	
	public static MemberDAO getInstance() {
		return dao;		
	}
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
	private void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException{
		if(rs !=null) rs.close();
		closeAll(ps, conn);
	}
	
	////////////////// 비지니스 로직 ////////////////////////////
	public boolean idExists(String id, Connection conn)throws SQLException{
		//Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT id FROM member WHERE id=?";
		ps = conn.prepareStatement(query);
		ps.setString(1, id);
		
		rs = ps.executeQuery();		
		return rs.next() ;
		
	}
	public void addMember(Member member)throws SQLException, DuplicateIdException{
		Connection conn = null;
		PreparedStatement ps = null;		
		
		try {
			conn = connection();		
			if(!idExists(member.getId(),conn)) {
				String query = "INSERT INTO member VALUES(?,?,?,?)";
		
				ps = conn.prepareStatement(query);
				ps.setString(1, member.getId());
				ps.setString(2, member.getName());
				ps.setString(3, member.getPassword());
				ps.setString(4, member.getAddress());
		
				System.out.println(ps.executeUpdate()+" row ADD() :: "+member.getName());
		}else {
			throw new DuplicateIdException("그런 사람 이미 있어요");
		}
		}finally {
			closeAll(ps, conn);
		}
	}
	public void removeMember(String id)throws SQLException,RecordNotFoundException{
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = connection();
			if(idExists(id, conn)) {//삭제하려는 사람이 있다면
				String query = "DELETE FROM member WHERE id=?";
				ps = conn.prepareStatement(query);
				ps.setString(1, id);
		
				System.out.println(ps.executeUpdate()+" row DELETE() ");
			}else { //삭제하려는 사람이 없다면
				throw new RecordNotFoundException("삭제하려는 사람이 없어요");
			}
		}finally{
		 closeAll(ps, conn);
		}
	}
	public void updateMember(Member member)throws SQLException,RecordNotFoundException{
		/*
		 * 삭제하려는 member의 id와 동일한 id를 가진 사람이
		 * 디비에 없으면(존재하지 않으면) 사용자정의 폭탄을 발생시켜서
		 * 해당하는 member가 삭제되지 않도록 강력하게 제어를 해야한다.
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = connection();
			if(idExists(member.getId(), conn)) {
			String query = "UPDATE member SET name=? , password=? , address=? WHERE id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getAddress());
			ps.setString(4, member.getId());
		
			System.out.println(ps.executeUpdate()+" row UPDATE() ");
			}else {
				throw new RecordNotFoundException("수정하려는 사람이 없어요");
			}
		}finally {
			closeAll(ps, conn);	
		}
	}
	public  Member getMember(String id)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Member member = null;
		
		conn = connection();
		
		String query = "SELECT * FROM member WHERE id=?";
		ps = conn.prepareStatement(query);
		ps.setString(1, id);
		
		rs = ps.executeQuery();
		if(rs.next()) {
			member = new Member(id, 
								rs.getString("name"), 					
								rs.getString("password"), 
								rs.getString("address"));
		}
		return member;
		
	}
	
	public  ArrayList<Member> getAllMember()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>();
		
		conn = connection();
		
		String query = "SELECT * FROM member";
		ps = conn.prepareStatement(query);		
		
		rs = ps.executeQuery();
		while(rs.next()) {
			list.add(new Member(rs.getString("id"), 
								rs.getString("name"), 					
								rs.getString("password"), 
								rs.getString("address")));
		}
		return list;
		
	}
}


























