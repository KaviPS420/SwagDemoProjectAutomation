package com.qa.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.BaseTest;
import com.qa.swaglabs.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
   public void verifyLoginPageTitle() {
	String actTitle = loginpage.getLoginpageTitle();
	Assert.assertEquals(actTitle, "Swag Labs");
		
   }
	
}
