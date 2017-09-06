package broker.twotier.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.InvalidTransactionException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;
import broker.twotier.vo.StockRec;
import config.OracleInfo;

public class Database2{
	public Database2(String server) throws ClassNotFoundException{
		Class.forName(OracleInfo.DRIVER);
		System.out.println("Driver loading ... ok!! ");
	
	
	}//database
	
	// common logic
	
	public Connection getConnect() throws SQLException{
		Connection conn = 
				DriverManager.getConnection(OracleInfo.URL, OracleInfo.USER, OracleInfo.PASS);
				System.out.println("DB connecting .....");
				return conn;
	}// getConnect()
	
	public void closeAll(PreparedStatement ps, Connection conn)throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	private void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps, conn);
	}
	
	
// Business Logic ----------------------------------------------------------------------------------------------
	
	// isExists ----------------------------------------------------------------------------------------------
	public boolean isExists(Connection conn, String ssn)throws SQLException{
		//Connection conn = getConnect();
		
		String query = 
				"select ssn from customer where ssn=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, ssn);
		ResultSet rs = ps.executeQuery();
		return rs.next();
		
	}
	
	// addCustomer ----------------------------------------------------------------------------------------------
	/**
	 * @param cust
	 * @throws SQLException
	 * @throws DuplicateSSNException
	 */
	private void addCustomer(CustomerRec cust) throws SQLException,DuplicateSSNException{
		 Connection conn = null;
		 PreparedStatement ps = null;
		 
		 try {
			 conn = getConnect();
			 if(!isExists(conn, cust.getSsn())) {
				 String query =
						 "insert into customer values(?,?,?)";
				 
				 ps = conn.prepareStatement(query);
				 
				 ps.setString(1, cust.getSsn());
				 ps.setString(2, cust.getName());
				 ps.setString(3, cust.getAddress());
				 
				 System.out.println(ps.executeUpdate() +" added customer info" );
				 
			 }else { 
				 throw new DuplicateSSNException(" Does exist customer in db "+cust.getName());
				}
		} finally {
			closeAll(ps, conn);
		}
	}
	// deleteCustomer ----------------------------------------------------------------------------------------------
	private void deleteCustomer(String ssn)throws SQLException,RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			if(isExists(conn, ssn)) {
				String query =
						"delete from customer where ssn=?";
				ps = conn.prepareStatement(query);
				ps.setString(1, ssn);
				System.out.println(ps.executeUpdate()+" was deleted");
			}else {
					throw new RecordNotFoundException("not invaild");
				} 
		} finally {
			closeAll(ps, conn);
				
			}
	
}
	// updateCustomer ----------------------------------------------------------------------------------------------
	private void updateCustomer(CustomerRec cust)throws SQLException,RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
				
		try {
			conn = getConnect();
			if(isExists(conn, cust.getSsn())) {
				String query =
						"update customer set cust_name=?, address=? where ssn=?";
				ps = conn.prepareStatement(query);
				
				ps.setString(1, cust.getName());
				ps.setString(2, cust.getAddress());
				ps.setString(3, cust.getSsn());
				
				System.out.println(ps.executeUpdate()+" modified ok !! ");
			} else {
				throw new RecordNotFoundException(" no people");
			}
			
		} finally {
			closeAll(ps, conn);
		}
		
	}
	
public static void main(String[ ] args) throws Exception{
	Database2 db = new Database2("192.168.36.10");
	//System.out.println(db.isExists("111-999"));
	try {
		//db.addCustomer(new CustomerRec("000-000", "neox", "Songpa"));
		//db.deleteCustomer("000-000");
		db.updateCustomer(new CustomerRec("989-96", "하바리1", "서현동1"));
	} catch (RecordNotFoundException e) {
	System.out.println("등록하려는 고객이 no ");
	}
	
	
	
	//System.out.println(db.getCustomer("777-777"));
	//db.buyShares("000-000", "JDK", 100);
	//db.sellShares("111-110", "DUE", 20);
	//}

} //class

} // main class