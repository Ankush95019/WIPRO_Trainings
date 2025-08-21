package day05;

interface WiproSystem{
	void deviceType();
	void deviceBrand();
}

class Desktop implements WiproSystem{
	public void deviceType(){
		System.out.println("Wipro provided device is: DESKTOP123");
	}
	public void deviceBrand(){
		System.out.println("Device brand HP1234");
	}
}
class Laptop implements WiproSystem{
	public void deviceType(){
		System.out.println("Wipro provided device is: LAPTOP123");
	}
	public void deviceBrand(){
		System.out.println("Device brand Dell1234");
	}
}

public class WiproDevicesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WiproSystem wp = new Desktop();
		wp.deviceType();
		wp.deviceBrand();
		WiproSystem wp1 = new Laptop();
		wp1.deviceType();
		wp1.deviceBrand();
	}

}
