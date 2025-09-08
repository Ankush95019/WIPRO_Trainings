package pages;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class Desktops_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	public Desktops_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		commonEvents = new CommonEvents(driver);
	}
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[@href='/computers']")
	WebElement computerElement;
	
	@FindBy(xpath = "//img[@alt='Picture for category Desktops']")
	WebElement desktopsImageElement;
	
	@FindBy(id = "products-orderby")
	WebElement sortByDropDown;
	
	@FindBy(xpath = "//h2/a[text()='Build your own computer']")
	WebElement buildYourOwnComputerElement;
	
	@FindBy(id = "product_attribute_2")
	WebElement ramSelectElement;
	
	@FindBy(id = "product_attribute_3_7")
	WebElement hddRadioButtonElement;
	
	@FindBy(id = "product_attribute_5_11")
	WebElement acrobatReaderCheckBoxElement;
	
	@FindBy(id = "product_attribute_5_12")
	WebElement totalCommanderCheckBoxElement;
	
	@FindBy(id = "product_enteredQuantity_1")
	WebElement quantityElement;
	
	@FindBy(id = "add-to-cart-button-1")
	WebElement addToCartButtonElement;
	
	@FindBy(xpath = "//div[@data-pictureid='21']/img")
	WebElement productImage2Element;
	
	public void goToDesktops() {
		computerElement.click();
		if(desktopsImageElement.isDisplayed()) {
			desktopsImageElement.click();				
		}
	}
	
//	public void sortBy() {
//		Select select = new Select(sortByDropDown);
//		select.selectByVisibleText("Price: Low to High");
//		
//	}

	
	public boolean clickOnProduct(Map<String, String> expectedProductData) {
//		buildYourOwnComputerElement.click();
		boolean isProductFound = false;
		String actualProductName = buildYourOwnComputerElement.getText();
		System.out.println("Actual Product Name: "+actualProductName);
		if(actualProductName.equals(expectedProductData.get("productName"))) {
			isProductFound = true;
			wait.until(ExpectedConditions.elementToBeClickable(buildYourOwnComputerElement)).click();
		}
		return isProductFound;
	}
	
	public void setSpecificationsAndAddToCart(Map<String, String> expectedProductData) {
		Select select = new Select(ramSelectElement);
		select.selectByVisibleText("8GB [+$60.00]");
		
		productImage2Element.click();
		hddRadioButtonElement.click();
		acrobatReaderCheckBoxElement.click();
		totalCommanderCheckBoxElement.click();
		quantityElement.clear();
		quantityElement.sendKeys(expectedProductData.get("quantity"));
		addToCartButtonElement.click();
	}
	
	
	
	
	

}
