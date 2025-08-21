package day07;

public class ExceptionHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 0;
		try {
			j = 18/i;
			System.out.println("Division successfull");
		}
		catch(ArithmeticException e){
			System.out.println("Division error" + e);
		}
		
	}

}
