package com.aucselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auceselenium.driver.DriverManager;

public class BasePage {
	
	
	
	protected void enterData(By by, String data) {
		DriverManager.getDriver().findElement(by).sendKeys(data);
	}
	
	protected void clickElement(By by) {
		explicitlyWaitForElement(by);
		DriverManager.getDriver().findElement(by).click();
	}
	protected void getPageTitile() {
		DriverManager.getDriver().getTitle();
	}
	
	
	private void explicitlyWaitForElement(By by) {
		new WebDriverWait(DriverManager.getDriver(),10).until(
				ExpectedConditions.elementToBeClickable(by));
	}
	
	
	
	
	
	

}
