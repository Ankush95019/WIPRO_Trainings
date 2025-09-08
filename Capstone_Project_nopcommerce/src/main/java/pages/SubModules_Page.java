package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonEvents;

public class SubModules_Page {
	WebDriver driver;
	WebDriverWait wait;
	CommonEvents commonEvents;
	
	By subModulesElementsLocator = By.xpath("//ul[@class='top-menu notmobile']/li");
	
	public SubModules_Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		commonEvents = new CommonEvents(driver);
	}
	
	public boolean verifySubModules() {
		List<WebElement> subModulesElements = driver.findElements(subModulesElementsLocator);
		System.out.println("Number of SubModules: "+subModulesElements.size());
		for(WebElement subModuleElement: subModulesElements) {
			commonEvents.highlight(subModuleElement);
		}
		if(subModulesElements.isEmpty()) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
}
