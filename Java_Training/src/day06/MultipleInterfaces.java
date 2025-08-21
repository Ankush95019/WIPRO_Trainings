package day06;

interface A{
	void a();
	void show();
}
interface B{
	void b();
	void show();
}
interface C{
	void c();
	void show();
}
interface D{
	void d();
	void show();
}

public interface MultipleInterfaces {
	void greet(); // abstract method and we need to define it's body in implemented class that means we are overriding
	
	default void greet1() { // default method it allows us to define body in the interface and call with object
		System.out.println("I am Default method"); // we can override this also
	}
	
	static void greet2() { // static method it allows us to define body in the interface and cannot be override
		System.out.println("I am Static method"); // static methods call with interface name
	}
	
}
