package day08;

class TicketBooking{
	private int availableTickets = 10;
	public synchronized void bookTicket(int tickets) {
		if(availableTickets >= tickets) {
			availableTickets -= tickets;
			System.out.println("Booked "+ tickets+", Remaining: "+availableTickets);
		}
		else {
			System.out.println("Not enough tickets for "+tickets);
		}
	}
	
	public int getAvailableTickets() {
		return availableTickets;
	}
}

public class TicketBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooking tb = new TicketBooking();
		Thread t1 = new Thread(() -> {tb.bookTicket(2);});
		Thread t2 = new Thread(() -> {tb.bookTicket(4);});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Final tickets: "+tb.getAvailableTickets());
	}

}
