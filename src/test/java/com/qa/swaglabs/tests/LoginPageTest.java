package com.qa.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.BaseTest;
import com.qa.swaglabs.constants.AppConstants;
import com.qa.swaglabs.errors.AppErrors;
import com.qa.swaglabs.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
   public void verifyLoginPageTitle() {
	String actTitle = loginpage.getLoginpageTitle();
	Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE,AppErrors.TITLE_NOT_FOUND);
		
   }
	@Test(priority=2)
	public void verifyLoginpageUrl() {
		String url=loginpage.getLoginPageURl();
		Assert.assertEquals(url, AppConstants.LOGIN_PAGE_URL,AppErrors.URL_NOT_FOUND);
		
	}
	@Test(priority=3)
	public void verifyDoLogin() {
		invenPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(invenPage.getPageURl(),AppConstants.INVENTORY_PAGE_URL, AppErrors.URL_NOT_FOUND);
				
	}
	
}
