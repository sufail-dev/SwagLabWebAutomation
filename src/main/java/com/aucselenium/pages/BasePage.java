package com.aucselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auceselenium.driver.DriverManager;
import com.auceselenium.enums.WaitOption;
import com.aucselenium.utils.WaitStrategies;

public class BasePage {
	
	
	
	protected void enterData(By by, String data, WaitOption wait) {
		
		WaitStrategies.ApplyWait(by, wait).sendKeys(data);	
		
	}
	
	protected void clickElement(By by, WaitOption wait) {
		WaitStrategies.ApplyWait(by, wait).click();
	}
	protected void getPageTitile() {
		DriverManager.getDriver().getTitle();
	}

}
