package day09;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "123";
		int i = Integer.parseInt(s1); // converting string to integer using parseInt()
		System.out.println(i);
		
		String s2 = "145.65";
		double d = Double.parseDouble(s2);
		System.out.println(d);
		
		String s3 = "17.5";
		float f = Float.parseFloat(s3);
		System.out.println(f);
		
	}

}
