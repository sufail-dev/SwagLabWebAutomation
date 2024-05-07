package com.auceSelenium.tests;

import org.testng.annotations.Test;

import com.auceselenium.driver.Driver;
import com.auceselenium.driver.DriverManager;
import com.aucselenium.pages.LoginPage;
import com.aucselenium.utils.ReadPropertyFile;

public final class LoginLogoutTest extends BaseTest{
	private LoginLogoutTest(){
		
	}
	@Test
	public void test3() throws Exception {
		
		LoginPage login=new LoginPage();
		login.enterUserName("standard_user").enterPassword("secret_sauce").clickLoginButton().clickLogoutButton();
}
}