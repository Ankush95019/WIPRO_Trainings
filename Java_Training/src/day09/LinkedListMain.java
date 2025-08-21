package day09;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = new LinkedList<Integer>();
		data.add(34);
		data.add(65);
		data.add(88);
		data.add(50);
		data.add(20);
		
		System.out.println(data);
		
		for(Integer i: data) {
			System.out.println(i);
		}
	}

}
