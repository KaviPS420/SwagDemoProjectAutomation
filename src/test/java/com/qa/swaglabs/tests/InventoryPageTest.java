package com.qa.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.BaseTest;
import com.qa.swaglabs.constants.AppConstants;
import com.qa.swaglabs.errors.AppErrors;

public class InventoryPageTest extends BaseTest {
	
	@BeforeClass
	public void accSetup() {
		invenPage = loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password") );
		
	}
	
	@Test(priority =1)
	public void getPageTitleTest() {
		Assert.assertEquals(invenPage.getPageTitle(), AppConstants.INVENTORY_PAGE_TITLE,AppErrors.TITLE_NOT_FOUND);
	}
	
	@Test(priority =2)
	public void getPageURlTest() {
		Assert.assertEquals(invenPage.getPageURl(), AppConstants.INVENTORY_PAGE_URL, AppErrors.URL_NOT_FOUND);
		
	}
	
	@Test(priority =3)
	public void getLogoTest() {
		Assert.assertEquals(invenPage.getLogo(),AppConstants.INVENTORY_PAGE_LOGO , AppErrors.INVENTORY_PAGE_LOGO_NOT_FOUND);
	}
    
	@Test(priority =4)
	public void verifycartLink() {
		boolean result = invenPage.cartLink();
		Assert.assertTrue(result);
	}
	@Test(priority =5)
	public void verifyheader() {
		Assert.assertEquals(invenPage.header(), "Products" , AppErrors.HEADER_NOT_FOUND);
		
	}
	@Test(priority =6)
	public void verifymenu() {
		boolean result = invenPage.menu();
		Assert.assertTrue(result);
		
		
	}
	
	
}
