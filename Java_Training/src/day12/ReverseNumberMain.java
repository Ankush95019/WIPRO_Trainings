package day12;

public class ReverseNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int revNumber = 0;
		while(number != 0) {
			int rem = number % 10;
			revNumber = revNumber * 10 + rem;
			number /= 10;
		}
		
		System.out.println("Reversed number: "+revNumber);
		
	}

}
