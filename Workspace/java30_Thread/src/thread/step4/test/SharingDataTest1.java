package thread.step4.test;
/*
 * Thread 들이 Process 의 자원을 공유할때 
 * 발생하는 문제점을 보여주는 간단한 코드
 * ::
 * 최종적으로 해당 로직을 그림을 그려서 설명
 * 
 * 
 */

class Calculator{
	private int memory;

	public int getMemory() {
		return memory;
	}

	synchronized public void setMemory(int memory) {
		this.memory = memory;
		//무슨 이유에서인지 시간이 지연되었다면 ...
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {} 
		System.out.println(Thread.currentThread().getName()+"Value :: "+this.memory);
		}
	}
	
class User1 extends Thread{
	Calculator calculator ;

	public void setCalculator(Calculator calculator) {
		setName("Caculator1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100); //메모리에 값을 입력하는일 
	}
}

class User2 extends Thread{
	Calculator calculator ;

	public void setCalculator(Calculator calculator) {
		setName("Caculator2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50); //메모리에 값을 입력하는일 
	}
}

public class SharingDataTest1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
	}

}
