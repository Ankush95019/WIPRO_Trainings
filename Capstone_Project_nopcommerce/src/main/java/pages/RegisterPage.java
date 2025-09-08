package pages;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		this.commonEvents = new CommonEvents(driver);
	}
	
	@FindBy(xpath =  "//a[text()='Register']")
	WebElement registerElement;
	
	@FindBy(id = "gender-male")
	WebElement genderElement;
	
	@FindBy(id = "FirstName")
	WebElement firstNameElement;
	
	@FindBy(id = "LastName")
	WebElement lastNameElement;
	
	@FindBy(name = "Email")
	WebElement emailElement;
	
	@FindBy(id = "Password")
	WebElement passwordElement;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordElement;
	
	@FindBy(id = "register-button")
	WebElement registerButtonElement;
	
	@FindBy(id = "Email-error")
	WebElement emailErrorElement;
	
	@FindBy(id = "FirstName-error")
	WebElement firstNameErrorElement;
	
	By registrationCompletedElement = By.xpath("//div[text()='Your registration completed']");
	
	By alreadyRegisteredElement = By.xpath("//li[text()='The specified email already exists']");
	
	@FindBy(xpath =  "//a[@href='/logout']")
	WebElement logoutElement;

	
	public void validatingRegisterPage(Map<String, String> registeredData) {
		wait.until(ExpectedConditions.visibilityOf(registerElement));
		commonEvents.highlight(registerElement);
		registerElement.click();
		wait.until(ExpectedConditions.visibilityOf(genderElement));
		commonEvents.highlight(genderElement);
		genderElement.click();
		firstNameElement.clear();
		commonEvents.highlight(firstNameElement);
//		firstNameElement.sendKeys("TesterABC");
		firstNameElement.sendKeys(registeredData.get("firstname"));
		lastNameElement.clear();
		commonEvents.highlight(lastNameElement);
//		lastNameElement.sendKeys("XYZ");
		lastNameElement.sendKeys(registeredData.get("lastname"));
		emailElement.clear();
		commonEvents.highlight(emailElement);
//		emailElement.sendKeys("capstoneproject4510@gmail.com");
		emailElement.sendKeys(registeredData.get("email"));
		passwordElement.clear();
		commonEvents.highlight(passwordElement);
//		passwordElement.sendKeys("Capstone@123");
		passwordElement.sendKeys(registeredData.get("password"));
		confirmPasswordElement.clear();
		commonEvents.highlight(confirmPasswordElement);
//		confirmPasswordElement.sendKeys("Capstone@123");
		confirmPasswordElement.sendKeys(registeredData.get("confirm password"));
		commonEvents.highlight(registerButtonElement);		
		registerButtonElement.click();
		
		
		// edge case
		try {
			// Check for registration success
			WebElement successMessage = wait.until(ExpectedConditions.presenceOfElementLocated(registrationCompletedElement));
			if (successMessage.isDisplayed()) {
				System.out.println("Registration successful.");
				WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(logoutElement));
				logoutBtn.click();
			}
		} catch (Exception ignored) {
	}

		
		// negative edge test 
		try {
			// Check if email already exists
			WebElement emailExistsMessage = wait.until(ExpectedConditions.presenceOfElementLocated(alreadyRegisteredElement));
			if (emailExistsMessage.isDisplayed()) {
				System.out.println("Email already exists.");
				WebElement alreadyRegisteredMessage = wait.until(ExpectedConditions.elementToBeClickable(alreadyRegisteredElement));
				commonEvents.highlight(alreadyRegisteredMessage);
			}
		} catch (Exception ignored) {
			System.out.println("Neither success nor email-exists message appeared.");
		}		
	}
	
//	public String registerWithEpmtyFields() {
//		registerElement.click();
//		registorButtonElement.click();
//		wait.until(ExpectedConditions.visibilityOf(firstNameErrorElement));
//		System.out.println("first name debug: "+firstNameErrorElement.getText());
//		return firstNameErrorElement.getText();
//	}
	
	
	
	
	
}
