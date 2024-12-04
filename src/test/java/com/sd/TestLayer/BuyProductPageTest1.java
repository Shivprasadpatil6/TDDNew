package com.sd.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sd.PageLayer.BuyProductPage1;
import com.sd.PageLayer.LoginPage;
import com.sd.TestBase.TestBase;
import com.sd.utilities.UtilClass;

public class BuyProductPageTest1 extends TestBase 
{
	
	
	@Test
	public void BuyProductFunctinality() throws InterruptedException {
		
		LoginPage login_obj=new LoginPage(driver);
		UtilClass util_obj=new UtilClass(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.ClickOnLogin();
		Thread.sleep(5000);
		BuyProductPage1 buy_prod_obj1=new BuyProductPage1(driver);
		buy_prod_obj1.Backpack();
		buy_prod_obj1.Cartlink();
		buy_prod_obj1.Checkout();
		buy_prod_obj1.FirstName("shivam");
		buy_prod_obj1.LastName("pawar");
		buy_prod_obj1.PinCode("424672");
		buy_prod_obj1.ContinueButton();
		buy_prod_obj1.FinishButton();
		String ActualTitle=driver.getCurrentUrl();
		String ExpectedTitle = "https://www.saucedemo.com/checkout-complete.html";
      	 Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		
	}
	
	
}
