package threads;

class MyThread implements Runnable {
	String name;
	Thread t;
	//Create a thread by assigning name of a thread
	MyThread(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}
	public void run() {//printing i and waiting for a second(1000 ms is 1 sec)
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class RunnableThreadDemo {
	public static void main(String args[]) {
		//creating separate threads
		new MyThread("One");
		new MyThread("Two");
		new MyThread("Three");
		System.err.println("Before Main Thread Sleep");
		try {
			Thread.sleep(10000);//main thread sleep for 10sec
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.err.println("Main thread exiting.");
	}
}