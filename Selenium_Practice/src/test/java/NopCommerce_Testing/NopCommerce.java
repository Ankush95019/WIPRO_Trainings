package NopCommerce_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NopCommerce {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test is running");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launching the browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Email']"))).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"challenge-stage\"]/div/label/span[2]")).click();
	}
	
	
	

}
