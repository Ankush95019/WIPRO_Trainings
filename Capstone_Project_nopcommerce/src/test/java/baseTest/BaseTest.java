package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	
	protected WebDriver driver;
	String url = "https://demo.nopcommerce.com";
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public WebDriver getBaseDriver() {
		return driver;
	}
	
	
//	@AfterClass
//	public void tearDown() {
//		if(driver != null) {
//			driver.close();
//		}
//	}
	

}
