package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FreeCRMHomePage {
	WebDriver driver;
	
	public FreeCRMHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		boolean checkHomePageReadyness = driver.findElement(By.xpath("//div[@class='right menu']/span[1]")).isDisplayed();
		Assert.assertTrue(checkHomePageReadyness, "Home Page is not displayed");
		
	}
	
	@FindBy(css="span[class='user-display']")
	WebElement userProfile;
	
	@FindBy(css="div[id='main-nav'] a")
	WebElement mainNav;
	
	@FindBy(xpath="//div[@class='right menu']/span[1]")
	WebElement loggedInUserName;
	

}
