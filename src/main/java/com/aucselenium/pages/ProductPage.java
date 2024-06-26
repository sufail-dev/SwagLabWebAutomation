package com.aucselenium.pages;

import org.openqa.selenium.By;

import com.auceselenium.enums.WaitOption;

public class ProductPage extends BasePage {
	
	
	private final By menu=By.id("react-burger-menu-btn");
	private final By logoutLink=By.id("logout_sidebar_link");
		
	public void clickLogoutButton(){
		clickElement(menu,WaitOption.PRESENCE);
		clickElement(logoutLink,WaitOption.VISIBLE);
	}

}
