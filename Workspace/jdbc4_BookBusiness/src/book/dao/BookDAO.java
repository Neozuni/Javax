package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import book.exception.DuplicateIsbnException;
import book.exception.InvalidInputException;
import book.exception.RecoreNotFoundException;
import book.vo.Book;
import config.OracleInfo;

public class BookDAO {
	//싱글톤
	private static BookDAO dao = new BookDAO();
	
	private BookDAO(){
		try {
			Class.forName(OracleInfo.DRIVER);
			System.out.println("Driver Loading OK..");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Fail..");
		}
		
	}
	public static BookDAO getInstance() {
		return dao;
	}
	
	//공통로직
	private Connection getConnect() throws SQLException{
		Connection conn=DriverManager.getConnection(OracleInfo.URL,OracleInfo.USER,OracleInfo.PASS);
		System.out.println("DB Connection....");
		return conn;
	}
	
	private void closeAll(PreparedStatement ps, Connection conn)throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	private void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps, conn);
	}
	//book.exception.
	//DuplicateIsbnException
	//RecordNotFoundException
	//InvalidInputException
	//비지니스 로직
	public int isExists(String isbn)throws SQLException{
		int count = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConnect();			
			String query = "SELECT COUNT(-1) FROM book WHERE isbn=?";//한줄 한칸 1/0
			ps = conn.prepareStatement(query);
			ps.setString(1, isbn);
			rs = ps.executeQuery();
			if(rs.next()) return rs.getInt(1);
			else return count;
		}finally {
			closeAll(rs, ps, conn);
		}		
	}
	
	public void registerBook(Book vo)throws SQLException,DuplicateIsbnException{
		Connection conn = null;
		PreparedStatement ps = null;
		if(isExists(vo.getIsbn())==1) throw new DuplicateIsbnException("그런 책은 이미 있어요");
		
		try {
			conn = getConnect();
			
			String query = "INSERT INTO book VALUES(?,?,?,?,?)";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, vo.getIsbn());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getWriter());
			ps.setString(4, vo.getPublisher());
			ps.setInt(5, vo.getPrice());
			
			System.out.println(ps.executeUpdate()+" row REGISTER OK!!");
		}finally {
			closeAll(ps, conn);
		}
	}//
	
	public void deleteBook(String isbn)throws SQLException,RecoreNotFoundException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "DELETE FROM book WHERE isbn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, isbn);
			int row = ps.executeUpdate();//1 | 0
			System.out.println(row+" row DELETE ok!!");
			if(row==0) throw new RecoreNotFoundException("삭제할 책 없음!!");
			
		}finally {
			closeAll(ps, conn);
		}
	}//
	
	public Book  findByIsbn(String isbn)throws SQLException,RecoreNotFoundException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book= null;
		try {			
			conn = getConnect();
			String query = "SELECT * FROM book WHERE isbn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, isbn);
			rs = ps.executeQuery();
			if(rs.next()) {
				book = new Book(isbn, 
								rs.getString("title"), 
								rs.getString("author"), 
								rs.getString("publisher"), 
								rs.getInt("price"));						
			}else {
				throw new RecoreNotFoundException();
			}
		}finally {
			closeAll(rs,ps, conn);
		}
		return book;
	}//
	public Book  findByTitle(String title,String isbn)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book= null;
		try {
			conn = getConnect();
			String query =
					" select * from book where title=? and isbn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, isbn);
			
					
			
		}finally {
			closeAll(rs,ps, conn);
		}
		return book;
	}//
	
	public ArrayList<Book>  findByWriter(String writer)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Book> list = new ArrayList<Book>();
		try {
			
		}finally {
			closeAll(rs,ps, conn);
		}
		return list;
	}//
	
	public ArrayList<Book>  findByPrice(int min, int max)throws SQLException, InvalidInputException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Book> list = new ArrayList<Book>();
		try {
			
		}finally {
			closeAll(rs,ps, conn);
		}
		return list;
	}//
	
	public void  discountBook(int per, String publisher)throws SQLException, InvalidInputException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			
		}finally {
			closeAll(ps, conn);
		}
		
	}//
	
	public void  printAllBookInfo()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
		}finally {
			closeAll(rs,ps, conn);
		}
		
	}//
}
















