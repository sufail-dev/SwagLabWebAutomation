package com.aucselenium.pages;

import org.openqa.selenium.By;

import com.auceselenium.enums.WaitOption;

public final class LoginPage extends BasePage{
	
	private final By usernameField=By.xpath("//*[@id='user-name']");
	private final By passwordField=By.xpath("//*[@id='password']");
	private final By loginButton=By.xpath("//*[@id='login-button']");

	public LoginPage enterUserName(String userName) {
		enterData(usernameField,userName, WaitOption.PRESENCE);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		enterData(passwordField,password,WaitOption.PRESENCE);
		return this;
	}
	public ProductPage clickLoginButton() {
		clickElement(loginButton,WaitOption.NONE);
		return new ProductPage();
	}
}
