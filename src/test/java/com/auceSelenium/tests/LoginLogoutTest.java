package com.auceSelenium.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.auceselenium.driver.Driver;
import com.auceselenium.driver.DriverManager;
import com.aucselenium.pages.LoginPage;
import com.aucselenium.utils.ReadPropertyFile;

public final class LoginLogoutTest extends BaseTest{
	private LoginLogoutTest(){
		
	}
	@Test(dataProvider="LoginTestDataProvider")
	public void test3(String username, String password) throws Exception {
		
		LoginPage login=new LoginPage();
		login.enterUserName(username).enterPassword(password).clickLoginButton().clickLogoutButton();
}
	@DataProvider (name="LoginTestDataProvider",parallel=true) 
	public Object[][] getData(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"sufail","sulaiman"},
			{"problem_user","secret_sauce"},
			{"sshsjjs","bsjdskjd"}
		};
	}
	
	
	
}