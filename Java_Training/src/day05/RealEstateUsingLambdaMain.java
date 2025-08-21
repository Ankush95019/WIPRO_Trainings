package day05;

interface Property1{
	double propertyExpenseCalculator(double rent,double waterBill,double electricityBill);
}


public class RealEstateUsingLambdaMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property1 houseMonthlyExpenses = (rent,waterBill,electricityBill) -> rent+waterBill+electricityBill;
		Property1 houseYearlyExpenses = (rent,waterBill,electricityBill) -> (rent+waterBill+electricityBill)*12;
		double rnt = 30000, wb = 550, eb = 1000;
		System.out.println("***** Monthly Expenses of House *****");
		System.out.println("House Rent: ₹" + rnt + "\tWater Bill: ₹" + wb + "\tElectricity Bill: ₹" + eb);			
		System.out.println("Monthly Expenses of House: ₹"+houseMonthlyExpenses.propertyExpenseCalculator(rnt,wb,eb));
		System.out.println("Yearly Expenses of House: ₹"+houseYearlyExpenses.propertyExpenseCalculator(rnt,wb,eb));
		
		System.out.println("\n******************************************************************************\n");
		System.out.println("***** Monthly Expenses of Apartment *****");
		System.out.println("Apartment Rent: ₹" + rnt + "\tWater Bill: ₹" + wb + "\tElectricity Bill: ₹" + eb);			
		System.out.println("Yearly Expenses of Apartment: ₹"+houseYearlyExpenses.propertyExpenseCalculator(rnt,wb,eb));
	}

}
