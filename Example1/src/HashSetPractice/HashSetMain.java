package HashSetPractice;
import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating HashSet object
		// collection of items, where item is unique
		HashSet<String> sports = new HashSet<String>();
		
		// adding data into HashSet using -- add()
		sports.add("Cricket");
		sports.add("Footbal");
		sports.add("Tennis");
		sports.add("Badminton");
		sports.add("Cricket"); // duplicate so it's not added
		
		// contains() check item exist or not --> true or false
		System.out.println(sports.contains("Cricket"));
		
		// remove an item
		sports.remove("Footbal");
		
		// clear all items
//		sports.clear();
		
		// finding size of HashSet
		System.out.println(sports.size());
		
		// loop through HashSet
		
		for(String sport: sports) {
			System.out.println(sport);
		}
		
		
		System.out.println(sports);
		
		
	}

}
