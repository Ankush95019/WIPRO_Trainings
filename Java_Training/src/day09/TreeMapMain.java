package day09;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> studentData = new TreeMap<String,Integer>();
		studentData.put("Vishal",430);
		studentData.put("Sudhir Kumar",300);
		studentData.put("Rahul",450);
		studentData.put("Ankush",350);
		
		System.out.println(studentData);
		
		for(String key: studentData.keySet()) {
			System.out.println(key+": "+studentData.get(key));
		}
		
	}

}
