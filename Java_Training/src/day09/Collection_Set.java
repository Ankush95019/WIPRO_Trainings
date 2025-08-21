package day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> data = new HashSet<Integer>();
		data.add(30);
		data.add(10);
		data.add(60);
		data.add(40);
		data.add(40);
//		data.add("Hello");
		System.out.println(data);
		
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
