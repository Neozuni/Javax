package thread.step1.test;
/*
 * thread 를 작성하는 방법
 * 1.extends thread
 * 2. implements Runable 
 */
class GoThread extends Thread{
	int i = 0;
	
	public void run() {
		// 이안에서 쓰레드가동작하는 로직을 작성
		while(true) {
			System.out.println("go :: "+i++);
			if(i==20) break;
			
		}
	}
	
}

class ComeThread extends Thread{
	int i = 0;
	
	public void run() {
		// 이안에서 쓰레드가동작하는 로직을 작성
		while(true) {
			System.out.println("come :: "+i++);
			if(i==20) break;
			
		}
	}
	
}

public class GoComThreadTest1 {

	public static void main(String[] args) {
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		System.out.println(go.getPriority());
		System.out.println(go.getPriority());
		go.start();
		come.start();
	}

}
