package broker.three.vo;

import java.io.Serializable;

/*
 * shares ���̺��� ������ �����ϴ� VO Ŭ����
 * ����(ssn)
 * � �ֽ���(symbol)
 * �󸶸�ŭ ������ �ִ����� ������ �ٷ�� Ŭ����
 * ::
 * Ư�� ���� �ֽ� �������� �˼� �ִ�. 
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













