package day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student o) {
        // Default comparison by age
        return Integer.compare(this.age, o.age);
    }
}

public class ComparatorStringMain {

    public static void main(String[] args) {

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(24, "Ankush"));
        stud.add(new Student(25, "Vishal"));
        stud.add(new Student(22, "Sudhir"));

        // Sort by name using Comparator
        Comparator<Student> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        stud.sort(nameComparator);

        // Print sorted list
        for (Student s : stud) {
            System.out.println(s);
        }
    }
}

//package day10;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//class Student implements Comparable<Student>{
//	int age;
//	String name;
//	
//	public Student(int age,String name) {
//		this.age = age;
//		this.name = name;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [age=" + age + ", name=" + name + "]";
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}
//}
//
//public class ComparatorStringMain {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		ComparatorStringMain<Integer> com = new ComparatorStringMain<Integer>();
//		public int compare(Integer i,Integer j) {
//			return ;
//		}
//		
//		List<Student> stud = new ArrayList<>();
//		stud.add(new Student(24,"Ankush"));
//		stud.add(new Student(25,"Vishal"));
//		stud.add(new Student(22,"Sudhir"));
//		
//		System.out.println(stud);
//		
//		for(Student s:stud) {
//			System.out.println(s);
//		}
//	}
//
//}
