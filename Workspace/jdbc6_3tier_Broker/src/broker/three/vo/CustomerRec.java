package broker.three.vo;
/*
 * customer 테이블에 대한 정보를 저장하는 vo 클래스
 * 그럼에도 불구하고, 주식시장에서의 고객이기에
 * 주식을 사고 팔수 있는 고객이 되어야 한다.
 * :
 * 고객은 크게 두 부류로 나뉠수 있을 것이다.
 * 1) 주식을 보유하지 않은 고객
 * 2) 주식을 보유한 고객
 */

import java.io.Serializable;
import java.util.Vector;

public class CustomerRec implements Serializable{
	private String ssn;
	private String name; //컬럼명과 다름
	private String address;
	
	private Vector<SharesRec> portfolio;

	public CustomerRec(String ssn, String name, String address, Vector<SharesRec> portfolio) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
		this.portfolio = portfolio;
	}
	public CustomerRec(String ssn, String name, String address) {
		this(ssn,name, address,null);
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Vector<SharesRec> getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Vector<SharesRec> portfolio) {
		this.portfolio = portfolio;
	}
	@Override
	public String toString() {
		return "CustomerRec [ssn=" + ssn + ", name=" + name + ", address=" + address + ", portfolio=" + portfolio + "]";
	}
	
}


















