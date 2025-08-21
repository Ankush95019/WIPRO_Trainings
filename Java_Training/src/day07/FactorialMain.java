package day07;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int number = 5;
			if(number < 0) {
				throw new InvalidValueException("Factorial is not defined for negative numbers.");
//				throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
			}
					
			int factorial = 1;
			
			for(int i = 2;i <= number;i++) {
				factorial *= i;
			}
			System.out.println("Factorial of "+number+" is "+factorial);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
