package DataProvider_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Simple {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "logInTestData")
	public void loginTest(String username,String password) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys(username);;
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		Thread.sleep(2000);
	}
	
	@DataProvider(name="logInTestData")
	public Object[][] logInData(){
		Object[][] data = {
				{"Admin","admin123"},
				{"Admin1","admin1234"},
				{"Admin2","admin12345"},				
				{"Admin3","admin123456"},				
				
		};
		return data;
	}
	
	@AfterMethod
	public void afterClassSetUp() {
		driver.quit();
	}

}
