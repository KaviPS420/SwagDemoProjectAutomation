package com.qa.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.BaseTest;
import com.qa.swaglabs.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
   public void verifyLoginPageTitle() {
	String actTitle = loginpage.getLoginpageTitle();
	Assert.assertEquals(actTitle, "Swag Labs");
		
   }
	@Test(priority=2)
	public void verifyLoginpageUrl() {
		String url=loginpage.getLoginPageURl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
		
	}
	@Test(priority=3)
	public void verifyDoLogin() {
		String land = loginpage.doLogin("standard_user", "secret_sauce");
		Assert.assertEquals(land, "Swag Labs") ;		
	}
	
}
