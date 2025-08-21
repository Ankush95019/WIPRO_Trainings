package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(100,200,500,400,300,900));		
		a1.add(4000);
		a1.add(8000);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("Sorted: "+a1);
		int b = Collections.binarySearch(a1, 4000);
		System.out.println("index of 4000 in sorted list: "+b);
		Collections.reverse(a1);
		System.out.println(a1);
		
		
	}

}
