package day06;

public class ImplementingInterfaces implements A,B,C,D,MultipleInterfaces{
	
	public void a() {
		System.out.println("Interface A method a() is called and override in ImplementingInterfaces Class");
	}
	
	
	public void b() {
		System.out.println("Interface B method b() is called and override in ImplementingInterfaces Class");
	}
	
	public void c() {
		System.out.println("Interface C method c() is called and override in ImplementingInterfaces Class");
	}
	
	public void d() {
		System.out.println("Interface D method d() is called and override in ImplementingInterfaces Class");
	}
	
	public void show() {
		System.out.println("Multiple Interfaces common method show() is called and override in ImplementingInterfaces Class");
	}
	
	// Multiple interfaces
	public void greet() {
		System.out.println("I am an Abstract method");
	}
//	public void greet1() {
//		System.out.println("I am Default method and also override in ImplementingInterfaces Class");
//	}
}
