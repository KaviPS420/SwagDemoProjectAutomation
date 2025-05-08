package com.qa.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	inventoryPage inpage ;
	
	//Creating page object using By locater 
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By login = By.id("login-button");
	
	//Creating constructer 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Page action 
	
	public String getLoginpageTitle() {
		String title = driver.getTitle();
		System.out.println("This is login page title" + title);
		return title;
	}
	public String getLoginPageURl() {
		String url=driver.getCurrentUrl();
		System.out.println("This is Login page current url= " + url);
		return url;
	}
	
	public inventoryPage doLogin(String uname , String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		return new inventoryPage(driver);
	}
	 
	
	
	
}
