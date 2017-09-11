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
	
	//�������� ����...
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
	
	/////////////////// �����Ͻ� ���� ///////////////////////////
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
				
				System.out.println(ps.executeUpdate()+" �� addCustomer() ok");
			}else {
				throw new DuplicateSSNException("�׷� ��� �̹� �־�� addCustomer ::"+cust.getName());
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
				System.out.println(ps.executeUpdate()+" �� ����!!");
			}else {
				throw new RecordNotFoundException("�׷� ��� ��� :: deleteCustomer");
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
				
				System.out.println(ps.executeUpdate()+" �� ����!!");
			}else {
				throw new RecordNotFoundException("�׷� ��� ��� :: updateCustomer");
			}
			
		}finally {
			closeAll(ps, conn);
		}
	}
	
	/*
	 * Ư�� ���� ������ �ֽ��� ������ �����ϴ� ���
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
	 * Ư���� ���� ��� ������ �����ϴ� ���
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
	 * ���� � �ֽ��� | � ������ �ִ°�?
	 * 0���� ũ�� ---->update
	 * 0�̸� ------> insert into
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
			if(rs.next()) { //������ ��� �ֽ��� �̹� ������ �ִ�.
				//int q=rs.getInt(1); //���� ��������				
				String query2 = "UPDATE shares SET quantity= quantity+? WHERE ssn=? AND symbol=?";
				ps = conn.prepareStatement(query2);
				ps.setInt(1, quantity);
				ps.setString(2, ssn);
				ps.setString(3, symbol);
				System.out.println(ps.executeUpdate()+" buyShares...update ");
			}else { //�ƿ� �ش� ������ �ֽ��� ����.
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
	 * ���� � �ֽ��� � �Ȱų�?
	 * 100���� ������ �ִ�.
	 * 1)100 �� �� �Ĵ� ��� ---- delete
	 * 2)50 �� �Ĵ� ��� ---- upadte
	 * 3) 110 �� �Ĵ� ��� ---- ��
	 * ::
	 * ����
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
				int q = rs.getInt(1);//���纸���ֽ�
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
					throw new InvalidTransactionException("�ȷ��� �ֽ��� �� ���ƿ�");
				}
				
			}else {
				throw new RecordNotFoundException("�Ȱ��� �ϴ� �ֽ� ����!!");
			}
		}finally {
			closeAll(rs, ps, conn);
		}
	}//sellShares
	
}//class

























