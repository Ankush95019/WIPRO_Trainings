package day08;

class Mul3 implements Runnable{
	public void run() {
		for(int i = 1;i <= 10;i++)
			System.out.println("This is Ankush");	
			try {
				Thread.sleep(1200);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}
class Mul4 implements Runnable{
	public void run() {
		for(int i = 1;i <= 10;i++)
			System.out.println("Today topic is Multithreading");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}

public class MultipleThreadingTwo {
	public static void main(String[] args) {
//		Mul3 m3 = new Mul3();
//		Mul4 m4 = new Mul4();
		
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

