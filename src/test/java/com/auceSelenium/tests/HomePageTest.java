package com.auceSelenium.tests;

import org.testng.annotations.Test;

import com.auceselenium.driver.Driver;
import com.auceselenium.driver.DriverManager;
import com.aucselenium.utils.ReadPropertyFile;

public final class HomePageTest extends BaseTest{
	private HomePageTest(){
		
	}
	@Test
	public void test3() throws Exception {
		
		DriverManager.getDriver().get(ReadPropertyFile.get("url"));
		
	}
}
