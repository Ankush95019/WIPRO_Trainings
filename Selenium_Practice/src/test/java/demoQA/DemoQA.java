package demoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQA {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test(priority = 1)
	public void formTestingName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName"))).sendKeys("Ankush");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName"))).sendKeys("Dogra");
		System.out.println("1. Name Passes Successfully");
	}
	
	@Test(priority = 2)
	public void formTestingEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail"))).sendKeys("ankush123@gmail.com");
		System.out.println("2. Email Passes Successfully");
	}
	
	@Test(priority = 3)
	public void formTestingGender() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Male']"))).click();
		System.out.println("3. Gender Passes Successfully");
	}
	
	@Test(priority = 4)
	public void formTestingNumber() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userNumber"))).sendKeys("987654325");
		System.out.println("4. Number Passes Successfully");
	}
	
	@Test(priority = 5)
	public void formTestingDOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#dateOfBirthInput"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='15']"))).click();
		System.out.println("5. DOB Passes Successfully");
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("dateOfBirthInput"))).sendKeys("27 08 2001");
	}
	
	@Test(priority = 6)
	public void formTestingSubjects() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('subjectsInput').style.display='block';");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("subjectsInput"))).sendKeys("Engli");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='English']"))).click();
		System.out.println("6. Subjects Passes Successfully");
	}
	
	@Test(priority = 7)
	public void formTestingCheckBox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Sports']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Music']"))).click();
		System.out.println("7. CheckBox Passes Successfully");
	}
	
	@Test(priority = 8)
	public void formTestingUploadPicture() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("uploadPicture"))).sendKeys("C:\\Users\\Ankush\\Desktop\\TryExample.xlsx");
		System.out.println("8. Upload Picture Passes Successfully");
	}
	
	@Test(priority = 9)
	public void formTestingAddress() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("currentAddress"))).sendKeys("#123 ABCD EFGH IJHL MNOP\n 5678");
		System.out.println("9. Address Passes Successfully");
	}
	
//	@AfterTest
//	public void tearDown(){ 
//		if(driver!=null) {
//			driver.quit();
//		}
//	}
	

}
