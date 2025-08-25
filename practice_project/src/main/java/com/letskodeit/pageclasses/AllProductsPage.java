package com.letskodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProductsPage {
	
	public AllProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver driver;
	private final String URL = "https://tutorialsninja.com/demo/index.php?route=product/category&path=24";
	private String ALL_PHONES_LINK = "(//a[contains(text(),'Phones & PDAs')])[1]" ;
	
	public void open() {
		driver.findElement(By.xpath(ALL_PHONES_LINK)).click();
	}
	
	public boolean isOpen() {
		return URL.equalsIgnoreCase(driver.getCurrentUrl());
	}
	
}
