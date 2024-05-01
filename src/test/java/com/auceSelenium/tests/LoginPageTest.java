package com.auceSelenium.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.auceselenium.driver.Driver;
import com.auceselenium.driver.DriverManager;
import com.aucselenium.utils.ReadPropertyFile;


public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest() {}
	
	
	
	@Test
	public void test1() throws Exception {
		DriverManager.getDriver().get(ReadPropertyFile.get("url"));
		DriverManager.getDriver().findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		DriverManager.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		DriverManager.getDriver().findElement(By.xpath("//*[@id='login-button']")).click();	
	}
	
	
	
	
	

}
