package day06;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingInterfaces i1 = new ImplementingInterfaces();
		//  accessing multiple interfaces with i1 object
		i1.a();
		i1.b();
		i1.c();
		i1.d();
		
		System.out.println("\n");
		// accessing common method
		i1.show();
		
		System.out.println("\n");
		// accessing by creating the reference of interface and assigning the object
		A a1 = i1;
		a1.a();
		a1.show();
		
		System.out.println("\n");
		// another way
		B b1 = new ImplementingInterfaces();
		b1.b();
		b1.show();
		
		System.out.println("\n");
		System.out.println("Hi, this program have an abstract method, default method and static method");
		i1.greet(); // abstract method
		i1.greet1(); // default method is called
		MultipleInterfaces.greet2(); // static method is called
		
	}

}
