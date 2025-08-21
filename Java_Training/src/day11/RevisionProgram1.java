package day11;

import java.util.LinkedList;
import java.util.List;

class CarSellingSystem{
	
	private String carName;
	private int carModel;
	private double sellingPrice;
	private double costPrice;
	
	public CarSellingSystem(String carName,int carModel,double sellingPrice,double costPrice) {
		this.carName = carName;
		this.carModel = carModel;
		this.sellingPrice = sellingPrice;
		this.costPrice = costPrice;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	
	public double getProfit() {
		return sellingPrice - costPrice;
	}
	
	public double getDiscount() {
		return 0;
	}
	
	
	
}

public class RevisionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CarSellingSystem> carSellingSystem = new LinkedList<CarSellingSystem>();
		carSellingSystem.add(new CarSellingSystem("Swift",2020,200000,190000));
		carSellingSystem.add(new CarSellingSystem("Amaze",2024,600000,580000));
		carSellingSystem.add(new CarSellingSystem("KIA",2022,900000,895000));
		carSellingSystem.add(new CarSellingSystem("Fortuner",2023,800000,770000));
		
		carSellingSystem.sort((a,b) -> Double.compare(b.getProfit(),a.getProfit()));
		
		for(CarSellingSystem cs: carSellingSystem) {
			System.out.println("Car Name: "+cs.getCarName()+", Car Model: "+cs.getCarModel()+", Car Selling Price: "+cs.getSellingPrice()+", Car Cost Price: "+cs.getCostPrice()+", Car Profit: "+cs.getProfit());			
		}
	
	}

}
