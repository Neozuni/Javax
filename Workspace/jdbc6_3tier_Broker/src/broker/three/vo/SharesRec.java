package broker.three.vo;

import java.io.Serializable;

/*
 * shares 테이블의 정보를 저장하는 VO 클래스
 * 누가(ssn)
 * 어떤 주식을(symbol)
 * 얼마만큼 가지고 있는지의 정보를 다루는 클래스
 * ::
 * 특정 고객의 주식 보유량을 알수 있다. 
 */
public class SharesRec implements Serializable{
	private String ssn;
	private String symbol;
	private int quantity;
	
	public SharesRec(String ssn, String symbol, int quantity) {
		this.ssn = ssn;
		this.symbol = symbol;
		this.quantity = quantity;
	}
	public SharesRec() {
		this(" "," ",0);
	}
	public SharesRec(String ssn) {
		this(ssn," ",0);
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "SharesRec [ssn=" + ssn + ", symbol=" + symbol + ", quantity=" + quantity + "]";
	}
}













