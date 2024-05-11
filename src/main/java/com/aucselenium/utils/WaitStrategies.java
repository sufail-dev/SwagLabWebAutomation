package com.aucselenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auceselenium.driver.DriverManager;
import com.auceselenium.enums.WaitOption;

import auceSelenium.constants.ConstantsAUC;

public class WaitStrategies {

	
	public static WebElement ApplyWait(By by, WaitOption wait) {
		WebElement element=null;
		if(wait==WaitOption.CLICKABLE) {
			element=new WebDriverWait(DriverManager.getDriver(),ConstantsAUC.getExplicitwait()).
			until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(wait==WaitOption.PRESENCE) {
			element=new WebDriverWait(DriverManager.getDriver(),ConstantsAUC.getExplicitwait()).
			until(ExpectedConditions.presenceOfElementLocated(by));
		}
		
		else if(wait==WaitOption.VISIBLE) {
			element=new WebDriverWait(DriverManager.getDriver(),ConstantsAUC.getExplicitwait()).
			until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		
		else if(wait==WaitOption.NONE) {
			element=DriverManager.getDriver().findElement(by);
		}
		
		
		return element;
	}
}
