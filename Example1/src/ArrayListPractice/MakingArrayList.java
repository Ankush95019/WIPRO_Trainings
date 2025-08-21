package ArrayListPractice;
import java.util.ArrayList;
import java.util.Collections;

public class MakingArrayList {
	public static void main(String[] args) {
		// ArrayList declaration
		ArrayList<String> fruits = new ArrayList<String>();
//		ArrayList<Double> marks = new ArrayList<Double>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Pineapple");
//		System.out.println(fruits);
		
		// accessing single item based on index
		// can't use fruits[0] ❌ wrong
//		System.out.println(fruits.get(0));
//		System.out.println(fruits.get(3));
//		System.out.println(fruits.getFirst());
//		System.out.println(fruits.getLast());
		
		// change items inside an ArrayList -- set()
//		fruits.set(0,"Kiwi");
		
		// remove item from ArrayList
//		fruits.remove(0);
		
		// clear all items from ArraList
//		fruits.clear();
//		fruits.set(0,"Kiwi");
		
		// to find the size of an ArrayList -- size()
		System.out.println("Size of Array is: "+fruits.size());
		
		// sorting the items of ArrayList
		
		Collections.sort(fruits);
		
		// using for loop and for each statement loop
		System.out.println("\nAccessing Elements Using Loop");
		
//		for(int i = 0;i < fruits.size();i++) {
//			System.out.println(fruits.get(i));
//		}
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
