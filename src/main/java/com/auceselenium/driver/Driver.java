package com.auceselenium.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import auceSelenium.constants.ConstantsAUC;

public class Driver {
	
	private Driver() {}
	

	
	
	public static void initDriver() {
		
	
		if(Objects.isNull(DriverManager.getDriver())) {
		System.setProperty("webdriver.chrome.driver", ConstantsAUC.getChromedriver());
		WebDriver driver=new ChromeDriver();
		DriverManager.setDriver(driver);
		}
	}
	
	
	public static void closeDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
		DriverManager.unload();
		}
	}

}
