package day03;

public class BankAccount {
	private String accHolderName;
	private double balance;

	public BankAccount(String accHolderName, double balance) {
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("New Balance is: "+balance);
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= amount;
			System.out.println("Withdrawn Remaining Balance is: "+balance);
		}
	}
	
	public void displayDetails() {
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Current Balnce is: "+balance);
	}

}
