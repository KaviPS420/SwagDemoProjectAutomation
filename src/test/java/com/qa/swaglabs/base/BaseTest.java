package com.qa.swaglabs.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.swaglabs.factory.DriverFactory;
import com.qa.swaglabs.pages.LoginPage;

public class BaseTest {
	DriverFactory df;
	protected Properties prop;
	protected WebDriver driver;
	protected LoginPage loginpage;
	
	
	
	@BeforeTest
	public void setup() {
		df= new DriverFactory();
		prop = df.initPro();
		driver = df.intiDriver(prop);
		loginpage = new LoginPage(driver);
	}

	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
