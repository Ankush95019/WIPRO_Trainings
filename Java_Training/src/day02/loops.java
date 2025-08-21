package day02;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array
		int[] numbers = {10,20,30,40}; 
		
		// for loop
		System.out.println("Using For Loop");
		for(int i = 0;i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		// while loop
		System.out.println("Using While Loop");
		int j = 0;
		while(j < numbers.length) {
			System.out.println(numbers[j]);
			j++;
		}
		
		// do-while loop
		System.out.println("Using Do-While Loop");		
		int k = 0;
		do {
			System.out.print(numbers[k]+", ");
			k++;
		}while(k < numbers.length);
		
		
	}
}
