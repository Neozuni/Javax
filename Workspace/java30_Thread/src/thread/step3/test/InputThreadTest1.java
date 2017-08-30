package thread.step3.test;

import javax.swing.JOptionPane;

/*
 * step1 
 * ::
 * 작업 쓰레드를 사용하지 않는다.
 * main thread 만으로 작동
 * :
 * 입력박스에 사용자의 입력을 받는다 / 입력받은 숫자를 콘솔로 출력 
 * 
 */
public class InputThreadTest1 {

	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("황금열쇠의 비밀번호를 입력하세요 ...");
		System.out.println("입력한 비번은 "+password +" !!");
		
		//일종의 카운팅 작업
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
		}
		
	}

}
}