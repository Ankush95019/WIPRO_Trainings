package pages;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class Checkout_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	public Checkout_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		commonEvents = new CommonEvents(driver);
	}
	
		
	@FindBy(id = "termsofservice")
	WebElement termsOfServiceElement;
	
	
	@FindBy(id = "checkout")
	WebElement checkoutButtonElement;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/button[@name='save']")
	WebElement continueButton1Element;
	
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button[text()='Continue']")
	WebElement continueButton2Element;
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/button[text()='Continue']")
	WebElement continueButton3Element;
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/button[text()='Continue']")
	WebElement continueButton4Element;
	
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/button[text()='Confirm']")
	WebElement confirmButtonElement;
	
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement billingAddressCountryElement;
	
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	WebElement billingAddressStateElement;
	
	@FindBy(id = "BillingNewAddress_City")
	WebElement billingAddressCityElement;
	
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement billingAddress1Element;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement billingZipCodeElement;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement billingAPhoneNumberElement;
	
	
	
	public void checkoutValidation() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", termsOfServiceElement);
		termsOfServiceElement.click();
		commonEvents.highlight(checkoutButtonElement);
		checkoutButtonElement.click();
	}
	
	public void billingAddresValidation(Map<String, String> checkoutData) throws InterruptedException {
		Thread.sleep(1000);
		Select countrySelect = new Select(wait.until(ExpectedConditions.elementToBeClickable(billingAddressCountryElement)));
		countrySelect.selectByVisibleText("India");
		Thread.sleep(1000);
		Select stateSelect = new Select(wait.until(ExpectedConditions.elementToBeClickable(billingAddressStateElement)));
		stateSelect.selectByVisibleText("Delhi");
		billingAddressCityElement.clear();
		billingAddressCityElement.sendKeys(checkoutData.get("city"));
		
		billingAddress1Element.clear();
		billingAddress1Element.sendKeys(checkoutData.get("address"));
		
		billingZipCodeElement.clear();
		billingZipCodeElement.sendKeys(checkoutData.get("zipcode"));
		
		billingAPhoneNumberElement.clear();
		billingAPhoneNumberElement.sendKeys(checkoutData.get("phoneNo"));
		
		wait.until(ExpectedConditions.elementToBeClickable(continueButton1Element)).click();
		wait.until(ExpectedConditions.elementToBeClickable(continueButton2Element)).click();
		wait.until(ExpectedConditions.elementToBeClickable(continueButton3Element)).click();
		wait.until(ExpectedConditions.elementToBeClickable(continueButton4Element)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmButtonElement)).click();
		
	}
	

}
