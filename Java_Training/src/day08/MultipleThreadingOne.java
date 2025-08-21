package day08;



class Mul1 extends Thread{
	public void run() {
		for(int i = 1;i <= 200;i++)
			System.out.println("This is Ankush");	
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}
class Mul2 extends Thread{
	public void run() {
		for(int i = 1;i <= 200;i++)
			System.out.println("Today topic is Multithreading");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}

public class MultipleThreadingOne {
	public static void main(String[] args) {
		Mul1 m1 = new Mul1();
		Mul2 m2 = new Mul2();
//		m2.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(m2.getPriority());
		m1.start();
		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		m2.start();
	}
}
