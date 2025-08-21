package day09;

import java.util.HashMap;
import java.util.Map;

public class Collections_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> data = new HashMap<String,Integer>();
		data.put("A",65);
		data.put("B",66);
		data.put("C",67);
		data.put("D",68);
		data.put("E",69);
		
		System.out.println(data.keySet());
		System.out.println(data.values());
		
		for(String key: data.keySet()) {
			System.out.println(key+": "+data.get(key));
		}
		
	}

}
