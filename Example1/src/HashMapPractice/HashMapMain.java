package HashMapPractice;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a HashMap object it has key value pairs
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("India", "Delhi");
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "NY");
		
		// key values we can get an items using get()
		System.out.println(capitalCities.get("USA"));
		
		// removing an item
//		capitalCities.remove("Germany");
		
		// to clear -- clear()
//		capitalCities.clear();
		
		// find size of HashMap -- size()
		System.out.println(capitalCities.size());
		
		// keySet() -- getting only keys
		// values() -- to get only values
		
		// loop through the keys
//		for(String i : capitalCities.keySet()) {
//			System.out.println(i);
//		}
//		for(String i : capitalCities.values()) {
//			System.out.println(i);
//		}
		
		// to get keys and values loop through
		
		for(String i: capitalCities.keySet()) {
			System.out.println("Key: "+i+", Value: "+capitalCities.get(i));
		}
		
		System.out.println(capitalCities);
		
	}

}
