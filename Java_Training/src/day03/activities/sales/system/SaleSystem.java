package day03.activities.sales.system;
import day03.activities.sales.system.SaleItem;

public class SaleSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// by array method
		SaleItem[] items = {
				new SaleItem("Laptop",50000,10),
				new SaleItem("Pen",10,6),
				new SaleItem("Shirt",600,7)
		};
		System.out.println("--------------------------------------------------------------------------------------------");

		double grandTotal = 0;
		for(SaleItem item: items) {
			item.display();
			grandTotal += item.totalCostPerProduct();
		}
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Grand Total: "+grandTotal);
		
		
		// by using normal method 
//		SaleItem s1 = new SaleItem(10);
//		SaleItem s2 = new SaleItem(5);
//		SaleItem s3 = new SaleItem(7);
//		s1.setProductName("Shoes");
//		s1.setPrice(1100);
//		s2.setProductName("Pen");
//		s2.setPrice(10);
//		s3.setProductName("Shirt");
//		s3.setPrice(500);
//		System.out.println("----------------------------------------------------------------------------------------");
//		s1.display();
//		s1.totalCostPerProduct();
//		s2.display();
//		s2.totalCostPerProduct();
//		s3.display();
//		s3.totalCostPerProduct();
//		
//		double grandTotal = 0;
//		grandTotal = s1.totalCostPerProduct()+ s2.totalCostPerProduct() + s3.totalCostPerProduct();
//		System.out.println("Grand Total: "+grandTotal);
//		System.out.println("----------------------------------------------------------------------------------------");

	}

}
