package day08;

class Mul5 implements Runnable{
	public void run() {
		for(int i = 1;i <= 10;i++)
			System.out.println("This is Ankush");
		}
}
class Mul6 implements Runnable{
	public void run() {
		for(int i = 1;i <= 10;i++)
			System.out.println("Today topic is Multithreading");
	}
}

public class MultiThreadingThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accessing through interface
		Runnable m3 = new Mul3();
		Runnable m4 = new Mul4();
		
		// using runnable
		Thread t1 = new Thread(m3); 
		Thread t2 = new Thread(m4);
		
		
		
		t1.start();
		t2.start();
	}

}
