package com.aucselenium.pages;

import org.openqa.selenium.By;

import com.auceselenium.driver.DriverManager;

public class ProductPage {
	
	
	private final By menu=By.id("react-burger-menu-btn");
	private final By logoutLink=By.id("logout_sidebar_link");
	
	
	public void clickLogoutButton() throws InterruptedException {
		Thread.sleep(3000);
		DriverManager.getDriver().findElement(menu).click();
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(logoutLink).click();
		
	}
	
	
	
	
	

}
