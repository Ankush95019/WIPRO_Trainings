package day05;

import java.util.Scanner;

class Students{
	String name;
	int roll_number;
	String department;
	String attendanceStatus;
	
	public Students(String name,int roll_number,String department,String attendanceStatus) {
		this.name = name;
		this.roll_number = roll_number;
		this.department = department;
		this.attendanceStatus = attendanceStatus;
	}
	
}

class AttendanceManager{
	Students[] studentList;
	
	public AttendanceManager(Students[] studentList) {
		this.studentList = studentList;
	}
	
	void displayPresentList() { 
		for(Students student: studentList) {
			if(student.attendanceStatus.equals("Present")){
				System.out.println(student.name + " - " + student.attendanceStatus);
			}
		}
	}
	void displayAbsentList() { 
		for(Students student: studentList) {
			if(student.attendanceStatus.equals("Absent")){
				System.out.println(student.name + " - " + student.attendanceStatus);
			}
		}
	}
}

public class AttendanceSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// dynamic way
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfStudents = sc.nextInt();
		sc.nextLine();
		
		Students[] student = new Students[numberOfStudents];
		for(int i = 0;i < numberOfStudents;i++) {
			System.out.println("\nEnter details of for Student "+(i+1));
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Roll Number: ");
			int roll_number = sc.nextInt();
			System.out.println("Enter Department name: ");
			sc.nextLine();
			String department = sc.nextLine();
			System.out.println("Enter Attendance Status as (Present/Absent): ");
			String attendanceStatus = sc.nextLine();
			
			student[i] = new Students(name,roll_number,department,attendanceStatus);
		}
		
		
		// non -dynamic way
//		Students[] student = {
//				new Students("Ankush",1915338,"CSE","Present"),
//				new Students("Rahul",1915339,"IT","Present"),
//				new Students("Vishal Rana",1915340,"CSE","Absent"),
//				new Students("Rohit",1915341,"ECE","Present"),
//				new Students("Sudhir Kumar",1915342,"ECE","Present"),
//				new Students("Aakash Kumar",1915343,"ECE","Present"),
//				new Students("Sunil Kumar",1915344,"CCE","Absent"),
//		};
		
		AttendanceManager am = new AttendanceManager(student);
		System.out.println("\n***** Present List of Students *****");
		am.displayPresentList();
		System.out.println("\n***** Absent List of Students *****");
		am.displayAbsentList();
		
		
		sc.close();
		
	}

}
