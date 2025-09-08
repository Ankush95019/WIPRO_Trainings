package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class Computers_Page {
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	public Computers_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		commonEvents = new CommonEvents(driver);
	}
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[@href='/computers']")
	WebElement computerElement;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/desktops']")
	WebElement desktopElement;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/notebooks']")
	WebElement notebooksElement;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/software']")
	WebElement softwareElement;
	
	By onHoverComptersSubElementsListLocator = By.xpath("//ul[@class='top-menu notmobile']//ul[@class='sublist first-level']");
	
	
	
	public void verifyHoverOnComputers() throws InterruptedException {
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(computerElement));
		
		commonEvents.highlight(computerElement);
		actions.moveToElement(computerElement).perform();
		Thread.sleep(500);
		
		List<WebElement> onHoverComputersSubElementsList = driver.findElements(onHoverComptersSubElementsListLocator);
//		onHoverComptersSubElementsList.size();
		
		for(WebElement onHoverComputersSubElement: onHoverComputersSubElementsList) {
			commonEvents.highlight(onHoverComputersSubElement);
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}

		// two time Arrow Up
		
		commonEvents.highlight(softwareElement);
		Thread.sleep(500);
		commonEvents.highlight(notebooksElement);
		actions.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		commonEvents.highlight(desktopElement);
//		actions.sendKeys(Keys.RETURN).perform();
//		wait.until(isTrue)
		
		
	}
	
	
	
}
