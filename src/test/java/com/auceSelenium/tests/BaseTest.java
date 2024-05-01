package com.auceSelenium.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.auceselenium.driver.Driver;

public class BaseTest {
	
	

	
	@BeforeMethod
	public void setUp() {
		Driver.initDriver();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
		
	}
	
	
	
	
	

}
