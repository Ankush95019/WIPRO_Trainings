package testCases;


import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import excel_Integration.ExcelPathProvider;
import excel_Integration.Excel_Integration;
import pages.Checkout_Page;
import pages.Computers_Page;
import pages.Desktops_Page;
import pages.LoginPage;
import pages.RegisterPage;
import pages.ShoppingCart_Page;
import pages.SubModules_Page;

@Listeners(testUtilities.Listner_Report.class)

public class AllTestCase extends BaseTest{
	
	String nopCommerceExpectedDataFilePath = ExcelPathProvider.getExcelPath("nopCommerceExpectedData.xlsx");
	
	@Test(priority = 1)
	public void registerTestCase() {
		
		Map<String, String> expectedDataMap = new Excel_Integration().readExcel(nopCommerceExpectedDataFilePath, "registerData");
		
		/***************  validating Register page called here  ***************/
		RegisterPage regPage = new RegisterPage(driver);
		System.out.println("Register Test Case Started...");
//		String actualErrorString = regPage.registerWithEpmtyFields();
//		Assert.assertTrue(actualErrorString.contains("First name is required."));
		regPage.validatingRegisterPage(expectedDataMap);
		System.out.println("Register Test Case Completed Successfully...");
	}
	
	@Test(priority = 2)
	public void loginTestCase() throws InterruptedException {
		Map<String, String> validExpectedDataMap = new Excel_Integration().readExcel(nopCommerceExpectedDataFilePath, "validLoginCredentials");
		Map<String, String> invalidExpectedDataMap = new Excel_Integration().readExcel(nopCommerceExpectedDataFilePath, "invalidLoginCredentials");
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("Login Test Case started...");
		
		/***************  Edge case called here  ***************/
		String actualErrorString = loginPage.loginWithEpmtyFields();
		Assert.assertTrue(actualErrorString.contains("Please enter your email"));
		
		/***************  login with invalid credentials page called here  ***************/
		loginPage.loginWithInvalidCredentials(invalidExpectedDataMap);
		
		/***************  validating login page called here  ***************/
		loginPage.validatingLoginPage(validExpectedDataMap);
		System.out.println("Login Test Case Completed Successfully...");
	}
	
	
	@Test(priority = 3)
	public void verifysubModulesTestCase() {
		
		/***************  verify SubModules called here  ***************/
		
		SubModules_Page subModules_Page = new SubModules_Page(driver);
		System.out.println("Verify SubModules Test Case Started...");
		
		/***************  Edge case called here  ***************/
		Assert.assertTrue(subModules_Page.verifySubModules(),"Failed to verify SubModules Test Case");
		System.out.println("Verify SubModules Case Completed Successfully...");		
		
	}
	
	@Test(priority = 4)
	public void verifyHoverOnComputersSubListElements() throws InterruptedException {
		
		/***************  verify Computers Hover SubList called here  ***************/
		Computers_Page computers_Page = new Computers_Page(driver);
		System.out.println("Verify Hover On Computers SubList Test Case Started...");
		computers_Page.verifyHoverOnComputers();
		System.out.println("Verify Hover On Computers SubList Test Case Completed Successfully...");
	}
	
	
	@Test(priority = 5)
	public void verifyDesktopAddToCartTestCase() {
		Map<String, String> productDataMap = new Excel_Integration().readExcel(nopCommerceExpectedDataFilePath, "productData");
	
		/***************  verify Computers Hover SubList called here  ***************/
		Desktops_Page desktops_Page = new Desktops_Page(driver);
		System.out.println("Verify Desktop Add To Cart Test Case Started...");
		desktops_Page.goToDesktops();
//		desktops_Page.sortBy();
		Assert.assertTrue(desktops_Page.clickOnProduct(productDataMap),"Failed to found given product");
		desktops_Page.setSpecificationsAndAddToCart(productDataMap);
		System.out.println("Verify Desktop Add To Cart Test Case Completed Successfully...");
		
	}
	
	
	@Test(priority = 6)
	public void verifyShOppingCartTestCase() throws InterruptedException {
		
		/***************  verify Hover On Shopping Cart called here  ***************/
		ShoppingCart_Page shoppingCart_Page = new ShoppingCart_Page(driver);
		System.out.println("Verify Shopping Cart Test Case Started...");
		shoppingCart_Page.hoverOnShoppingCart();
		System.out.println("Verify Shopping Cart Test Case Completed Successfully...");
		
		
	}
	
	
	@Test(priority = 7)
	public void verifyCheckoutProcessTestCase() throws InterruptedException {
		Map<String, String> checkoutDataMap = new Excel_Integration().readExcel(nopCommerceExpectedDataFilePath, "checkoutData");
		
		/***************  verify Checkout Process  called here  ***************/
		Checkout_Page checkout_Page = new Checkout_Page(driver);
		System.out.println("Verify CheckOut Process Test Case Started...");
		checkout_Page.checkoutValidation();
		checkout_Page.billingAddresValidation(checkoutDataMap);
		System.out.println("Verify CheckOut Process Test Case Completed Successfully...");	
	}
	
	
}
