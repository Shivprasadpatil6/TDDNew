package com.sd.TestLayer;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sd.PageLayer.LoginPage;
import com.sd.TestBase.TestBase;
import com.sd.utilities.UtilClass;

public class LoginPageTest extends TestBase

{
     @Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
    	
    	 String Expected_output = "https://www.saucedemo.com/inventory.html";
		LoginPage login_obj=new LoginPage(driver);
		UtilClass util_obj=new UtilClass(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.ClickOnLogin();
		Thread.sleep(5000);
		
		String ActualTitle=driver.getCurrentUrl();
		String ExpectedTitle = "https://www.saucedemo.com/inventory.htm";
      	 Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		
		
	}
     
	
	
	
	

}
