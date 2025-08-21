package day11;

import java.util.ArrayList;

public class JavaCollections {
	
	class Department{
		private String name;
		private double sales;
		private double expenses;
		
		public Department(String name,double sales,double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		
		public double getProfit() {
			return sales-expenses;
		}
		
		public String getName() {
			return name;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Department> depart = new ArrayList<Department>();
		depart.add(new JavaCollections().new Department("Sales",8000,3000));
		depart.add(new JavaCollections().new Department("Marketing",5000,4000));
		depart.add(new JavaCollections().new Department("Reasearch",6000,4000));
	
		
		for(Department d: depart) {
			System.out.println("Department Name: "+d.getName() + ", Profit: "+d.getProfit());
		}
		
		depart.sort((d1,d2) -> Double.compare(d2.getProfit(),d1.getProfit()));
		
		for(Department d: depart) {
			System.out.println("Department Name: "+d.getName() + ", Profit: "+d.getProfit());
		}
		System.out.println("Sorting done successfully");
		
		
	}

}
