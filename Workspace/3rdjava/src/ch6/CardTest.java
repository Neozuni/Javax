package ch6;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("card.width = " +Card.width);
		System.out.println("card.heidth = " +Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + "," +c1.number+ "이며, 크기는 ("+c1.width + "," +c1.height + ")");
		System.out.println("c2은" + c1.kind + "," +c2.number+ "이며, 크기는 ("+c2.width + "," +c2.height + ")");
		System.out.println("c1의 width 와 height 를 각각 50,80 으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width+ "," + c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width+ "," + c2.height + ")");
		
		
		
	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}