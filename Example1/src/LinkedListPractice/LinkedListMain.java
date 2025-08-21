package LinkedListPractice;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("UK");
		countries.add("Canada");
		
		System.out.println(countries);
		
		countries.addFirst("Germany");
		countries.addFirst("Africa");
		countries.add(7,"Singapore");
		
		countries.removeFirst();
		countries.removeLast();
		System.out.println(countries);
		System.out.println(countries.size());
		
		System.out.println(countries.getFirst());
		System.out.println(countries.getLast());
		
		Collections.sort(countries);
		System.out.println(countries);
		// accessing using loop
//		for(String country: countries) {
//			System.out.println(country);			
//		}
		
	}

}
