package day04;

interface BillGenerator{
	void generate(double amount);
	
	// DEFAULT METHOD IN INTERFACE (we can define only this method)
	default void showBillFormat() {
		System.out.println("***** BILL RECEIPT *****");
	}
	
	// static method (we can also define )
	static void diplayHeader() {
		System.out.println("Welcome to Online Billing System");
	}

}

public class BillGeneratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillGenerator.diplayHeader(); // directly calling display header because it's static and don't need to create an object to call this method
		
		BillGenerator bill = (amount) -> {
			System.out.println("Amount: Rs"+amount);
			System.out.println("Thankyou for your payment!");
		};
		
		bill.showBillFormat();
		bill.generate(4350);
		
	}

}
