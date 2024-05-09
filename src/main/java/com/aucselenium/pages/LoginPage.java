package com.aucselenium.pages;

import org.openqa.selenium.By;

public final class LoginPage extends BasePage{
	
	private final By usernameField=By.xpath("//*[@id='user-name']");
	private final By passwordField=By.xpath("//*[@id='password']");
	private final By loginButton=By.xpath("//*[@id='login-button']");

	public LoginPage enterUserName(String userName) {
		enterData(usernameField,userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		enterData(passwordField,password);
		return this;
	}
	public ProductPage clickLoginButton() {
		clickElement(loginButton);
		return new ProductPage();
	}
}
