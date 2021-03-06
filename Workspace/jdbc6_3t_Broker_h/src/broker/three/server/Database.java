package broker.three.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.InvalidTransactionException;
import broker.three.exception.RecordNotFoundException;
import broker.three.vo.CustomerRec;
import broker.three.vo.SharesRec;
import broker.three.vo.StockRec;
import config.OracleInfo;

public class Database {
	public Database(String server) throws ClassNotFoundException{
		Class.forName(OracleInfo.DRIVER);
		System.out.println("Driver Loading.....OK!!");
	}
	
	//공통적인 로직...
	public Connection getConnect() throws SQLException{
		Connection conn = 
			DriverManager.getConnection(OracleInfo.URL,OracleInfo.USER,OracleInfo.PASS);
		System.out.println("DBConnectiong.....");
		return conn;
		
	}
	
	public void closeAll(PreparedStatement ps, Connection conn)throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn)throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps, conn);
	}
	
	/////////////////// 비지니스 로직 ///////////////////////////
	public boolean isExists(Connection conn, String ssn)throws SQLException{
		//Connection conn = getConnect();
		String query = "SELECT ssn FROM customer WHERE ssn=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, ssn);
		ResultSet rs = ps.executeQuery();
		return rs.next();
	}
	
	public void addCustomer(CustomerRec cust) throws SQLException,DuplicateSSNException{
		Connection conn = null;
		PreparedStatement ps = null;		
		try {
			conn = getConnect();
			if(!isExists(conn, cust.getSsn())) {
				String query = "INSERT INTO customer VALUES(?,?,?)";
				ps = conn.prepareStatement(query);
				ps.setString(1, cust.getSsn());
				ps.setString(2, cust.getName());
				ps.setString(3, cust.getAddress());
				
				System.out.println(ps.executeUpdate()+" 명 addCustomer() ok");
			}else {
				throw new DuplicateSSNException("그런 사람 이미 있어요 addCustomer ::"+cust.getName());
			}
		}finally {
			closeAll(ps, conn);
		}
	}
	public void deleteCustomer(String ssn) throws SQLException,RecordNotFoundException{
		Connection conn = null;
		PreparedStatement ps = null;		
		try {
			conn = getConnect();
			if(isExists(conn, ssn)) {
				String query = "DELETE FROM customer WHERE ssn=?";
				ps = conn.prepareStatement(query);
				ps.setString(1, ssn);
				System.out.println(ps.executeUpdate()+" 명 삭제!!");
			}else {
				throw new RecordNotFoundException("그런 사람 없어여 :: deleteCustomer");
			}
			
		}finally {
			closeAll(ps, conn);
		}
	}
	
	public void updateCustomer(CustomerRec cust) throws SQLException,RecordNotFoundException{
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			if(isExists(conn, cust.getSsn())) {
				String query = "UPDATE customer SET cust_name=?, address=? WHERE ssn=?";
				ps = conn.prepareStatement(query);
				ps.setString(1, cust.getName());
				ps.setString(2, cust.getAddress());
				ps.setString(3, cust.getSsn());
				
				System.out.println(ps.executeUpdate()+" 명 수정!!");
			}else {
				throw new RecordNotFoundException("그런 사람 없어여 :: updateCustomer");
			}
			
		}finally {
			closeAll(ps, conn);
		}
	}
	
	/*
	 * 특정 고객이 보유한 주식의 정보를 리턴하는 기능
	 */
	public Vector<SharesRec> getPortfolio(String ssn) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Vector<SharesRec> v = new Vector<SharesRec>();
		try {
			conn = getConnect();
			String query = "SELECT * FROM shares WHERE ssn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, ssn);
			rs = ps.executeQuery();
			while(rs.next()) {
				v.add(new SharesRec(ssn, 
									rs.getString("symbol"), 
									rs.getInt("quantity")));
			}
		}finally {
			closeAll(rs,ps, conn);
		}
		return v;
	}
	/*
	 * 특정한 고객의 모든 정보를 리턴하는 기능
	 */
	public CustomerRec getCustomer(String ssn)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CustomerRec cr = null;
		try {
			conn = getConnect();
			String query ="SELECT * FROM customer WHERE ssn=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, ssn);
			rs = ps.executeQuery();
			if(rs.next()) {
				cr = new CustomerRec(ssn, 
						rs.getString("cust_name"), 
						rs.getString("address"));
			}//
			cr.setPortfolio(getPortfolio(ssn));
		}finally {
			closeAll(rs,ps, conn);
		}
		return cr;
	}
	
	public ArrayList<CustomerRec> getAllCustomers()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<CustomerRec> list = new ArrayList<CustomerRec>();
		try {
			conn = getConnect();
			String query ="SELECT * FROM customer";
			ps = conn.prepareStatement(query);			
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new CustomerRec(
						rs.getString("ssn"), 
						rs.getString("cust_name"), 
						rs.getString("address"), 
						getPortfolio(rs.getString("ssn"))));
			}
		}finally {
			closeAll(rs,ps, conn);
		}
		return list;
	}
	
	public ArrayList<StockRec> getAllStocks()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<StockRec> list = new ArrayList<StockRec>();
		try {
			conn = getConnect();
			String query = "SELECT * FROM stock";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new StockRec(rs.getString("symbol"), 
									  rs.getFloat("price")));
			}
		}finally {
			closeAll(rs,ps, conn);
		}
		return list;
	}
	
	public float getStockPrice(String symbol)throws SQLException, RecordNotFoundException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		float price = 0.0f;
		try {
			
		}finally {
			closeAll(rs,ps, conn);
		}
		return price;
	}
	/*
	 * 누가 어떤 주식을 | 몇개 가지고 있는가?
	 * 0보다 크면 ---->update
	 * 0이면 ------> insert into
	 */
	public void buyShares(String ssn, String symbol, int quantity) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConnect();
			String query1 = "SELECT quantity FROM shares WHERE ssn=? AND symbol=?";
			ps = conn.prepareStatement(query1);
			ps.setString(1, ssn);
			ps.setString(2, symbol);
			rs = ps.executeQuery();
			if(rs.next()) { //기존에 몇개의 주식을 이미 가지고 있다.
				//int q=rs.getInt(1); //현재 보유수량				
				String query2 = "UPDATE shares SET quantity= quantity+? WHERE ssn=? AND symbol=?";
				ps = conn.prepareStatement(query2);
				ps.setInt(1, quantity);
				ps.setString(2, ssn);
				ps.setString(3, symbol);
				System.out.println(ps.executeUpdate()+" buyShares...update ");
			}else { //아예 해당 종목의 주식이 없다.
				String query3="INSERT INTO shares VALUES(?,?,?)";
				ps = conn.prepareStatement(query3);
				ps.setString(1, ssn);
				ps.setString(2, symbol);
				ps.setInt(3, quantity);
				System.out.println(ps.executeUpdate()+" buyShares...insert into");
			}
		}finally {
			closeAll(rs, ps, conn);
		}
	}
	/*
	 * 누가 어떤 주식을 몇개 팔거냐?
	 * 100개를 가지고 있다.
	 * 1)100 개 다 파는 경우 ---- delete
	 * 2)50 개 파는 경우 ---- upadte
	 * 3) 110 개 파는 경우 ---- 뻥
	 * ::
	 * 수량
	 */
	public void sellShares(String ssn, String symbol, int quantity) throws SQLException, RecordNotFoundException,InvalidTransactionException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConnect();
			String query ="SELECT quantity FROM shares WHERE ssn=? AND symbol=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, ssn);
			ps.setString(2, symbol);
			rs = ps.executeQuery();
			if(rs.next()) {
				int q = rs.getInt(1);//현재보유주식
				//int newQuantity=q-quantity;
				if(q==quantity) { //delete
					String query1 = "DELETE FROM shares WHERE ssn=? AND symbol=?";
					ps = conn.prepareStatement(query1);
					ps.setString(1, ssn);
					ps.setString(2, symbol);
					System.out.println(ps.executeUpdate()+" sellShares..delete");
				}else if(q>quantity) { //update
					String query2="UPDATE shares SET quantity= quantity-? WHERE ssn=? AND symbol=?";
					ps = conn.prepareStatement(query2);
					ps.setInt(1, quantity);
					ps.setString(2, ssn);
					ps.setString(3, symbol);
					System.out.println(ps.executeUpdate()+" sellShares... update");
				}else {
					throw new InvalidTransactionException("팔려는 주식이 넘 많아요");
				}
				
			}else {
				throw new RecordNotFoundException("팔고자 하는 주식 없음!!");
			}
		}finally {
			closeAll(rs, ps, conn);
		}
	}//sellShares
	
}//class

























