package pages;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class LoginPage{
	
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	@FindBy(xpath =  "//a[text()='Log in']")
	WebElement loginElement;
	
	@FindBy(xpath =  "//a[@href='/logout']")
	WebElement logoutElement;
	
	@FindBy(name = "Email")
	WebElement emailElement;
	
	@FindBy(id = "Password")
	WebElement passwordElement;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButtonElement;
	
	@FindBy(id = "Email-error")
	WebElement emailErrorElement;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.commonEvents = new CommonEvents(driver); 
	}
	
	// edge case for validating the login with empty email and password fields
	public String loginWithEpmtyFields() {
		loginElement.click();
//		wait.until(ExpectedConditions.visibilityOf(loginElement)).click();
		commonEvents.highlight(loginElement);
		commonEvents.highlight(loginButtonElement);
		loginButtonElement.click();
		wait.until(ExpectedConditions.visibilityOf(emailErrorElement));
		commonEvents.highlight(emailErrorElement);
		System.out.println("login email error debug: "+emailErrorElement.getText());

		return emailErrorElement.getText();
	}
	
	
	public void loginWithInvalidCredentials(Map<String, String> loginData) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(emailElement));
		emailElement.clear();
		commonEvents.highlight(emailElement);
//		emailElement.sendKeys("capstoneproject4510@gmail.com");
		emailElement.sendKeys(loginData.get("loginmail"));
		passwordElement.clear();
		commonEvents.highlight(passwordElement);
//		passwordElement.sendKeys("Capstone@123");
		passwordElement.sendKeys(loginData.get("password"));
		commonEvents.highlight(loginButtonElement);		
		loginButtonElement.click();
	}
	
	public void validatingLoginPage(Map<String, String> loginData) throws InterruptedException {
//			commonEvents.highlight(loginElement);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(loginElement)).click();
			wait.until(ExpectedConditions.visibilityOf(emailElement));
			emailElement.clear();
			commonEvents.highlight(emailElement);
//			emailElement.sendKeys("capstoneproject4510@gmail.com");
			emailElement.sendKeys(loginData.get("loginmail"));
			passwordElement.clear();
			commonEvents.highlight(passwordElement);
//			passwordElement.sendKeys("Capstone@123");
			passwordElement.sendKeys(loginData.get("password"));
			commonEvents.highlight(loginButtonElement);		
			loginButtonElement.click();
	}
	
	
	
	
}
