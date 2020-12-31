package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

public class ScreenShotOnFailure implements ITestListener {

	static WebDriver driver;

	public static void captureScreenshot(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dstPath = System.getProperty("user.dir") + "\\screenshots\\" + testCaseName;
		File dst = new File(dstPath);
		FileHandler.copy(src, dst);
	}

}
