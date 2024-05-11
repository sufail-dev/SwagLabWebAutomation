package com.auceselenium.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aucselenium.utils.ReadPropertyFile;

import auceSelenium.constants.ConstantsAUC;

public class Driver {
	
	private Driver() {}
	

	
	
	public static void initDriver() throws Exception {
		
	
		if(Objects.isNull(DriverManager.getDriver())) {
		System.setProperty("webdriver.chrome.driver", ConstantsAUC.getChromedriver());
		WebDriver driver=new ChromeDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get(ReadPropertyFile.get("url"));
		DriverManager.getDriver().manage().window().maximize();
		}
	}
	
	
	public static void closeDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
		DriverManager.unload();
		}
	}

}
