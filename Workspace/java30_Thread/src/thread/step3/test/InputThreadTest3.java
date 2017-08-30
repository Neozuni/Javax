package thread.step3.test;
/*
 * step 3 ::
 * 10초가 진행되는 동안 입력박스에 값이 입력되도록 권장하는 로직
 * ::
 * 1) 10초 안에 값을 입력하지 않으면
 *    더이상 값을 입력받지 못하도록 창을 내린다.
 * 2) 10초 안에 값이 입력되었다면
 *    카운팅 작업을 중지해야 한다.
 * ::
 * 작업 쓰레드 2개 작성
 * CountThread | InputThread
 * InputThreadTest3(main쓰레드가 돌아가는 Java Process라고 보면 된다)
 */
import java.awt.Toolkit;

import javax.crypto.CipherInputStream;
import javax.swing.JOptionPane;

class CountThread implements Runnable{

	@Override
	public void run() {
		//일종의 카운팅 작업..
		for(int i=10; i>0; i--) {
			//만약에 팝업창에 숫자가 입력되었다면 for를 빠져나온다 ...
			if(InputThreadTest3.inputcheck)break; // 입력값이 없으면종료 해라...
			Toolkit tk = Toolkit.getDefaultToolkit();
			tk.beep();
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
					
			}
		}//for	
		if(!InputThreadTest3.inputcheck) {
			System.out.println("10초의 시간이 지났습니다 값입력 없습니다. ");
			System.exit(0);//시스템을 종료 함...
		}
	}//run	
}

class InputThread implements Runnable{

	@Override
	public void run() {
		String password=JOptionPane.showInputDialog("황금열쇠의 비밀번호를 입력하세요...");
		System.out.println("입력한 비번은 "+ password +"  !!");
		
		InputThreadTest3.inputcheck = true;
	}
	
}
public class InputThreadTest3 { // java process
	//thread 들이 공유하는 데이터를 필드로 하나 지정 ...
	static boolean inputcheck = false; // process field :: 공유됨 . 
	
	
	public static void main(String[] args) {	
		CountThread ct = new CountThread();
		InputThread it = new InputThread();
		
		Thread t1 = new Thread(ct);
		Thread t2 = new Thread(it);
		
		t1.start();
		t2.start();
		
		
	}
}












