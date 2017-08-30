package thread.step2.test;

import java.awt.Toolkit;

/*
 * step1
 * ::
 * 경고음을 5번 발생 / 동시에 띵띵띵띵띵 문자를 5번 출력 
 * 이때 별도의 쓰레드를 사용하지 않고
 * 그저 main으로 처리할 것이다
 * ::
 * main 메소드가 사실은 쓰레드라는 사실을 알고 있다 
 * BeepThreadTest1 라는 하나의 프로세스가동작한다는 것은 
 * 그안에 반드시 하나의 쓰레드가 돌고 있다는 것이다
 * 단지 별도의 작업쓰레드를 만들지 않을 것이다  
 * 
 */
public class BeepThreadTest1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체를 한번 받아냄 
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 비프음 발생 
			try {
				Thread.sleep(500);
			}catch (InterruptedException e){
			
			}
		}//for
		
		for(int i=0; i<5; i++) {
			System.out.println("ting");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e){
			
			}
		}
		
		
	}

}
