package day06;

public class BankAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank account = new SavingsAccount(1000);
		account.displayAccountType();
		account.executeTransaction("deposit", 700);
		account.executeTransaction("withdraw", 200);
		account.executeTransaction("withdraw", -50);
		account.executeTransaction("withdraw12", 500);
		System.out.println("Total Current Balance: ₹" + account.getBalance());

		
		
	}

}
