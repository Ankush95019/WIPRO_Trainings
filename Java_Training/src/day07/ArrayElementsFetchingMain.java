package day07;

public class ArrayElementsFetchingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,50,30,90};
		
		for(int i = 0;i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		try {
			System.out.println(numbers[5]);			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound, please check the size of array");
		}
		finally {
			System.out.print("Program executes successfully");
		}
		
	}

}
