package thread.step4.test;

class CGVUser implements Runnable{
	private boolean seat = false;
	
	@Override
	public void run() {
		//좌석을 예매하는 로직을 쓰레드의 기능으로 작성
		//이 부분에서 바로 작성 | 다른 곳에 구현, 가져다 싸도록
		try {
			reserve();
		} catch (InterruptedException e) {			
		}		
	}	
	/*
	 * 동기화 처리하는 방법
	 * 1) 메소드 선언부에 synchronized 키워드를 걸어준다
	 * 2) 객체 자체에 동기화 처리를 하는 방법
	 *    : synchronized블락을 설정
	 */
	private void reserve() throws InterruptedException{
		/*synchronized(this) {*/
		//1. 예매하는 기능을 하는 쓰레드의 이름을 직접 리턴
		String threadName  =  Thread.currentThread().getName();
		System.out.println(threadName+", 예매하러 왔어요...");
		
		//2. 좌석이 비어있다면 ...예매를 진행...
		if(seat==false) {			
			Thread.sleep(2000);			
			System.out.println(threadName+" , 좌석 예매 성공");
			seat = true;
		}else {
			System.out.println("이미 예매된 좌석입니다.죄송합니다.");
		}
		}
	/*}*/
}



public class CGVProcessTest2 {
	public static void main(String[] args) {		
		CGVUser user = new CGVUser();
		Thread t1 = new Thread(user,"김기쁨");
		Thread t2 = new Thread(user, "김보경");
		
		t1.start();
		t2.start();
	}
}










