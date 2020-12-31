package com.freecrm.smoke;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.freecrm.pages.FreeCRMHomePage;
import com.freecrm.pages.FreeCRMLoginPage;

public class LoginTest extends TestBase {
	FreeCRMLoginPage freeCRMLoginPage;
	FreeCRMHomePage freeCRMHomePage;
	
	
	
	String userName = "vishwa854@gmail.com";
	String password = "Dare@sj941*";
	
	
	
	
	@Test
	public void login2FreeCRMTest() throws IOException {
		driver = initializeDriver();
		driver.get("https://ui.freecrm.com/");
		freeCRMLoginPage = new FreeCRMLoginPage(driver);
		freeCRMLoginPage.login(userName, password);
		
	}

}
