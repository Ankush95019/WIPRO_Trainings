package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("data structure");
		courses.add("C++");
		
		System.out.println("Array:");
		for(String i: courses) {
			System.out.println(i);
		}
		
		Set<Integer> courses1 = new HashSet<>();
		courses1.add(100);
		courses1.add(150);
		courses1.add(50);
		courses1.add(10);
		
		System.out.println("\nSet:");
		for(int i: courses1) {
			System.out.println(i);
		}
		
		Map<String,Integer> courseDuration = new HashMap<>();
		courseDuration.put("Java",100);
		courseDuration.put("Python",50);
		courseDuration.put("DSA",200);
		
		System.out.println("\nMap:");
		for(String cd: courseDuration.keySet()) {
			System.out.println(cd+" = "+courseDuration.get(cd));
		}
		
	}

}
