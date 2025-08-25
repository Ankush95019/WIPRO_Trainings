package com.letskodeit.pageclasses;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebDriver driver;
	private String URL = "search=";
//	private String PRODUCT_LIST = "//div[@class='product-thumb']";
	private String PRODUCT_LIST = ".product-thumb";
	
	public boolean isOpen() {
		return driver.getCurrentUrl().contains(URL);
	}
	
	
	public int productCount() {
		List<WebElement> productList = driver.findElements(By.cssSelector(PRODUCT_LIST));
		return productList.size();
	}
	
	
	public boolean verifySearchResult() {
		boolean result = false;
		if(productCount() > 0) {
			result = true;
		}
		result = isOpen() && result;
		return result;
 	}
	
	
	
}
