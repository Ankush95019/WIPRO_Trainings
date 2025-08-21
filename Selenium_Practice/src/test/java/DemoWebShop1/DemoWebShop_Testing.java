package DemoWebShop1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoWebShop_Testing {
	
	WebDriver driver;

	
	@Parameters({"browserName","url"})
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browserName,String url) {

		switch(browserName) {
			case "Chrome":
				driver = new ChromeDriver();
				break;
			
			case "Edge":
				driver = new EdgeDriver();
				break;
				
			case "FireFox":
				driver = new FirefoxDriver();
				break;
				
			default:
				System.out.println("Browser Invalid");
				break;
		}
		System.out.println("Launching "+browserName+" browser...");
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority=1 , groups = {"smoke"})
	public void loginUser() {
//		driver.get("https://demoweb.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		
		driver.findElement(By.id("Email")).sendKeys("marvel01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("IronMan");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test(priority=2, groups = {"smoke"})
	public void goToElectronics() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/electronics'])[1]"))).click();
		
	}
	
	
	@Test(priority=3, groups = {"smoke"})
	public void goToCellPhones() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/cell-phones'])[4]"))).click();
		
	}
	
	
	@Test(priority=4, groups = {"smoke"})
	public void selectingItem() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Smartphone"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Smartphone']"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='/smartphone'])[2]"))).click();
		
	}
	@Test(priority=5, groups = {"sanity"})
	public void addToCart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button-43"))).click();
		
	}
	
	
	
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		System.out.println("After test is running successfully");
		if(driver != null) {
			Thread.sleep(5000);
			driver.quit();
			System.out.println("Browser closed successfully");
		}
	}
	

}
