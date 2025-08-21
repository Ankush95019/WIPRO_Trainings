package excel_Integration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Excel_Test {
	
	WebDriver driver;
	
	
//	@BeforeMethod
//	public void setUp() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod(alwaysRun = true)
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
	
	@Test (dataProvider = "credentials", dataProviderClass = Excel_Integration.class)
//	@Test(dataProvider = "credentials")
	public void loginTest(String email, String password) {
		driver.get("https://demowebshop.tricentis.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		if(Assert.assertFalse(condition)driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]"))) {
//			
//		}
	
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
