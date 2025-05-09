package com.qa.swaglabs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	WebDriver driver;
	
	
	//Creating Page object using By locater
	private By logo = By.xpath("//div[@class ='app_logo']");
	private By cartLink = By.xpath("//a[@class ='shopping_cart_link']");
	private By menu = By.id("react-burger-menu-btn");
	private By logout = By.id("logout_sidebar_link");
	private By header = By.xpath("//span[@class='title']");
	
	public inventoryPage(WebDriver driver) {
		this.driver=  driver;
	}
	
	
	// Page Action methods 
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("This is login page title" + title);
		return title;
	}
	public String getPageURl() {
		String url=driver.getCurrentUrl();
		System.out.println("This is Login page current url= " + url);
		return url;
	}
	
	public String getLogo() {
		String llogo = driver.findElement(logo).getText();
		System.out.println(llogo);
		return llogo;
	}
	public boolean cartLink() {
		return driver.findElement(cartLink).isDisplayed();
		
	}
	
	public String header() {
		String pageHeader = driver.findElement(header).getText();
		System.out.println("This is page Header = " + pageHeader);
		return pageHeader;
	}
	public boolean menu() {
		return driver.findElement(menu).isDisplayed();
	}
	
	

}
