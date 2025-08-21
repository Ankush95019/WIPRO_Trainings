package day05;

abstract class Property{
	abstract double propertyMonthlyExpenses(double elecCons,double waterCons,double rent);
	abstract void displayPropertyMonthlyBreakdown();
	abstract void propertyYearlyExpenses();
}

class House extends Property{
	double electricityConsumption;
	double waterConsumption;
	double rent;
	
	double propertyMonthlyExpenses(double elecCons,double waterCons,double rent) {
		this.electricityConsumption = elecCons;
		this.waterConsumption = waterCons;
		this.rent = rent;
		double totalMonthlyExpenses = rent + waterCons + elecCons;	
		return totalMonthlyExpenses;
	}
	
	void displayPropertyMonthlyBreakdown() {
		System.out.println("***** Monthly Property Expense Calculator for House *****");
		System.out.println("House Rent: ₹" + rent + "\tWater Bill: ₹" + waterConsumption + "\tElectricity Bill: ₹" + electricityConsumption);			
		System.out.println("Total Monthly Expenses of House ₹"+propertyMonthlyExpenses(electricityConsumption,waterConsumption,rent));	
	}
	
	void propertyYearlyExpenses() {
		System.out.println("***** Yearly Property Expense Calculator for House *****");
		System.out.println("House Rent: ₹" + (rent*12) + "\tWater Bill: ₹" + (waterConsumption*12) + "\tElectricity Bill: ₹" + (electricityConsumption*12));				
		System.out.println("Total Yearly Expenses of House ₹"+(propertyMonthlyExpenses(electricityConsumption,waterConsumption,rent)*12));		
	}
}
class Apartment extends Property{
	double electricityConsumption;
	double waterConsumption;
	double rent;
	
	double propertyMonthlyExpenses(double elecCons,double waterCons,double rent) {
		this.electricityConsumption = elecCons;
		this.waterConsumption = waterCons;
		this.rent = rent;
		double totalMonthlyExpenses = rent + waterCons + elecCons;	
		return totalMonthlyExpenses;
	}
	
	void displayPropertyMonthlyBreakdown() {
		System.out.println("***** Monthly Property Expense Calculator for Apartment *****");
		System.out.println("Apartment Rent: ₹" + rent + "\tWater Bill: ₹" + waterConsumption + "\tElectricity Bill: ₹" + electricityConsumption);			
		System.out.println("Total Monthly Expenses of Apartment ₹"+propertyMonthlyExpenses(electricityConsumption,waterConsumption,rent));	
	}
	
	void propertyYearlyExpenses() {
		System.out.println("***** Yearly Property Expense Calculator for Apartment *****");
		System.out.println("Apartment Rent: ₹" + (rent*12) + "\tWater Bill: ₹" + (waterConsumption*12) + "\tElectricity Bill: ₹" + (electricityConsumption*12));				
		System.out.println("Total Yearly Expenses of Apartment ₹"+(propertyMonthlyExpenses(electricityConsumption,waterConsumption,rent)*12));		
	}
}



public class PropertyExpenesesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property house = new House();
		house.propertyMonthlyExpenses(3000.50,950.20,20000);
		house.displayPropertyMonthlyBreakdown();
		System.out.println("");
		house.propertyYearlyExpenses();
		System.out.println("\n*********************************************************************************\n");
		Property apartment = new Apartment();
		apartment.propertyMonthlyExpenses(4000.50,850.20,30000);
		apartment.displayPropertyMonthlyBreakdown();
		System.out.println("");
		apartment.propertyYearlyExpenses();
		
		System.out.println("");
		System.out.println("Thanks for using Property Expense Calculator");
	}

}
