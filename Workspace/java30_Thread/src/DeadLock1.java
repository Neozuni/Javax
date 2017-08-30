public class DeadLock1 implements Runnable{

	StringBuffer sb1,sb2;

	public DeadLock1(StringBuffer sb1, StringBuffer sb2){
		this.sb1 = sb1;
		this.sb2 = sb2;
	}

	public void run() { 
          synchronized(sb1){ 
                sb1.append("A"); //ab
                
                try{
                sb1.wait(); // 대기 후 try 씌움 
				
				Thread.sleep(1000);
				}catch(InterruptedException e){}
                synchronized(sb2){
                      sb2.append("B");
                      System.out.println(sb1);
                      System.out.println(sb2);
                }
		 }
	}
}