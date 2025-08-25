package com.letskodeit.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebDriver driver;
	private String MY_ACCOUNT_LINK = "//span[contains(text(),'My Account')]";
	private String LOGIN_LINK = "//a[contains(text(),'Login')]";
	private String EMAIL_FIELD = "input-email";
	private String PASSWORD_FIELD = "input-password";
	private String lOG_IN_BUTTON = "//input[@value='Login']";
	
	public void open() {
		driver.findElement(By.xpath(MY_ACCOUNT_LINK)).click();
		driver.findElement(By.xpath(LOGIN_LINK)).click();
	}
	
	public void signInWith(String email,String password) {
		WebElement emailField = driver.findElement(By.id(EMAIL_FIELD));
		emailField.clear();
		emailField.sendKeys(email);
		
		WebElement passwordField = driver.findElement(By.id(PASSWORD_FIELD));
		passwordField.clear();
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath(lOG_IN_BUTTON));
		loginButton.click();
	
	}
	
}
