package day05;

abstract class Vehicle1 {
	
	abstract void speed();
	abstract void brand();

}

class Car extends Vehicle1{
	void speed(){
		System.out.println("Speed of the car: 40km/hr");
	}
	void brand() {
		System.out.println("Car brand is BMW");
	}
}
class Bike extends Vehicle1{
	void speed(){
		System.out.println("Speed of the bike: 50km/hr");
	}
	void brand() {
		System.out.println("Bike brand is Pulsar 220f");
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v1 = new Car();
		v1.speed();
		v1.brand();
		Vehicle1 v2 = new Bike();
		v2.speed();
		v2.brand();
	}
}





