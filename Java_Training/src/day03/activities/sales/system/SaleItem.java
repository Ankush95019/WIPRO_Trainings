package day03.activities.sales.system;

class SaleItem {
	private String productName;
	private double price;
	private int quantitySold;
	
	// using constructor
	public SaleItem(String productName, double price, int quantitySold) {
		this.productName = productName;
		this.price = price;
		this.quantitySold = quantitySold;
	}
	
	// using getter and setter methods
//	public SaleItem(int quantitySold) {
//		this.quantitySold = quantitySold;
//	}
//	
//	public void setProductName(String productName) {
//		this.productName =  productName;
//	}
//	
//	public void setPrice(double price) {
//		this.price =  price;
//	}
	
	public double totalCostPerProduct() {
		return price*quantitySold;
	}
	
	public void display() {
		System.out.println("Product Name: "+productName+", Price: Rs"+price+", Quantity Sold: "+quantitySold+", Total Cost Per Product: "+totalCostPerProduct()+"\n");;
	}
}
