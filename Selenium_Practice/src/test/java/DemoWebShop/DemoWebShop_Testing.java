package DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop_Testing {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test is running successfully");
	}
	
	@Test (priority=1)
	public void launchBrowser() {		
		System.out.println("Launching browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void loginUser() {
		driver.get("https://demowebshop.tricentis.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		driver.findElement(By.id("Email")).sendKeys("marvel01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("IronMan");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@Test(priority=3)
	public void goToElectronics() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/electronics'])[1]"))).click();
		
	}
	
	
	@Test(priority=4)
	public void goToCamera() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/cell-phones'])[4]"))).click();
		
	}
	
	
	@Test(priority=5)
	public void selectingItem() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/smartphone'])[2]"))).click();
		
	}
	@Test(priority=6)
	public void addToCart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/smartphone'])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button-43"))).click();
		
	}
	
	
	
	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After test is running successfully");
//		if(driver != null) {
//			driver.quit();
//			System.out.println("Browser closed successfully");
//		}
//	}
	

}