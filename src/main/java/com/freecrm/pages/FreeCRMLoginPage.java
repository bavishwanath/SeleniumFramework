package com.freecrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMLoginPage {

	WebDriver driver;
	FreeCRMHomePage freeCRMHomePage;
	
	public FreeCRMLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement username1;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(css="div[class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	public void login(String username, String password) {
		username1.sendKeys(username);
		password1.sendKeys(password);
		loginButton.click();
		
	}

	
	
	
	
	
	
	
}
