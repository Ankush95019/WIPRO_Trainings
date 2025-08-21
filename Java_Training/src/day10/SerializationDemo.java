package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student_1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Student(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
	
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student_1 s1 = new Student_1();
		s1.setName("Ankush");
		s1.setAge(25);
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\Ankush\\Documents\\try_catch_file.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		output.writeObject(s1);
		out.close();
		output.close();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Ankush\\Documents\\try_catch_file.txt");
		ObjectInputStream input = new ObjectInputStream(in);
		Student_1 s2 = (Student_1) input.readObject();
		
	}

}
