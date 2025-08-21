package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Collection_ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};
		
//		Collection_Comparable comparator = new Collection_Comparable();
		
		ArrayList marks = new ArrayList<>();
		marks.add(30);
		marks.add(50);
		marks.add(100);
		marks.add(90);
		marks.add(40);
		
		System.out.println(marks);
		Collections.sort(marks,c1);
		System.out.println(marks);
		
		
	}

}
