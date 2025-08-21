package ArrayListPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> marks = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the marks (write exit to stop) ");
		while(true) {
			System.out.print("Marks: ");
			String inputMarks = sc.nextLine();
			if(inputMarks.equalsIgnoreCase("exit")) {
				break;
			}
			
			try {
				double mark = Double.parseDouble(inputMarks);
				marks.add(mark);
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input. Please enter a valid number or 'exit'.");
			}
			
//			if(inputMarks == 0) { // this also working fine
//				break;
//			}
//			marks.add(inputMarks);
		}
		sc.close();
		
		System.out.println("Entered marks are:");
		for(Double mark: marks) {
			System.out.println(mark);
		}
	}

}
