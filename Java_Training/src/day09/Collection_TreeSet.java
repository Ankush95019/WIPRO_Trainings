package day09;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TreeSet is in sorted order
		Set<Integer> data = new TreeSet<Integer>();
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
