package day04;

abstract class Payments {

	double amount;
	
	Payments(double amount){
		this.amount = amount;
	}
	
	abstract void makePayment();
	
	void showSuccessMessage() {
		System.out.println("Payment Susccessful of "+amount);
	}
	
}
class CreditCardPayment extends Payments{

	CreditCardPayment(double amount){
		super(amount);
	}

	@Override
	void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Credit Card payment is Done");
		showSuccessMessage();
	}
	
}

class UpiPayment extends Payments{
	
	UpiPayment(double amount){
		super(amount);
	}
	void makePayment() {
		System.out.println("UPI Payment is Done");
		showSuccessMessage();
	}
}

public class Payment {
	
	public static void main(String[] args) {
		Payments p1 = new CreditCardPayment(50000);
		p1.makePayment();
		System.out.println("Credit Card Payment Process is completed");
		
		System.out.println("");
		
		Payments p2 = new UpiPayment(40000);
		p2.makePayment();
		
		System.out.println("UPI Payment Process is completed");
	}
}


