package fly;
/*
 * 인터페이스 구성요소 
 * 1.public abstract method
 * 2.상수  (마지막 변수라는 표시) public static final  
 * 
 * 
 */
// super , parent 
// super class 와 다른점은 자식 객체 생성시 type 으로서만 존재 .
// 메모리못올라가고 타입으로만 존재  

public interface Flyer {
	char color = 'B'; // public static final 이 생략되어있다 무조건 생략됨 ~
	public static final int DEFAULT_SPEED = 1024;
	
	public abstract String fly(); // 추상 메소드
	abstract public void take_off(); // 위치는 바꿔도 됩
	void land();// interface 안의 메소드는 무조건 public abstract 로잡힌다 
	
	
}
