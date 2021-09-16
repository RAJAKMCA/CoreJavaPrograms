package threads;


//Execute this program without 'synchronized' keyword for bookTicket() method and check the o/p
//keep 'synchronized' keyword for bookTicket() method and check the o/p
class BookTicketsClass implements Runnable {
	int tickets = 3;// 3 tickets available
	int user1 = 1, user2 = 2, user3 = 3;//tickets to be bookked for each user
	public synchronized void  bookTicket(String name, int wantedTicket) {
		//Book ticket is a critical block so that should be in synchronized block
		if (wantedTicket <= tickets) {
			System.out.println(wantedTicket + " Ticket to booked for :" + name);
			tickets = tickets - wantedTicket;
		} else {
			System.out.println("No tickets available to book for user :"+name);
		}
	}
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("user1")) {
			bookTicket(name, user1);
		} else if (name.equals("user2")) {
			bookTicket(name, user2);
		} else {
			bookTicket(name, user3);
		}

	}
}
public class SynchorinzationDemo {
	public static void main(String args[]) {
		BookTicketsClass b = new BookTicketsClass();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		t1.setName("user1");
		t2.setName("user2");
		t3.setName("user3");
		System.out.println("Assigning of tickets started");
		t1.start();
		t2.start();
		t3.start();
	}

}
/*
 *  O/P before synchronized block
 Assigning of tickets started
2 Ticket to booked for :user2
1 Ticket to booked for :user1
No tickets available to book 
*/
/* O/P before after synchronized block added
Assigning of tickets started
1 Ticket to booked for :user1
2 Ticket to booked for :user2
No tickets available to book for user :user3
*/