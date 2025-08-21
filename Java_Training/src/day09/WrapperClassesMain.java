package day09;

public class WrapperClassesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		Integer i = a; // when we convert int to Integer it is called Auto boxing
		System.out.println(i);
		
//		int b = i.intValue(); // conversion Integer to int called auto unboxing
		
		int b = i;
		
		System.out.println(b);
		
		
	}
}
