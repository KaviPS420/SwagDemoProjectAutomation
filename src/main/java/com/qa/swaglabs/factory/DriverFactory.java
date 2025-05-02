package com.qa.swaglabs.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.swaglabs.errors.AppErrors;
import com.qa.swaglabs.exceptions.BrowserExceptions;

public class DriverFactory {

	WebDriver driver;
	Properties prop;
	
	public WebDriver intiDriver(Properties prop) {
		//Cross browser logic 
		//String browserName = prop.getProperty("browser");
		
		String browserName = prop.getProperty("browser");
		System.out.println("browser name is : " + prop);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser name..." + browserName);
			throw new BrowserExceptions(AppErrors.BROWSER_NOT_FOUND);
		
	}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		return driver;
		
		
		
		
		}
	//Init prop and return prop
	public Properties initPro() {
		//cross property or Env logic 
		prop = new Properties();
		try {
			FileInputStream ip= new FileInputStream("./src/test/resource/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
			
		}

		

		
}
	
	
	

	
	
	

