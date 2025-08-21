package day03;

public class CarModel{

	class CarDetails {
		private String modal;
		private int year;
		
		public void setModal(String modal,int year) {
			this.modal = modal;
			this.year = year;
		}
		
		public String getModal() {
			return modal;
		}
		public int getYear() {
			return year;
		}
		
		public static void main(String[] args) {
			CarModel c1 = new CarModel();
			CarDetails car = c1.new CarDetails();
			car.setModal("BMW", 2000);
			System.out.println("Model name is: "+ car.getModal());
			System.out.println("Year is: "+ car.getYear());
		}
	}
}