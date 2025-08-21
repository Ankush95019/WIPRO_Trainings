package Course2Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Course2AssessmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> studentsData = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose an option:");
			System.out.println("1. Add Student");
			System.out.println("2. Get Student Score");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter the student's name: ");
				String name = sc.nextLine();
				System.out.print("Enter the students's score: ");
				double score = sc.nextInt();
				studentsData.put(name, score);
				break;
			case 2:
				System.out.print("Enter the student's name to get the score: ");
				String studentName = sc.nextLine();
				Double studentScore = studentsData.get(studentName);
				if(studentScore != null) {
					System.out.println("Score for "+studentName+" is: "+studentScore);
				}
				else{
					System.out.println("Student not found");
				}
				break;
			case 3:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
