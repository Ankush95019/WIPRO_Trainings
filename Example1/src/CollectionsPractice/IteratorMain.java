package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iterator is an object that is used to 
		// loop through collection of group of data
		
		//Make a collection
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Litchi");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1000);
		numbers.add(40);
		numbers.add(400);
		numbers.add(500);
		numbers.add(20);
		
		// getting an iterator()
		
		Iterator<String> it = fruits.iterator();
		Iterator<Integer> it1 = numbers.iterator();
		
		// print first item from the list of items
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		// loop through of iterator
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		while(it1.hasNext()) {
			Integer i = it1.next();
			if( i < 100) {
				it1.remove();
			}
		}
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		
	}

}
