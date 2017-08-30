package thread.step2.test;

import java.awt.Toolkit;

/*
 * step2
 * ::
 * Beep 경고음과 "띵"출력이 동시에 진행되도록 별도의 작업쓰레드를 작성
 * ::
 * main 쓰레드와 작업 쓰레드가 병행적으로 처리되는 현상을 확인 
 * 
 * 
 */
import java.awt.Toolkit;
class BeepThread extends Thread{
	public void run() {
		Toolkit toolKit = Toolkit.getDefaultToolkit(); //객체를 호출 
		for(int i=0; i<5; i++) {
			toolKit.beep();//비프음 발생 
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}//for
	}
}
public class BeepThreadTest2 {
	public static void main(String[] args) {
		BeepThread beep = new BeepThread();
		beep.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}

	}
}
