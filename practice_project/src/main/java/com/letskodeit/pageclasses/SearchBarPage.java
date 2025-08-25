package com.letskodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarPage {
	
	public SearchBarPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver driver;
	private String SEARCH_PRODUCT_FIELD = "//input[@name='search']";
	private String SEARCH_PRODUCT_BUTTON = "//button[@class='btn btn-default btn-lg']" ;
	
	public ResultsPage product(String productname) {
		WebElement searchField = driver.findElement(By.xpath(SEARCH_PRODUCT_FIELD));
		searchField.clear();
		searchField.sendKeys(productname);;
		
		WebElement searchButton = driver.findElement(By.xpath(SEARCH_PRODUCT_BUTTON));
		searchButton.click();
		
		return new ResultsPage(driver);
	}
	
}
