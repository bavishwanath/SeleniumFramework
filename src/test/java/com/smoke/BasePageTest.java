package com.smoke;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.FBLoginPage;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BasePageTest extends TestBase {

	

	@Test (timeOut = 300000)
	public void basePageTitleTest() throws IOException, InterruptedException {
		driver = initializeDriver();
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String baseUrl = properties.getProperty("url");
		String expectedTitle = "Facebook – log in or sign";
		
		
		//Screenshot screenshot = new AShot().takeScreenshot(driver);
		//Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(screenshot.getImage(), "jpg", new File(".\\screenshot\\fullimage.jpg"));
		
		driver.get(baseUrl);
		//driver.get("https://www.google.com/");
		//driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("i love internet explorer", Keys.ENTER);
		Thread.sleep(5000);
		
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); String dstPath =
		 * System.getProperty("user.dir") + "\\screenshots\\basePageTitleTest2.png";
		 * String dstPath1 = System.getProperty("user.dir") +
		 * "\\screenshots\\basePageTitleTest3.png"; System.out.println(dstPath); File
		 * dst = new File(dstPath); FileHandler.copy(src, dst);
		 */
		
		String path3 = "Strings arenot attached to";
		
		String dstPath1 = System.getProperty("user.dir") + "\\screenshots\\basePageTitleTest6.png";
		String dstPath2 = System.getProperty("user.dir") + "\\screenshots\\basePageTitleTest7.png";
		String dstPath3 = System.getProperty("user.dir") + "\\screenshots\\basePageTitleTest8.png";
		// last visible part is viewvable rest all black screenshot
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		// part 2 
		//Screenshot screenshot = new AShot().takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File(dstPath1));
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot1.getImage(), "jpg", new File(dstPath2));
		Screenshot screenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot2.getImage(), "jpg", new File(dstPath3));
		
		System.out.println("enting the mai zone");
		//Assert.assertEquals(actualTitle, expectedTitle);

		

	}

	

}
