package threads;
//for creating a thread two possibilities are there

//extends Thread
//implements Runnable interface
//if you wanted to use above created Thread you have to override  run() method

class PrintTask extends Thread{
	public void run(){
		for (int i = 1; i < 10; i++) {
			System.out.println("***** Document " + i + " Printed!");
		}
	}
}
//Printing a document in the printer(This is my task)
public class ThreadDemo {
	public static void main(String[] args) {
		// job1
		System.out.println("Starting of a printer ");
		// job2
		for (int i = 1; i < 10; i++) {
			System.out.println("Document " + i + " Printed!");
		}
		//job3 for parellel printing
		PrintTask p1= new PrintTask();
		Thread newThread= new Thread(p1);
		newThread.start();
		// job4 for closing a printer resources
		System.out.println("Stop a printer");
	}

}
