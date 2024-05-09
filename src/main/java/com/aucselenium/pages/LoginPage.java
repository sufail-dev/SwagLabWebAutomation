package com.aucselenium.pages;

import org.openqa.selenium.By;

import com.auceselenium.driver.DriverManager;


public final class LoginPage{
	
	private final By usernameField=By.xpath("//*[@id='user-name']");
	private final By passwordField=By.xpath("//*[@id='password']");
	private final By loginButton=By.xpath("//*[@id='login-button']");
	
	
	
	public LoginPage enterUserName(String userName) {
		System.out.println("username");
		DriverManager.getDriver().findElement(usernameField).sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		DriverManager.getDriver().findElement(passwordField).sendKeys(password);
		return this;
	}
	public ProductPage clickLoginButton() {
		DriverManager.getDriver().findElement(loginButton).click();	
		return new ProductPage();
	}
}
