package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	public WebDriver driver;
	
	public FBLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email4")
	public WebElement emailID;

	@FindBy(id = "pass")
	public WebElement password;

	@FindBy(id = "loginbutton")
	public WebElement loginbutton;

	public WebElement email() {
		return emailID;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement loginButton() {
		return loginbutton;
	}

}
