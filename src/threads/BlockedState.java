package threads;
//Create a thread by implements Runnable
class PrinterTaskThread implements Runnable {
	public void run() {
		printer();
    }
    public static synchronized void printer() {
    	int i=1;
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        	printing(i);
        	i++;
        }
        
    }
     private static void printing(int i) {
		// TODO Auto-generated method stub
		System.out.println("Document "+i +" is printed");
	}
}
public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrinterTaskThread());
        Thread t2 = new Thread(new PrinterTaskThread());
        
        t1.start();//Now t1 is in running status
        //Here t2 will start once t1 accomplished it's job
        t2.start();
        Thread.sleep(10);
        System.out.println(t2.getState());
        System.exit(0);
        System.out.println("Main Thread ENds!!!");
    }
}
//Dead Lock: A,B,C resources

//A--->B--->C 


