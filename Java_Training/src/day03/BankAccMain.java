package day03;

public class BankAccMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("Ankush",1000);
		b.deposit(500);
		b.displayDetails();
		b.withdraw(300);
		b.displayDetails();
	}

}
