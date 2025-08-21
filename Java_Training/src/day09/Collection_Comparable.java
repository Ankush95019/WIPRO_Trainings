package day09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Collection_Comparable implements Comparable<Collection_Comparable> {

	String name = "Ankush";
	int age = 25;

	public Collection_Comparable(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Collection_Comparable other) {
		return this.age-other.age;
	}
	
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Collection_Comparable> l1 = Arrays.asList(new Collection_Comparable("Ankush",24),
				new Collection_Comparable("Vishal",25));
		
		Collections.sort(l1);
		System.out.println(l1);
		
		
	}


}
