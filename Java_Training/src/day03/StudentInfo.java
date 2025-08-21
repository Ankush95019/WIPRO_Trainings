package day03;

class Student{
	String name;
	int age;
	int roll_number;
	
	void display() {
		System.out.println("Name: "+name+"\tAge: "+age+"\tRoll Number: "+roll_number);		
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Ankush";
		s1.age = 23;
		s1.roll_number = 1915338;
		s1.display();
	}

}
