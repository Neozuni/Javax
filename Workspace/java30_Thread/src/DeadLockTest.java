public class DeadLockTest {
	public static void main(String[] args){
		final StringBuffer sb1=new StringBuffer();
		final StringBuffer sb2=new StringBuffer();

		DeadLock1 tdt1 = new DeadLock1(sb1,sb2);
		DeadLock2 tdt2 = new DeadLock2(sb1,sb2);

		Thread t1 = new Thread(tdt1);
		Thread t2 = new Thread(tdt2);
		t1.start();
		t2.start();
	}
}

